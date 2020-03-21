package typingsSlinky.wonderJs

import typingsSlinky.wonderJs.domEventMod.DomEvent
import typingsSlinky.wonderJs.ieventdataMod.IPointEventData
import typingsSlinky.wonderJs.mouseEventMod.MouseEvent
import typingsSlinky.wonderJs.pointMod.Point
import typingsSlinky.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/PointEvent", JSImport.Namespace)
@js.native
object pointEventMod extends js.Object {
  @js.native
  abstract class PointEvent () extends DomEvent {
    var button: Double | Null = js.native
    var eventObj: MouseEvent | TouchEvent = js.native
    @JSName("event")
    var event_PointEvent: IPointEventData = js.native
    var lastX: Double = js.native
    var lastY: Double = js.native
    var location: Point = js.native
    var locationInView: Point = js.native
    val movementDelta: Point = js.native
    val wheel: Double | Null = js.native
    /* protected */ def cloneHelper(eventObj: PointEvent): PointEvent = js.native
    def getDataFromEventObj(eventObj: MouseEvent): Unit = js.native
    def getDataFromEventObj(eventObj: TouchEvent): Unit = js.native
  }
  
}

