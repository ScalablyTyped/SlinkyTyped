package typingsSlinky.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wouter.preactMod.MatchWithParams[T]
  - typingsSlinky.wouter.preactMod.NoMatch
*/
trait Match[T /* <: DefaultParams */] extends js.Object

object Match {
  @scala.inline
  implicit def apply[T](value: MatchWithParams[T] | NoMatch): Match[T] = value.asInstanceOf[Match[T]]
}

