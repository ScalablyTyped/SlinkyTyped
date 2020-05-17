package typingsSlinky.wouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.wouter.mod.MatchWithParams[T]
  - typingsSlinky.wouter.mod.NoMatch
*/
trait Match[T /* <: DefaultParams */] extends js.Object

object Match {
  @scala.inline
  implicit def apply[T](value: MatchWithParams[T] | NoMatch): Match[T] = value.asInstanceOf[Match[T]]
}

