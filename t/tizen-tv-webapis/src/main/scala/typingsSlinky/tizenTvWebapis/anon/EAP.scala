package typingsSlinky.tizenTvWebapis.anon

import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typingsSlinky.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAP extends StObject {
  
  /**
    * EAP security mode
    */
  var EAP: `4` = js.native
  
  /**
    * Open security mode
    */
  var NONE: `5` = js.native
  
  /**
    * Security mode unknown
    */
  var UNKNOWN: `6` = js.native
  
  /**
    * WEP security mode
    */
  var WEP: `1` = js.native
  
  /**
    * WPA2_PSK security mode
    */
  var WPA2_PSK: `3` = js.native
  
  /**
    * PSK security mode
    */
  var WPA_PSK: `2` = js.native
}
object EAP {
  
  @scala.inline
  def apply(EAP: `4`, NONE: `5`, UNKNOWN: `6`, WEP: `1`, WPA2_PSK: `3`, WPA_PSK: `2`): EAP = {
    val __obj = js.Dynamic.literal(EAP = EAP.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WEP = WEP.asInstanceOf[js.Any], WPA2_PSK = WPA2_PSK.asInstanceOf[js.Any], WPA_PSK = WPA_PSK.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAP]
  }
  
  @scala.inline
  implicit class EAPMutableBuilder[Self <: EAP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEAP(value: `4`): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `6`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEP(value: `1`): Self = StObject.set(x, "WEP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWPA2_PSK(value: `3`): Self = StObject.set(x, "WPA2_PSK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWPA_PSK(value: `2`): Self = StObject.set(x, "WPA_PSK", value.asInstanceOf[js.Any])
  }
}
