package typingsSlinky.zepto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZeptoEffectsSpeeds extends StObject {
  
  /**
    * Default = 400ms.
    **/
  var _default: Double = js.native
  
  /**
    * Default = 200ms.
    **/
  var fast: Double = js.native
  
  /**
    * Default = 600ms.
    **/
  var slow: Double = js.native
}
object ZeptoEffectsSpeeds {
  
  @scala.inline
  def apply(_default: Double, fast: Double, slow: Double): ZeptoEffectsSpeeds = {
    val __obj = js.Dynamic.literal(_default = _default.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeptoEffectsSpeeds]
  }
  
  @scala.inline
  implicit class ZeptoEffectsSpeedsMutableBuilder[Self <: ZeptoEffectsSpeeds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_default(value: Double): Self = StObject.set(x, "_default", value.asInstanceOf[js.Any])
  }
}
