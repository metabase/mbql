(ns expectations
  (:require [clojure.test :as t]))

(defmacro ^:deprecated expect
  ([actual]
   `(expect true (boolean ~actual)))

  ([expected actual]
   `(t/deftest ~(symbol (format "expect-%s" (hash &form)))
      (t/is (= ~expected ~actual)))))
