package typingsSlinky.xstate

import typingsSlinky.xstate.libTypesMod.ActionObject
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/each", JSImport.Namespace)
@js.native
object libEachMod extends js.Object {
  def each[TContext, TEvent /* <: EventObject */](collection: String, item: String, actions: SingleOrArray[ActionObject[TContext, TEvent]]): ActionObject[TContext, TEvent] = js.native
  def each[TContext, TEvent /* <: EventObject */](
    collection: String,
    item: String,
    index: String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = js.native
}

