package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.styleFill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyleFill extends js.Object {
  var _class: styleFill = js.native
  var color: SketchMSColor = js.native
  var contextSettings: SketchMSGraphicsContextSettings = js.native
  var fillType: Double = js.native
  var gradient: SketchMSGradient = js.native
  var isEnabled: Double = js.native
  var noiseIndex: Double = js.native
  var noiseIntensity: Double = js.native
  var patternFillType: Double = js.native
  var patternTileScale: Double = js.native
}

object SketchMSStyleFill {
  @scala.inline
  def apply(
    _class: styleFill,
    color: SketchMSColor,
    contextSettings: SketchMSGraphicsContextSettings,
    fillType: Double,
    gradient: SketchMSGradient,
    isEnabled: Double,
    noiseIndex: Double,
    noiseIntensity: Double,
    patternFillType: Double,
    patternTileScale: Double
  ): SketchMSStyleFill = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contextSettings = contextSettings.asInstanceOf[js.Any], fillType = fillType.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], noiseIndex = noiseIndex.asInstanceOf[js.Any], noiseIntensity = noiseIntensity.asInstanceOf[js.Any], patternFillType = patternFillType.asInstanceOf[js.Any], patternTileScale = patternTileScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyleFill]
  }
  @scala.inline
  implicit class SketchMSStyleFillOps[Self <: SketchMSStyleFill] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: styleFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: SketchMSColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextSettings(value: SketchMSGraphicsContextSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: SketchMSGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Double): Self = {
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
    def withPatternFillType(value: Double): Self = {
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
  }
  
}

