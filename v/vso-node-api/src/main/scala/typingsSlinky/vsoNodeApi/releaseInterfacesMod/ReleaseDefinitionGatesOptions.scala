package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStabilizationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stabilizationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

