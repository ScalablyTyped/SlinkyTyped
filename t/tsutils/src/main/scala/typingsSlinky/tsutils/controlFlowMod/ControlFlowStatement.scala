package typingsSlinky.tsutils.controlFlowMod

import typingsSlinky.typescript.mod.BreakStatement
import typingsSlinky.typescript.mod.ContinueStatement
import typingsSlinky.typescript.mod.ReturnStatement
import typingsSlinky.typescript.mod.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.BreakStatement
  - typingsSlinky.typescript.mod.ContinueStatement
  - typingsSlinky.typescript.mod.ReturnStatement
  - typingsSlinky.typescript.mod.ThrowStatement
*/
trait ControlFlowStatement extends js.Object

object ControlFlowStatement {
  @scala.inline
  implicit def apply(value: BreakStatement): ControlFlowStatement = value.asInstanceOf[ControlFlowStatement]
  @scala.inline
  implicit def apply(value: ContinueStatement): ControlFlowStatement = value.asInstanceOf[ControlFlowStatement]
  @scala.inline
  implicit def apply(value: ReturnStatement): ControlFlowStatement = value.asInstanceOf[ControlFlowStatement]
  @scala.inline
  implicit def apply(value: ThrowStatement): ControlFlowStatement = value.asInstanceOf[ControlFlowStatement]
}

