(ns silent.Reflect
  (:gen-class
    :extends com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategy))


(defn -wrapCallable [_ c]
  (println "wrapping")
  (fn []
    (println "calling")
    (.call c)))
