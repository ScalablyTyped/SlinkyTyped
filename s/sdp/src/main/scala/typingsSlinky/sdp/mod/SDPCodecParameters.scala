package typingsSlinky.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPCodecParameters extends StObject {
  
  var channels: Double = js.native
  
  var clockRate: Double = js.native
  
  var maxptime: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var numChannels: js.UndefOr[Double] = js.native
  
  var payloadType: Double = js.native
  
  var preferredPayloadType: js.UndefOr[Double] = js.native
}
object SDPCodecParameters {
  
  @scala.inline
  def apply(channels: Double, clockRate: Double, name: String, payloadType: Double): SDPCodecParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPCodecParameters]
  }
  
  @scala.inline
  implicit class SDPCodecParametersMutableBuilder[Self <: SDPCodecParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: Double): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxptime(value: Double): Self = StObject.set(x, "maxptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxptimeUndefined: Self = StObject.set(x, "maxptime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumChannels(value: Double): Self = StObject.set(x, "numChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumChannelsUndefined: Self = StObject.set(x, "numChannels", js.undefined)
    
    @scala.inline
    def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPayloadType(value: Double): Self = StObject.set(x, "preferredPayloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPayloadTypeUndefined: Self = StObject.set(x, "preferredPayloadType", js.undefined)
  }
}
