0.4.1 (released 29 January 2016)
----------

* Change output-file extensions to '.json' and '.yml' for JSON and YAML outputs.
* Revert pull request #32 and remove `@Input` from `apkOrDex` (issues #40 and #46)

0.4.0 (released 23 January 2016)
----------

* BUG: Fix incorrect indentation on field-count-only YAML output
* Add YAML as a format option
* Add JSON as a format option
* Replace `printAsTree` with `format` and associated enum

0.3.1 (released 5 December 2015)
----------

* Report number of methods/fields remaining in console output
* Add description and group to Gradle tasks
* Add `includeTotalMethodCount` config option to print total count in the PackageTree output

0.3.0 (released 27 October 2015)
----------

* Remove `exportAsCSV` and just print the file unconditionally
* CHANGED: field counts are enabled by default
* Use Proguard mappings to de-obfuscate class and package names
* Add `exportAsCSV` option to support Jenkins Plot Plugin

0.2.1 (released 11 September 2015)
----------

* BUG: Fix invalid bytecode (issue #11)
* BUG: Work around Groovy-Java interop bug (issue #12)

0.2.0 (released 2 September 2015)
------------------

* Add field-reference count to DexMethodCountTask stdout
* Add configurability via a `dexcount` Gradle extension
* Add verbose output option
* Add option to include field counts in printed package lists
* Add option to sort printed package list by method count (issue #7)
* Add header to list-formatted output
* Include methods in the unnamed package (e.g. primitive arrays) in task output


0.1.1
-----

Initial open-source release
