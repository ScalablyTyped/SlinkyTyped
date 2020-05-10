package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.graphicsContextSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSGraphicsContextSettings extends js.Object {
  var _class: graphicsContextSettings = js.native
  var blendMode: SketchMSGraphicsContextSettingsBlendMode = js.native
  var opacity: Double = js.native
}

object SketchMSGraphicsContextSettings {
  @scala.inline
  def apply(
    _class: graphicsContextSettings,
    blendMode: SketchMSGraphicsContextSettingsBlendMode,
    opacity: Double
  ): SketchMSGraphicsContextSettings = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSGraphicsContextSettings]
  }
  @scala.inline
  implicit class SketchMSGraphicsContextSettingsOps[Self <: SketchMSGraphicsContextSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: graphicsContextSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: SketchMSGraphicsContextSettingsBlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

