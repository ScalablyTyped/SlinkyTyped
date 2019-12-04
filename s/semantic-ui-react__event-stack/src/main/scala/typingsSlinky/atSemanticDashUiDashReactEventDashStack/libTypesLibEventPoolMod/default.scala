package typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesLibEventPoolMod

import org.scalajs.dom.raw.Event
import typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.CallableEventListener
import typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.EventListeners
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Default)
@js.native
class default protected () extends EventPool {
  def this(
    poolName: String,
    handlerSets: Map[
        String, 
        typingsSlinky.atSemanticDashUiDashReactEventDashStack.libTypesLibEventSetMod.default
      ]
  ) = this()
  /* CompleteClass */
  override val handlerSets: js.Any = js.native
  /* CompleteClass */
  override val poolName: js.Any = js.native
  /* CompleteClass */
  override def addHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
  /* CompleteClass */
  override def dispatchEvent(eventType: String, event: Event): Unit = js.native
  /* CompleteClass */
  override def hasHandlers(): Boolean = js.native
  /* CompleteClass */
  override def removeHandlers(eventType: String, eventHandlers: EventListeners): EventPool = js.native
}

/* static members */
@JSImport("@semantic-ui-react/event-stack/lib/types/lib/EventPool", JSImport.Default)
@js.native
object default extends js.Object {
  def createByType(poolName: String, eventType: String, eventHandlers: js.Array[CallableEventListener]): EventPool = js.native
}

