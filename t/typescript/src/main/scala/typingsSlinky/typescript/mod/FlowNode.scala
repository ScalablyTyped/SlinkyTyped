package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.mod.AfterFinallyFlow
  - typingsSlinky.typescript.mod.PreFinallyFlow
  - typingsSlinky.typescript.mod.FlowStart
  - typingsSlinky.typescript.mod.FlowLabel
  - typingsSlinky.typescript.mod.FlowAssignment
  - typingsSlinky.typescript.mod.FlowCall
  - typingsSlinky.typescript.mod.FlowCondition
  - typingsSlinky.typescript.mod.FlowSwitchClause
  - typingsSlinky.typescript.mod.FlowArrayMutation
*/
trait FlowNode extends js.Object

object FlowNode {
  @scala.inline
  implicit def apply(value: AfterFinallyFlow): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowArrayMutation): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowAssignment): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowCall): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowCondition): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowLabel): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowStart): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: FlowSwitchClause): FlowNode = value.asInstanceOf[FlowNode]
  @scala.inline
  implicit def apply(value: PreFinallyFlow): FlowNode = value.asInstanceOf[FlowNode]
}

