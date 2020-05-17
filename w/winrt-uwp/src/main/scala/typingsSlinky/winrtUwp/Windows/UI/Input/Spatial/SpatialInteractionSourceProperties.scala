package typingsSlinky.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionSourceProperties extends js.Object {
  var sourceLossRisk: js.Any = js.native
   /* unmapped type */ var tryGetLocation: js.Any = js.native
   /* unmapped type */ var tryGetSourceLossMitigationDirection: js.Any = js.native
}

object SpatialInteractionSourceProperties {
  @scala.inline
  def apply(sourceLossRisk: js.Any, tryGetLocation: js.Any, tryGetSourceLossMitigationDirection: js.Any): SpatialInteractionSourceProperties = {
    val __obj = js.Dynamic.literal(sourceLossRisk = sourceLossRisk.asInstanceOf[js.Any], tryGetLocation = tryGetLocation.asInstanceOf[js.Any], tryGetSourceLossMitigationDirection = tryGetSourceLossMitigationDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceProperties]
  }
  @scala.inline
  implicit class SpatialInteractionSourcePropertiesOps[Self <: SpatialInteractionSourceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceLossRisk(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLossRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetLocation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTryGetSourceLossMitigationDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryGetSourceLossMitigationDirection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

