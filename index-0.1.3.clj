{:namespaces
 ({:source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator/clojure.core.incubator-api.html",
   :name "clojure.core.incubator",
   :author "Laurent Petit (and others)",
   :doc
   "Functions/macros variants of the ones that can be found in clojure.core \n(note to other contrib members: feel free to add to this lib)"}
  {:source-url
   "https://github.com/clojure/core.incubator/blob/9f2590f2cf22c37ba66010983bf6eaf21a90084c/src/main/clojure/clojure/core/strint.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator/clojure.core.strint-api.html",
   :name "clojure.core.strint",
   :author "Chas Emerick",
   :doc "Compile-time string interpolation for Clojure."}),
 :vars
 ({:arglists ([x form] [x form & forms]),
   :name "-?>",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L29",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/-?>",
   :doc
   "Same as clojure.core/-> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?> \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(-?> nil .toUpperCase (.substring 1)) returns nil\n",
   :var-type "macro",
   :line 29,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([x form] [x form & forms]),
   :name "-?>>",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L45",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/-?>>",
   :doc
   "Same as clojure.core/->> but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(-?>> (range 5) (map inc)) returns (1 2 3 4 5)\n(-?>> [] seq (map inc)) returns nil\n",
   :var-type "macro",
   :line 45,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([x form] [x form & forms]),
   :name ".?.",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L37",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/.?.",
   :doc
   "Same as clojure.core/.. but returns nil as soon as the threaded value is nil itself (thus short-circuiting any pending computation).\nExamples :\n(.?. \"foo\" .toUpperCase (.substring 1)) returns \"OO\"\n(.?. nil .toUpperCase (.substring 1)) returns nil\n",
   :var-type "macro",
   :line 37,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([name & decls]),
   :name "defmacro-",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L16",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/defmacro-",
   :doc "Same as defmacro but yields a private definition",
   :var-type "macro",
   :line 16,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([m [k & ks :as keys]]),
   :name "dissoc-in",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L56",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/dissoc-in",
   :doc
   "Dissociates an entry from a nested associative structure returning a new\nnested structure. keys is a sequence of keys. Any empty maps that result\nwill not be present in the new structure.",
   :var-type "function",
   :line 56,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([class-name & args]),
   :name "new-by-name",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L70",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/new-by-name",
   :doc
   "Constructs a Java object whose class is specified by a String.",
   :var-type "function",
   :line 70,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([x]),
   :name "seqable?",
   :namespace "clojure.core.incubator",
   :source-url
   "https://github.com/clojure/core.incubator/blob/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj#L77",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/33b04a0cfc3018a9873153f1f086a62c0f72ec42/src/main/clojure/clojure/core/incubator.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.incubator-api.html#clojure.core.incubator/seqable?",
   :doc "Returns true if (seq x) will succeed, false otherwise.",
   :var-type "function",
   :line 77,
   :file "src/main/clojure/clojure/core/incubator.clj"}
  {:arglists ([& strings]),
   :name "<<",
   :namespace "clojure.core.strint",
   :source-url
   "https://github.com/clojure/core.incubator/blob/9f2590f2cf22c37ba66010983bf6eaf21a90084c/src/main/clojure/clojure/core/strint.clj#L49",
   :raw-source-url
   "https://github.com/clojure/core.incubator/raw/9f2590f2cf22c37ba66010983bf6eaf21a90084c/src/main/clojure/clojure/core/strint.clj",
   :wiki-url
   "http://clojure.github.com/core.incubator//clojure.core.strint-api.html#clojure.core.strint/<<",
   :doc
   "Accepts one or more strings; emits a `str` invocation that concatenates\nthe string data and evaluated expressions contained within that argument.\nEvaluation is controlled using ~{} and ~() forms. The former is used for\nsimple value replacement using clojure.core/str; the latter can be used to\nembed the results of arbitrary function invocation into the produced string.\n\nExamples:\n  user=> (def v 30.5)\n  #'user/v\n  user=> (<< \"This trial required ~{v}ml of solution.\")\n  \"This trial required 30.5ml of solution.\"\n  user=> (<< \"There are ~(int v) days in November.\")\n  \"There are 30 days in November.\"\n  user=> (def m {:a [1 2 3]})\n  #'user/m\n  user=> (<< \"The total for your order is $~(->> m :a (apply +)).\")\n  \"The total for your order is $6.\"\n  user=> (<< \"Just split a long interpolated string up into ~(-> m :a (get 0)), \"\n           \"~(-> m :a (get 1)), or even ~(-> m :a (get 2)) separate strings \"\n           \"if you don't want a << expression to end up being e.g. ~(* 4 (int v)) \"\n           \"columns wide.\")\n  \"Just split a long interpolated string up into 1, 2, or even 3 separate strings if you don't want a << expression to end up being e.g. 120 columns wide.\"\n  \nNote that quotes surrounding string literals within ~() forms must be\nescaped.",
   :var-type "macro",
   :line 49,
   :file "src/main/clojure/clojure/core/strint.clj"})}
