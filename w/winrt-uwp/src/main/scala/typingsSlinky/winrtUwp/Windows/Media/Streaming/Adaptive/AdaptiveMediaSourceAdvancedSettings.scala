package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdaptiveMediaSourceAdvancedSettings extends js.Object {
  var allSegmentsIndependent: js.Any = js.native
   /* unmapped type */ var bitrateDowngradeTriggerRatio: js.Any = js.native
   /* unmapped type */ var desiredBitrateHeadroomRatio: js.Any = js.native
}

object AdaptiveMediaSourceAdvancedSettings {
  @scala.inline
  def apply(
    allSegmentsIndependent: js.Any,
    bitrateDowngradeTriggerRatio: js.Any,
    desiredBitrateHeadroomRatio: js.Any
  ): AdaptiveMediaSourceAdvancedSettings = {
    val __obj = js.Dynamic.literal(allSegmentsIndependent = allSegmentsIndependent.asInstanceOf[js.Any], bitrateDowngradeTriggerRatio = bitrateDowngradeTriggerRatio.asInstanceOf[js.Any], desiredBitrateHeadroomRatio = desiredBitrateHeadroomRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceAdvancedSettings]
  }
  @scala.inline
  implicit class AdaptiveMediaSourceAdvancedSettingsOps[Self <: AdaptiveMediaSourceAdvancedSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSegmentsIndependent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSegmentsIndependent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitrateDowngradeTriggerRatio(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitrateDowngradeTriggerRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesiredBitrateHeadroomRatio(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredBitrateHeadroomRatio")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

