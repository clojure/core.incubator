# core.incubator

Future home of fns proposed for core inclusion.  Currently:

* A "nil-safe" threading macro for interop forms (`.?.`)
* An implementation of `dissoc-in`
* An implementation of `seqable?` (deprecated - in core as of Clojure 1.9.0-alpha5)
* A string interpolation macro (`<<`), originally described
  [here](http://cemerick.com/2009/12/04/string-interpolation-in-clojure/).

NOTE: If you are looking for the other nil-safe threading macros — `-?>` and
`-?>>` — they're still here, but deprecated; they were effectively promoted into
`clojure.core` starting with Clojure 1.5 in the form of `some->` and `some->>`,
respectively.

For more details, please see the project's [generated API
documentation](http://clojure.github.com/core.incubator/).

## "Installation"

Add a dependency on core.incubator to your Leinigen `project.clj`:

```clojure
[org.clojure/core.incubator "0.1.4"]
```

…or to your Maven `pom.xml`:

```clojure
<dependency>
  <groupId>org.clojure</groupId>
  <artifactId>core.incubator</artifactId>
  <version>0.1.4</version>
</dependency>
```

## License

Copyright (c) Rich Hickey and contributors. All rights reserved.

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
which can be found in the file epl.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.
You must not remove this notice, or any other, from this software.


