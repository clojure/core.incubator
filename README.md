# core.incubator

Future home of fns proposed for core inclusion.  Currently:

* A set of short-circuiting "nil-safe" threading macros (e.g. `-?>`, `-?>>` and
  `.?.`)
* An implementation of `dissoc-in`
* An implementation of `seqable?`
* A string interpolation macro (`<<`), originally described
  [here](http://cemerick.com/2009/12/04/string-interpolation-in-clojure/).

For more details, please see the project's [generated API
documentation](http://clojure.github.com/core.incubator/).

## "Installation"

Add a dependency on core.incubator to your Leinigen `project.clj`:

```clojure
[org.clojure/core.incubator "0.1.2"]
```

…or to your Maven `pom.xml`:

```clojure
<dependency>
  <groupId>org.clojure</groupId>
  <artifactId>core.incubator</artifactId>
  <version>0.1.2</version>
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


