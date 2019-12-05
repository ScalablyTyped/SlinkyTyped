package typingsSlinky.xstate

import typingsSlinky.xstate.libScxmlMod.ScxmlToMachineOptions
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.OmniEventObject
import typingsSlinky.xstate.xstateMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/scxml", JSImport.Namespace)
@js.native
object libScxmlMod extends js.Object {
  @js.native
  trait ScxmlToMachineOptions extends js.Object {
    var delimiter: js.UndefOr[String] = js.native
    def evalCond(expr: String): (js.Function2[/* extState */ js.Any, /* event */ EventObject, Boolean]) | js.Function = js.native
    def evalCond(expr: String, extState: js.Object): (js.Function2[/* extState */ js.Any, /* event */ EventObject, Boolean]) | js.Function = js.native
  }
  
  def toMachine(xml: String, options: ScxmlToMachineOptions): StateNode[_, _, OmniEventObject[EventObject]] = js.native
}

