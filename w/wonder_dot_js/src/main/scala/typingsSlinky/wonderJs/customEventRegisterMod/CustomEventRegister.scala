package typingsSlinky.wonderJs.customEventRegisterMod

import typingsSlinky.wonderJs.customEventListenerMapMod.CustomEventListenerMap
import typingsSlinky.wonderJs.entityObjectMod.EntityObject
import typingsSlinky.wonderJs.eventNameHandlerMod.EEventName
import typingsSlinky.wonderJs.eventRegisterMod.EventRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
@js.native
class CustomEventRegister () extends EventRegister {
  @JSName("listenerMap")
  var listenerMap_CustomEventRegister: CustomEventListenerMap = js.native
  def register(
    eventName: EEventName,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: Double
  ): js.Any = js.native
  def register(
    target: EntityObject,
    eventName: EEventName,
    handler: js.Function,
    originHandler: js.Function,
    domHandler: js.Function,
    priority: Double
  ): js.Any = js.native
  def remove(eventName: EEventName): js.Any = js.native
  def remove(eventName: EEventName, handler: js.Function): js.Any = js.native
  def remove(target: EntityObject): js.Any = js.native
  def remove(target: EntityObject, eventName: EEventName): js.Any = js.native
  def remove(target: EntityObject, eventName: EEventName, handler: js.Function): js.Any = js.native
  def remove(uid: Double, eventName: EEventName): js.Any = js.native
  def setBubbleParent(target: EntityObject, parent: EntityObject): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/binder/CustomEventRegister", "CustomEventRegister")
@js.native
object CustomEventRegister extends js.Object {
  def getInstance(): js.Any = js.native
}

