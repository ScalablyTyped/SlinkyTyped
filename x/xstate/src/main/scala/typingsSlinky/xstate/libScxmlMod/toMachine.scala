package typingsSlinky.xstate.libScxmlMod

import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/scxml", "toMachine")
@js.native
object toMachine extends js.Object {
  def apply(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, EventObject, _] = js.native
}

