package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionGatesOptions extends js.Object {
  
  var isEnabled: Boolean = js.native
  
  var samplingInterval: Double = js.native
  
  var stabilizationTime: Double = js.native
  
  var timeout: Double = js.native
}
object ReleaseDefinitionGatesOptions {
  
  @scala.inline
  def apply(isEnabled: Boolean, samplingInterval: Double, stabilizationTime: Double, timeout: Double): ReleaseDefinitionGatesOptions = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], stabilizationTime = stabilizationTime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGatesOptions]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionGatesOptionsOps[Self <: ReleaseDefinitionGatesOptions] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilizationTime(value: Double): Self = this.set("stabilizationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
