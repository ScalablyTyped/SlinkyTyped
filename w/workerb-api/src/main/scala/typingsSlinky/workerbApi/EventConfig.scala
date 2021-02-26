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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventConfig extends StObject {
  
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
  implicit class EventConfigMutableBuilder[Self <: EventConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
    
    @scala.inline
    def setEventType(
      value: keydown | keyup | mousedown | mouseenter | mouseleave | mousemove | mouseout | mouseover | mouseup
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
