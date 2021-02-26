package typingsSlinky.sumoLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<sumo-logger.sumo-logger.PerMessageOptions> */
  @js.native
  trait PartialPerMessageOptions extends StObject {
    
    var sessionKey: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[js.Date] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object PartialPerMessageOptions {
    
    @scala.inline
    def apply(): PartialPerMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPerMessageOptions]
    }
    
    @scala.inline
    implicit class PartialPerMessageOptionsMutableBuilder[Self <: PartialPerMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
