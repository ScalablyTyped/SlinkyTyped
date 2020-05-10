package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PannerOptions extends AudioNodeOptions {
  var coneInnerAngle: js.UndefOr[Double] = js.native
  var coneOuterAngle: js.UndefOr[Double] = js.native
  var coneOuterGain: js.UndefOr[Double] = js.native
  var distanceModel: js.UndefOr[DistanceModelType] = js.native
  var maxDistance: js.UndefOr[Double] = js.native
  var orientationX: js.UndefOr[Double] = js.native
  var orientationY: js.UndefOr[Double] = js.native
  var orientationZ: js.UndefOr[Double] = js.native
  var panningModel: js.UndefOr[PanningModelType] = js.native
  var positionX: js.UndefOr[Double] = js.native
  var positionY: js.UndefOr[Double] = js.native
  var positionZ: js.UndefOr[Double] = js.native
  var refDistance: js.UndefOr[Double] = js.native
  var rolloffFactor: js.UndefOr[Double] = js.native
}

object PannerOptions {
  @scala.inline
  def apply(): PannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PannerOptions]
  }
  @scala.inline
  implicit class PannerOptionsOps[Self <: PannerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConeInnerAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneInnerAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeInnerAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneInnerAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withConeOuterAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeOuterAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withConeOuterGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterGain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConeOuterGain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coneOuterGain")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceModel(value: DistanceModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationX")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationY")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationZ")(js.undefined)
        ret
    }
    @scala.inline
    def withPanningModel(value: PanningModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanningModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panningModel")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionZ")(js.undefined)
        ret
    }
    @scala.inline
    def withRefDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withRolloffFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloffFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloffFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloffFactor")(js.undefined)
        ret
    }
  }
  
}

