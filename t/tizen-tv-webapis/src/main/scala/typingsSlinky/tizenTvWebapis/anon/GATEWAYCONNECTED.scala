package typingsSlinky.tizenTvWebapis.anon

import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`7`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GATEWAYCONNECTED extends StObject {
  
  /**
    * Gateway connected
    */
  var GATEWAY_CONNECTED: `4` = js.native
  
  /**
    * Gateway disconnected
    */
  var GATEWAY_DISCONNECTED: `5` = js.native
  
  /**
    * LAN cable connected
    */
  var LAN_CABLE_ATTACHED: `1` = js.native
  
  /**
    * LAN cable disconnected
    */
  var LAN_CABLE_DETACHED: `2` = js.native
  
  /**
    * LAN cable connection state unknown
    */
  var LAN_CABLE_STATE_UNKNOWN: `3` = js.native
  
  /**
    * Wi-Fi module connected
    */
  var WIFI_MODULE_STATE_ATTACHED: `6` = js.native
  
  /**
    * Wi-Fi module disconnected
    */
  var WIFI_MODULE_STATE_DETACHED: `7` = js.native
  
  /**
    * Wi-Fi module connection state unknown
    */
  var WIFI_MODULE_STATE_UNKNOWN: `8` = js.native
}
object GATEWAYCONNECTED {
  
  @scala.inline
  def apply(
    GATEWAY_CONNECTED: `4`,
    GATEWAY_DISCONNECTED: `5`,
    LAN_CABLE_ATTACHED: `1`,
    LAN_CABLE_DETACHED: `2`,
    LAN_CABLE_STATE_UNKNOWN: `3`,
    WIFI_MODULE_STATE_ATTACHED: `6`,
    WIFI_MODULE_STATE_DETACHED: `7`,
    WIFI_MODULE_STATE_UNKNOWN: `8`
  ): GATEWAYCONNECTED = {
    val __obj = js.Dynamic.literal(GATEWAY_CONNECTED = GATEWAY_CONNECTED.asInstanceOf[js.Any], GATEWAY_DISCONNECTED = GATEWAY_DISCONNECTED.asInstanceOf[js.Any], LAN_CABLE_ATTACHED = LAN_CABLE_ATTACHED.asInstanceOf[js.Any], LAN_CABLE_DETACHED = LAN_CABLE_DETACHED.asInstanceOf[js.Any], LAN_CABLE_STATE_UNKNOWN = LAN_CABLE_STATE_UNKNOWN.asInstanceOf[js.Any], WIFI_MODULE_STATE_ATTACHED = WIFI_MODULE_STATE_ATTACHED.asInstanceOf[js.Any], WIFI_MODULE_STATE_DETACHED = WIFI_MODULE_STATE_DETACHED.asInstanceOf[js.Any], WIFI_MODULE_STATE_UNKNOWN = WIFI_MODULE_STATE_UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GATEWAYCONNECTED]
  }
  
  @scala.inline
  implicit class GATEWAYCONNECTEDMutableBuilder[Self <: GATEWAYCONNECTED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGATEWAY_CONNECTED(value: `4`): Self = StObject.set(x, "GATEWAY_CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGATEWAY_DISCONNECTED(value: `5`): Self = StObject.set(x, "GATEWAY_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_ATTACHED(value: `1`): Self = StObject.set(x, "LAN_CABLE_ATTACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_DETACHED(value: `2`): Self = StObject.set(x, "LAN_CABLE_DETACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLAN_CABLE_STATE_UNKNOWN(value: `3`): Self = StObject.set(x, "LAN_CABLE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_ATTACHED(value: `6`): Self = StObject.set(x, "WIFI_MODULE_STATE_ATTACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_DETACHED(value: `7`): Self = StObject.set(x, "WIFI_MODULE_STATE_DETACHED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI_MODULE_STATE_UNKNOWN(value: `8`): Self = StObject.set(x, "WIFI_MODULE_STATE_UNKNOWN", value.asInstanceOf[js.Any])
  }
}
