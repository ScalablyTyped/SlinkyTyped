package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.FunctionBody
  - typingsSlinky.typescript.mod.Expression
*/
trait ConciseBody extends js.Object

object ConciseBody {
  @scala.inline
  implicit def apply(value: Expression): ConciseBody = value.asInstanceOf[ConciseBody]
  @scala.inline
  implicit def apply(value: FunctionBody): ConciseBody = value.asInstanceOf[ConciseBody]
}

