{:namespaces
 ({:doc
   "Functions/macros variants of the ones that can be found in clojure.core \n(note to other contrib members: feel free to add to this lib)",
   :author "Laurent Petit (and others)",
   :name "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator/clojure.core.incubator-api.html",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj"}
  {:doc "Compile-time string interpolation for Clojure.",
   :author "Chas Emerick",
   :name "clojure.core.strint",
   :wiki-url
   "http://clojure.github.io/core.incubator/clojure.core.strint-api.html",
   :source-url
   "https://github.com/clojure/core.incubator/blob/98672b9f627631215b47744fe193550f389d1095/src/main/clojure/clojure/core/strint.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "-?>",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L30",
   :line 30,
   :deprecated "0.1.3",
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "DEPRECATED: use clojure.core/some-> instead.\n\nSame as clojure.core/-> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?> \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(-?> nil .toUpperCase (.substring 1)) returns nil\n",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/-?>"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "-?>>",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L49",
   :line 49,
   :deprecated "0.1.3",
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "DEPRECATED: use clojure.core/some->> instead.\n\n Same as clojure.core/->> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\n Examples :\n (-?>> (range 5) (map inc)) returns (1 2 3 4 5)\n (-?>> [] seq (map inc)) returns nil\n ",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/-?>>"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name ".?.",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L41",
   :line 41,
   :var-type "macro",
   :arglists ([x form] [x form & forms]),
   :doc
   "Same as clojure.core/.. but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(.?. \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(.?. nil .toUpperCase (.substring 1)) returns nil\n",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/.?."}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "defmacro-",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L17",
   :line 17,
   :var-type "macro",
   :arglists ([name & decls]),
   :doc "Same as defmacro but yields a private definition",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/defmacro-"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "dissoc-in",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L63",
   :line 63,
   :var-type "function",
   :arglists ([m [k & ks :as keys]]),
   :doc
   "Dissociates an entry from a nested associative structure returning a new\nnested structure. keys is a sequence of keys. Any empty maps that result\nwill not be present in the new structure.",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/dissoc-in"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "new-by-name",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L77",
   :line 77,
   :var-type "function",
   :arglists ([class-name & args]),
   :doc
   "Constructs a Java object whose class is specified by a String.",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/new-by-name"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj",
   :name "seqable?",
   :file "src/main/clojure/clojure/core/incubator.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/0a3b741c2757ff77cfaf2bf774bdc9cf407944cf/src/main/clojure/clojure/core/incubator.clj#L84",
   :line 84,
   :deprecated "0.1.4",
   :var-type "function",
   :arglists ([x]),
   :doc
   "DEPRECATED: use clojure.core/seqable? as of Clojure 1.9.0-alpha5.\n\nReturns true if (seq x) will succeed, false otherwise.",
   :namespace "clojure.core.incubator",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/seqable?"}
  {:raw-source-url
   "https://github.com/clojure/core.incubator/raw/98672b9f627631215b47744fe193550f389d1095/src/main/clojure/clojure/core/strint.clj",
   :name "<<",
   :file "src/main/clojure/clojure/core/strint.clj",
   :source-url
   "https://github.com/clojure/core.incubator/blob/98672b9f627631215b47744fe193550f389d1095/src/main/clojure/clojure/core/strint.clj#L49",
   :line 49,
   :var-type "macro",
   :arglists ([& strings]),
   :doc
   "Accepts one or more strings; emits a `str` invocation that concatenates\nthe string data and evaluated expressions contained within that argument.\nEvaluation is controlled using ~{} and ~() forms. The former is used for\nsimple value replacement using clojure.core/str; the latter can be used to\nembed the results of arbitrary function invocation into the produced string.\n\nExamples:\n  user=> (def v 30.5)\n  #'user/v\n  user=> (<< \"This trial required ~{v}ml of solution.\")\n  \"This trial required 30.5ml of solution.\"\n  user=> (<< \"There are ~(int v) days in November.\")\n  \"There are 30 days in November.\"\n  user=> (def m {:a [1 2 3]})\n  #'user/m\n  user=> (<< \"The total for your order is $~(->> m :a (apply +)).\")\n  \"The total for your order is $6.\"\n  user=> (<< \"Just split a long interpolated string up into ~(-> m :a (get 0)), \"\n           \"~(-> m :a (get 1)), or even ~(-> m :a (get 2)) separate strings \"\n           \"if you don't want a << expression to end up being e.g. ~(* 4 (int v)) \"\n           \"columns wide.\")\n  \"Just split a long interpolated string up into 1, 2, or even 3 separate strings if you don't want a << expression to end up being e.g. 120 columns wide.\"\n  \nNote that quotes surrounding string literals within ~() forms must be\nescaped.",
   :namespace "clojure.core.strint",
   :wiki-url
   "http://clojure.github.io/core.incubator//clojure.core.strint-api.html#clojure.core.strint/<<"})}
