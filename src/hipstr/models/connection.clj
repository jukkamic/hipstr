(ns hipstr.models.connection
  (:require [environ.core :refer [env]]))

(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              ;;:subname     "postgres"
	      ;:subname "//ec2-107-22-170-249.compute-1.amazonaws.com:5432/d3qe27609gdkmm"
	      	  :subname (System/getenv "JDBC_DATABASE_URL")
              :user        (or (System/getenv "JDBC_DATABASE_USERNAME") "hipstr")
              :password    (or (System/getenv "JDBC_DATABASE_PASSWORD") "hipstr")})
