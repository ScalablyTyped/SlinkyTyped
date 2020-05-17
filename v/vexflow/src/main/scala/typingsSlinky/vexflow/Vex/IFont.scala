package typingsSlinky.vexflow.Vex

import typingsSlinky.vexflow.anon.Copyright
import typingsSlinky.vexflow.anon.Ha
import typingsSlinky.vexflow.anon.XMax_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper interface for handling the Vex.Flow.Font object in Vex.Flow.Glyph. Not part of VexFlow!
  */
@js.native
trait IFont extends js.Object {
  var ascender: Double = js.native
  var boundingBox: XMax_ = js.native
  var cssFontStyle: String = js.native
  var cssFontWeight: String = js.native
  var descender: Double = js.native
  var familyName: String = js.native
  var glyphs: js.Array[Ha] = js.native
  var lineHeight: Double = js.native
  /**
    * This property is missing in vexflow_font.js, but present in gonville_original.js and gonville_all.js.
    */
  var original_font_information: js.UndefOr[Copyright] = js.native
  var resolution: Double = js.native
  var underlinePosition: Double = js.native
  var underlineThickness: Double = js.native
}

object IFont {
  @scala.inline
  def apply(
    ascender: Double,
    boundingBox: XMax_,
    cssFontStyle: String,
    cssFontWeight: String,
    descender: Double,
    familyName: String,
    glyphs: js.Array[Ha],
    lineHeight: Double,
    resolution: Double,
    underlinePosition: Double,
    underlineThickness: Double
  ): IFont = {
    val __obj = js.Dynamic.literal(ascender = ascender.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], cssFontStyle = cssFontStyle.asInstanceOf[js.Any], cssFontWeight = cssFontWeight.asInstanceOf[js.Any], descender = descender.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFont]
  }
  @scala.inline
  implicit class IFontOps[Self <: IFont] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingBox(value: XMax_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlyphs(value: js.Array[Ha]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlinePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlinePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnderlineThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_font_information(value: Copyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_font_information")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal_font_information: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_font_information")(js.undefined)
        ret
    }
  }
  
}

