package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.anon.X
import typingsSlinky.wonderJs.domEventMod.DomEvent
import typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
import typingsSlinky.wonderJs.ieventdataMod.IMouseEventData
import typingsSlinky.wonderJs.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/MouseEvent", JSImport.Namespace)
@js.native
object mouseEventMod extends js.Object {
  @js.native
  class MouseEvent () extends DomEvent {
    var button: Double = js.native
    @JSName("event")
    var event_MouseEvent: IMouseEventData = js.native
    var lastX: Double = js.native
    var lastY: Double = js.native
    var location: Point = js.native
    var locationInView: Point = js.native
    val movementDelta: X = js.native
    val wheel: Double = js.native
  }
  
  /* static members */
  @js.native
  object MouseEvent extends js.Object {
    def create(event: IMouseEventData, eventName: EEventName): MouseEvent = js.native
  }
  
}

