package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.BreakStatement
  - typingsSlinky.typescript.mod.ContinueStatement
*/
trait BreakOrContinueStatement extends js.Object

object BreakOrContinueStatement {
  @scala.inline
  implicit def apply(value: BreakStatement): BreakOrContinueStatement = value.asInstanceOf[BreakOrContinueStatement]
  @scala.inline
  implicit def apply(value: ContinueStatement): BreakOrContinueStatement = value.asInstanceOf[BreakOrContinueStatement]
}

