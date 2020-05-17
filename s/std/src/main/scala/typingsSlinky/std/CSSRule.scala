package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS rule. There are several types of rules, listed in the Type constants section below. */
@js.native
trait CSSRule extends js.Object {
  val CHARSET_RULE: Double = js.native
  val FONT_FACE_RULE: Double = js.native
  val IMPORT_RULE: Double = js.native
  val KEYFRAMES_RULE: Double = js.native
  val KEYFRAME_RULE: Double = js.native
  val MEDIA_RULE: Double = js.native
  val NAMESPACE_RULE: Double = js.native
  val PAGE_RULE: Double = js.native
  val STYLE_RULE: Double = js.native
  val SUPPORTS_RULE: Double = js.native
  val UNKNOWN_RULE: Double = js.native
  val VIEWPORT_RULE: Double = js.native
  var cssText: java.lang.String = js.native
  val parentRule: org.scalajs.dom.raw.CSSRule | Null = js.native
  val parentStyleSheet: org.scalajs.dom.raw.CSSStyleSheet | Null = js.native
  val `type`: Double = js.native
}

object CSSRule {
  @scala.inline
  def apply(
    CHARSET_RULE: Double,
    FONT_FACE_RULE: Double,
    IMPORT_RULE: Double,
    KEYFRAMES_RULE: Double,
    KEYFRAME_RULE: Double,
    MEDIA_RULE: Double,
    NAMESPACE_RULE: Double,
    PAGE_RULE: Double,
    STYLE_RULE: Double,
    SUPPORTS_RULE: Double,
    UNKNOWN_RULE: Double,
    VIEWPORT_RULE: Double,
    cssText: java.lang.String,
    `type`: Double
  ): CSSRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], UNKNOWN_RULE = UNKNOWN_RULE.asInstanceOf[js.Any], VIEWPORT_RULE = VIEWPORT_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSRule]
  }
  @scala.inline
  implicit class CSSRuleOps[Self <: org.scalajs.dom.raw.CSSRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHARSET_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHARSET_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFONT_FACE_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FONT_FACE_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMPORT_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMPORT_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKEYFRAMES_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEYFRAMES_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKEYFRAME_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEYFRAME_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAMESPACE_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAMESPACE_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTYLE_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STYLE_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUPPORTS_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVIEWPORT_RULE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VIEWPORT_RULE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRule(value: org.scalajs.dom.raw.CSSRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentRuleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentRule")(null)
        ret
    }
    @scala.inline
    def withParentStyleSheet(value: org.scalajs.dom.raw.CSSStyleSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentStyleSheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentStyleSheetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentStyleSheet")(null)
        ret
    }
  }
  
}

