package typingsSlinky.wonderJs.mod

import typingsSlinky.wonderJs.ieventdataMod.IMouseEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
class MouseEvent ()
  extends typingsSlinky.wonderJs.mouseEventMod.MouseEvent

/* static members */
@JSImport("wonder.js/dist/es2015", "MouseEvent")
@js.native
object MouseEvent extends js.Object {
  def create(event: IMouseEventData, eventName: typingsSlinky.wonderJs.eventNameHandlerMod.EEventName): typingsSlinky.wonderJs.mouseEventMod.MouseEvent = js.native
}

