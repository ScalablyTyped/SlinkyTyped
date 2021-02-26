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
trait AES extends StObject {
  
  /**
    * AES encryption
    */
  var AES: `3` = js.native
  
  /**
    * No encryption
    */
  var NONE: `5` = js.native
  
  /**
    * TKIP encryption
    */
  var TKIP: `2` = js.native
  
  /**
    * TKIP_AES_MIXED encryption
    */
  var TKIP_AES_MIXED: `4` = js.native
  
  /**
    * Encryption type unknown
    */
  var UNKNOWN: `6` = js.native
  
  /**
    * WEP encryption
    */
  var WEP: `1` = js.native
}
object AES {
  
  @scala.inline
  def apply(AES: `3`, NONE: `5`, TKIP: `2`, TKIP_AES_MIXED: `4`, UNKNOWN: `6`, WEP: `1`): AES = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], TKIP = TKIP.asInstanceOf[js.Any], TKIP_AES_MIXED = TKIP_AES_MIXED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WEP = WEP.asInstanceOf[js.Any])
    __obj.asInstanceOf[AES]
  }
  
  @scala.inline
  implicit class AESMutableBuilder[Self <: AES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAES(value: `3`): Self = StObject.set(x, "AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `5`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP(value: `2`): Self = StObject.set(x, "TKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP_AES_MIXED(value: `4`): Self = StObject.set(x, "TKIP_AES_MIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `6`): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEP(value: `1`): Self = StObject.set(x, "WEP", value.asInstanceOf[js.Any])
  }
}
