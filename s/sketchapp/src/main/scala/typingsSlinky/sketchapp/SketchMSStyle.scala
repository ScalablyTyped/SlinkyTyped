package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSStyle extends js.Object {
  var _class: style = js.native
  var blur: js.UndefOr[SketchMSStyleBlur] = js.native
  var borderOptions: js.UndefOr[SketchMSStyleBorderOptions] = js.native
  var borders: js.UndefOr[js.Array[SketchMSStyleBorder]] = js.native
  var colorControls: js.UndefOr[SketchMSStyleColorControls] = js.native
  var contextSettings: js.UndefOr[SketchMSGraphicsContextSettings] = js.native
  var do_objectID: String = js.native
  var endDecorationType: js.UndefOr[Double] = js.native
  var endMarkerType: Double = js.native
  var fills: js.UndefOr[js.Array[SketchMSStyleFill]] = js.native
  var innerShadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.native
  var miterLimit: Double = js.native
  var reflection: js.UndefOr[SketchMSStyleReflection] = js.native
  var shadows: js.UndefOr[js.Array[SketchMSStyleShadow]] = js.native
  var startDecorationType: js.UndefOr[Double] = js.native
  var startMarkerType: Double = js.native
  var textStyle: js.UndefOr[SketchMSTextStyle] = js.native
  var windingRule: Double = js.native
}

object SketchMSStyle {
  @scala.inline
  def apply(
    _class: style,
    do_objectID: String,
    endMarkerType: Double,
    miterLimit: Double,
    startMarkerType: Double,
    windingRule: Double
  ): SketchMSStyle = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], endMarkerType = endMarkerType.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], startMarkerType = startMarkerType.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSStyle]
  }
  @scala.inline
  implicit class SketchMSStyleOps[Self <: SketchMSStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDo_objectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("do_objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndMarkerType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endMarkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMarkerType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMarkerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindingRule(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlur(value: SketchMSStyleBlur): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderOptions(value: SketchMSStyleBorderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withBorders(value: js.Array[SketchMSStyleBorder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borders")(js.undefined)
        ret
    }
    @scala.inline
    def withColorControls(value: SketchMSStyleColorControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorControls")(js.undefined)
        ret
    }
    @scala.inline
    def withContextSettings(value: SketchMSGraphicsContextSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDecorationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDecorationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDecorationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDecorationType")(js.undefined)
        ret
    }
    @scala.inline
    def withFills(value: js.Array[SketchMSStyleFill]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fills")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFills: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fills")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerShadows(value: js.Array[SketchMSStyleShadow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerShadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerShadows")(js.undefined)
        ret
    }
    @scala.inline
    def withReflection(value: SketchMSStyleReflection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflection")(js.undefined)
        ret
    }
    @scala.inline
    def withShadows(value: js.Array[SketchMSStyleShadow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadows")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDecorationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDecorationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDecorationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDecorationType")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: SketchMSTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

