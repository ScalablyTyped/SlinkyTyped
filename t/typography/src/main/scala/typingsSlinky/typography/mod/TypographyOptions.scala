package typingsSlinky.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypographyOptions extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.native
  var baseLineHeight: js.UndefOr[Double] = js.native
  var blockMarginBottom: js.UndefOr[Double] = js.native
  var bodyColor: js.UndefOr[String] = js.native
  var bodyFontFamily: js.UndefOr[js.Array[String]] = js.native
  var bodyWeight: js.UndefOr[Double | String] = js.native
  var boldWeight: js.UndefOr[Double | String] = js.native
  var googleFonts: js.UndefOr[js.Array[GoogleFont]] = js.native
  var headerColor: js.UndefOr[String] = js.native
  var headerFontFamily: js.UndefOr[js.Array[String]] = js.native
  var headerLineHeight: js.UndefOr[Double] = js.native
  var headerWeight: js.UndefOr[Double | String] = js.native
  var includeNormalize: js.UndefOr[Boolean] = js.native
  var overrideStyles: js.UndefOr[
    js.Function3[
      /* VerticalRhythm */ VerticalRhythm, 
      /* options */ TypographyOptions, 
      /* styles */ js.Any, 
      js.Object
    ]
  ] = js.native
  var overrideThemeStyles: js.UndefOr[
    js.Function3[
      /* VerticalRhythm */ VerticalRhythm, 
      /* options */ TypographyOptions, 
      /* styles */ js.Any, 
      js.Object
    ]
  ] = js.native
  var plugins: js.UndefOr[js.Array[_]] = js.native
  var scaleRatio: js.UndefOr[Double] = js.native
}

object TypographyOptions {
  @scala.inline
  def apply(): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyOptions]
  }
  @scala.inline
  implicit class TypographyOptionsOps[Self <: TypographyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockMarginBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMarginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockMarginBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMarginBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyFontFamily(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyWeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withBoldWeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoldWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleFonts(value: js.Array[GoogleFont]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleFonts")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFontFamily(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerLineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderWeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNormalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNormalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNormalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideStyles(
      value: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideStyles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOverrideStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideThemeStyles(
      value: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideThemeStyles")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOverrideThemeStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideThemeStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRatio")(js.undefined)
        ret
    }
  }
  
}

