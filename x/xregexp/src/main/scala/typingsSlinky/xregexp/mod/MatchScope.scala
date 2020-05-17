package typingsSlinky.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid match or replacement scopes for when doing a match or replace.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.mod.MatchScopeOne
  - typingsSlinky.xregexp.mod.MatchScopeAll
*/
trait MatchScope extends js.Object

object MatchScope {
  @scala.inline
  implicit def apply(value: MatchScopeAll): MatchScope = value.asInstanceOf[MatchScope]
  @scala.inline
  implicit def apply(value: MatchScopeOne): MatchScope = value.asInstanceOf[MatchScope]
}

