(ns hipstr.models.connection
  (:require [environ.core :refer [env]]))

(def db-spec ~(get (System/getenv) "DATABASE_URL"))
;{


	;:classname   "org.postgresql.Driver"
              ;:subprotocol "postgresql"
              ;;:subname     "postgres"
	      	  ;:subname "//ec2-107-22-170-249.compute-1.amazonaws.com:5432/d3qe27609gdkmm"
              ;:user        (or (System/getenv "JDBC_DATABASE_USERNAME") "hipstr")
              ;:password    (or (System/getenv "JDBC_DATABASE_PASSWORD") "hipstr")})

	;		  :subprotocol "xx"
	;      	  :subname (env :database-url)
    ;          :user        (env :jdbc-database-username)
;			  :password    (env :jdbc-database-password)})
