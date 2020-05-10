package typingsSlinky.shevyjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontScalePresets extends js.Object {
  var augmentedFourth: Scale = js.native
  var majorSecond: Scale = js.native
  var majorThird: Scale = js.native
  var minorThird: Scale = js.native
  var perfectFourth: Scale = js.native
}

object FontScalePresets {
  @scala.inline
  def apply(
    augmentedFourth: Scale,
    majorSecond: Scale,
    majorThird: Scale,
    minorThird: Scale,
    perfectFourth: Scale
  ): FontScalePresets = {
    val __obj = js.Dynamic.literal(augmentedFourth = augmentedFourth.asInstanceOf[js.Any], majorSecond = majorSecond.asInstanceOf[js.Any], majorThird = majorThird.asInstanceOf[js.Any], minorThird = minorThird.asInstanceOf[js.Any], perfectFourth = perfectFourth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontScalePresets]
  }
  @scala.inline
  implicit class FontScalePresetsOps[Self <: FontScalePresets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAugmentedFourth(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("augmentedFourth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorSecond(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorThird(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorThird")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorThird(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorThird")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerfectFourth(value: Scale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfectFourth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

