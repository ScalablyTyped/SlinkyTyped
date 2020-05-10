package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.fill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSFill extends js.Object {
  var _class: fill = js.native
  var color: js.UndefOr[SketchMSColor] = js.native
  var fillType: SketchMSFillTypeEnum = js.native
  var image: js.UndefOr[SketchMSImageDataReference] = js.native
  var isEnabled: Boolean = js.native
  var noiseIndex: Double = js.native
  var noiseIntensity: Double = js.native
  var patternFillType: SketchMSPatternFillTypeEnum = js.native
  var patternTileScale: Double = js.native
}

object SketchMSFill {
  @scala.inline
  def apply(
    _class: fill,
    fillType: SketchMSFillTypeEnum,
    isEnabled: Boolean,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: SketchMSPatternFillTypeEnum,
    patternTileScale: Double
  ): SketchMSFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSFill]
  }
  @scala.inline
  implicit class SketchMSFillOps[Self <: SketchMSFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillType(value: SketchMSFillTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoiseIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoiseIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternFillType(value: SketchMSPatternFillTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternFillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternTileScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternTileScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: SketchMSColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SketchMSImageDataReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
  }
  
}

