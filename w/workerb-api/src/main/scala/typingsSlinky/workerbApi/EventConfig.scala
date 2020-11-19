package typingsSlinky.workerbApi

import typingsSlinky.workerbApi.workerbApiStrings.keydown
import typingsSlinky.workerbApi.workerbApiStrings.keyup
import typingsSlinky.workerbApi.workerbApiStrings.mousedown
import typingsSlinky.workerbApi.workerbApiStrings.mouseenter
import typingsSlinky.workerbApi.workerbApiStrings.mouseleave
import typingsSlinky.workerbApi.workerbApiStrings.mousemove
import typingsSlinky.workerbApi.workerbApiStrings.mouseout
import typingsSlinky.workerbApi.workerbApiStrings.mouseover
import typingsSlinky.workerbApi.workerbApiStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventConfig extends js.Object {
  
  /**
    * An object used to specify the event properties. For key related event types, KeyboardEvent is supported. For mouse related event types, MouseEvent is supported.
    */
  var eventProps: js.UndefOr[js.Object] = js.native
  
  /**
    * A string value used to the specify the type of the event.
    */
  var eventType: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup = js.native
}
object EventConfig {
  
  @scala.inline
  def apply(
    eventType: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
  ): EventConfig = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig]
  }
  
  @scala.inline
  implicit class EventConfigOps[Self <: EventConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventType(
      value: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
    ): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventProps(value: js.Object): Self = this.set("eventProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventProps: Self = this.set("eventProps", js.undefined)
  }
}
