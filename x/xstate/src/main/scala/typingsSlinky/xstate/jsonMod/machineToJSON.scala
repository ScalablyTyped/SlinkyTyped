package typingsSlinky.xstate.jsonMod

import typingsSlinky.xstate.mod.StateNode
import typingsSlinky.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/json", "machineToJSON")
@js.native
object machineToJSON extends js.Object {
  def apply(stateNode: StateNode[_, _, EventObject, _]): StateNodeConfig = js.native
}

