package typingsSlinky.workboxWindow

import org.scalajs.dom.raw.Event
import typingsSlinky.workboxWindow.workboxMod.Workbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxEventMod {
  
  @js.native
  trait WorkboxEvent extends StObject {
    
    val originalEvent: Event = js.native
    
    val target: Workbox = js.native
    
    val `type`: String = js.native
  }
  object WorkboxEvent {
    
    @scala.inline
    def apply(originalEvent: Event, target: Workbox, `type`: String): WorkboxEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxEvent]
    }
    
    @scala.inline
    implicit class WorkboxEventMutableBuilder[Self <: WorkboxEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Workbox): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
