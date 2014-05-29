(ns http-kit-perf.core
  (:require [org.httpkit.server :as httpkit]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(defn -main[& args]
  (httpkit/run-server app
                      {:port 9876})
  (println "Running at address http://localhost:9876")
  )
