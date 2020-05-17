package typingsSlinky.simmerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.simmerjs.mod.Queryable
  - typingsSlinky.simmerjs.mod.WindowLike
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  implicit def apply(value: Queryable): Scope = value.asInstanceOf[Scope]
  @scala.inline
  implicit def apply(value: WindowLike): Scope = value.asInstanceOf[Scope]
}

