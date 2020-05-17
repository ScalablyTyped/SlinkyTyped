package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xregexp.mod.ReplacementFunction
*/
trait ReplacementValue extends js.Object

object ReplacementValue {
  @scala.inline
  implicit def apply(value: ReplacementFunction): ReplacementValue = value.asInstanceOf[ReplacementValue]
  @scala.inline
  implicit def apply(value: String): ReplacementValue = value.asInstanceOf[ReplacementValue]
}

