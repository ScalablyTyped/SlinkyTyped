package typingsSlinky.wavEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioData extends js.Object {
  
  var channelData: js.Array[js.typedarray.Float32Array] = js.native
  
  var sampleRate: Double = js.native
}
object AudioData {
  
  @scala.inline
  def apply(channelData: js.Array[js.typedarray.Float32Array], sampleRate: Double): AudioData = {
    val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioData]
  }
  
  @scala.inline
  implicit class AudioDataOps[Self <: AudioData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelDataVarargs(value: js.typedarray.Float32Array*): Self = this.set("channelData", js.Array(value :_*))
    
    @scala.inline
    def setChannelData(value: js.Array[js.typedarray.Float32Array]): Self = this.set("channelData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
  }
}
