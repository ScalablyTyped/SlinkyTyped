package typingsSlinky.wonderJs.mod

import typingsSlinky.wonderJs.ieventdataMod.ITouchEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
class TouchEvent ()
  extends typingsSlinky.wonderJs.touchEventMod.TouchEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "TouchEvent")
@js.native
object TouchEvent extends js.Object {
  def create(event: ITouchEventData, eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): typingsSlinky.wonderJs.touchEventMod.TouchEvent = js.native
}

