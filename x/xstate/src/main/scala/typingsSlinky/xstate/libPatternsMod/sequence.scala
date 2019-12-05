package typingsSlinky.xstate.libPatternsMod

import typingsSlinky.std.Partial
import typingsSlinky.xstate.Anon_Initial
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.StateSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "sequence")
@js.native
object sequence extends js.Object {
  def apply[TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](items: js.Array[String]): Anon_Initial[TStateSchema, TEvent] = js.native
  def apply[TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](items: js.Array[String], options: Partial[SequencePatternOptions[TEvent]]): Anon_Initial[TStateSchema, TEvent] = js.native
}

