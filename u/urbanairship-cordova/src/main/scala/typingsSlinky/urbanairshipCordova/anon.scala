package typingsSlinky.urbanairshipCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alert extends StObject {
    
    var alert: Double = js.native
    
    var badge: Double = js.native
    
    var none: Double = js.native
    
    var sound: Double = js.native
  }
  object Alert {
    
    @scala.inline
    def apply(alert: Double, badge: Double, none: Double, sound: Double): Alert = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alert]
    }
    
    @scala.inline
    implicit class AlertMutableBuilder[Self <: Alert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSound(value: Double): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    }
  }
}
