package typingsSlinky.tizenAccessory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("SATransport")
  @js.native
  object SATransport extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.tizenAccessory.SATransport with String] = js.native
    
    /* "TRANSPORT_BLE" */ val TRANSPORT_BLE: typingsSlinky.tizenAccessory.SATransport.TRANSPORT_BLE with String = js.native
    
    /* "TRANSPORT_BT" */ val TRANSPORT_BT: typingsSlinky.tizenAccessory.SATransport.TRANSPORT_BT with String = js.native
    
    /* "TRANSPORT_MOBILE" */ val TRANSPORT_MOBILE: typingsSlinky.tizenAccessory.SATransport.TRANSPORT_MOBILE with String = js.native
    
    /* "TRANSPORT_USB" */ val TRANSPORT_USB: typingsSlinky.tizenAccessory.SATransport.TRANSPORT_USB with String = js.native
    
    /* "TRANSPORT_WIFI" */ val TRANSPORT_WIFI: typingsSlinky.tizenAccessory.SATransport.TRANSPORT_WIFI with String = js.native
  }
  
  object webapis {
    
    @JSGlobal("webapis.sa")
    @js.native
    val sa: SAManager = js.native
  }
}
