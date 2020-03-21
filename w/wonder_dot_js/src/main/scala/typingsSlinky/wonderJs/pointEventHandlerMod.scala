package typingsSlinky.wonderJs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonderJs.domEventHandlerMod.DomEventHandler
import typingsSlinky.wonderJs.domEventMod.DomEvent
import typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
import typingsSlinky.wonderJs.ieventdataMod.IEventData
import typingsSlinky.wonderJs.mouseEventMod.MouseEvent
import typingsSlinky.wonderJs.touchEventMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/handler/PointEventHandler", JSImport.Namespace)
@js.native
object pointEventHandlerMod extends js.Object {
  @js.native
  abstract class PointEventHandler () extends DomEventHandler {
    /* protected */ def createEventObject(dom: HTMLElement, event: IEventData, eventName: EEventName): DomEvent = js.native
    /* protected */ def handleMove(handler: js.Function1[/* event */ MouseEvent | TouchEvent, Unit]): js.Function2[
        /* event */ MouseEvent | TouchEvent, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ /* eventData */ js.Any, 
        Unit
      ] = js.native
    def on(
      dom: typingsSlinky.std.HTMLElement,
      eventName: EEventName,
      handler: js.Function1[/* event */ DomEvent, Unit],
      priority: Double
    ): js.Any = js.native
    def on(eventName: EEventName, handler: js.Function1[/* event */ DomEvent, Unit], priority: Double): js.Any = js.native
  }
  
}

