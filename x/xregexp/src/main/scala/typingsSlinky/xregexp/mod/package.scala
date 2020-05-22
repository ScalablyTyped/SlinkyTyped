package typingsSlinky.xregexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * An array of valid items to use for chain matching.
    */
  type MatchChainArray = js.Array[typingsSlinky.xregexp.mod.ChainArrayElement | js.RegExp]
  /**
    * Valid match or replacement scopes for when doing a match or replace.
    */
  type MatchScope = typingsSlinky.xregexp.mod.MatchScopeOne | typingsSlinky.xregexp.mod.MatchScopeAll
  /**
    * Match or replacement scope that will match or replace all occurances.
    */
  type MatchScopeAll = typingsSlinky.xregexp.xregexpStrings.all
  /**
    * Match or replacement scope that will only match or replace the first occurance.
    */
  type MatchScopeOne = typingsSlinky.xregexp.xregexpStrings.one
  /**
    * Repesents a list of named capture groups. Only valid if the `namespacing` feature is turned on.
    */
  type NamedGroupsArray = /**
    * Named capture groups are accessible as properties.
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Valid ways os specifying a pattern to use.
    */
  type Pattern = js.RegExp | java.lang.String
  /**
    * Special helper type that sets only specific properties to required.
    */
  type PickRequired[T, K /* <: /* keyof T */ java.lang.String */] = T with (typingsSlinky.std.Required[typingsSlinky.std.Pick[T, K]])
  /**
    *   Replacement functions are invoked with three or more arguments:
    *     - {string}        substring  - The matched substring (corresponds to `$&` above). Named backreferences are accessible as
    *       properties of this first argument if the `namespacing` feature is off.
    *     - {string}        args[1..n] - arguments, one for each backreference (corresponding to `$1`, `$2`, etc. above).
    *     - {number}        args[n+1]  - The zero-based index of the match within the total search string.
    *     - {string}        args[n+2]  - The total string being searched.
    *     - {XRegExp.NamedGroups} args[n+3]  - If the `namespacing` feature is turned on, the last parameter is the groups object. If the
    *       `namespacing` feature is off, then this argument is not present.
    */
  type ReplacementFunction = js.Function2[
    /* substring */ typingsSlinky.xregexp.mod.MatchSubString, 
    /* repeated */ java.lang.String | scala.Double | typingsSlinky.xregexp.mod.NamedGroupsArray, 
    java.lang.String
  ]
  /**
    *   Replacement strings can include special replacement syntax:
    *     - `$$` - Inserts a literal $ character.
    *     - `$&`, `$0` - Inserts the matched substring.
    *     - ``$` `` - Inserts the string that precedes the matched substring (left context).
    *     - `$'` - Inserts the string that follows the matched substring (right context).
    *     - `$n`, `$nn` - Where n/nn are digits referencing an existent capturing group, inserts
    *       backreference n/nn.
    *     - `${n}`, `$<n>` - Where n is a name or any number of digits that reference an existent capturing
    *       group, inserts backreference n.
    *
    *   Replacement functions are invoked with three or more arguments:
    *     - {string}        substring  - The matched substring (corresponds to `$&` above). Named backreferences are accessible as
    *       properties of this first argument if the `namespacing` feature is off.
    *     - {string}        args[1..n] - arguments, one for each backreference (corresponding to `$1`, `$2`, etc. above).
    *     - {number}        args[n+1]  - The zero-based index of the match within the total search string.
    *     - {string}        args[n+2]  - The total string being searched.
    *     - {XRegExp.NamedGroups} args[n+3]  - If the `namespacing` feature is turned on, the last parameter is the groups object. If the
    *       `namespacing` feature is off, then this argument is not present.
    */
  type ReplacementValue = java.lang.String | typingsSlinky.xregexp.mod.ReplacementFunction
}
