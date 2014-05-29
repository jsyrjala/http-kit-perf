(defproject http-kit-perf "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.18"]
                 [ring/ring-devel "1.2.2"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-json "0.3.1"]
                 [compojure "1.1.8"]
                 ]
  :main http-kit-perf.core)
