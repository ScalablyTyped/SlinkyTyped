package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single CSS @media rule. It implements the CSSConditionRule interface, and therefore the CSSGroupingRule and the CSSRule interface with a type value of 4 (CSSRule.MEDIA_RULE). */
@js.native
trait CSSMediaRule extends CSSConditionRule {
  val media: org.scalajs.dom.raw.MediaList = js.native
}

object CSSMediaRule {
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
    conditionText: java.lang.String,
    cssRules: org.scalajs.dom.raw.CSSRuleList,
    cssText: java.lang.String,
    deleteRule: Double => Unit,
    insertRule: (java.lang.String, Double) => Double,
    media: org.scalajs.dom.raw.MediaList,
    `type`: Double
  ): CSSMediaRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], UNKNOWN_RULE = UNKNOWN_RULE.asInstanceOf[js.Any], VIEWPORT_RULE = VIEWPORT_RULE.asInstanceOf[js.Any], conditionText = conditionText.asInstanceOf[js.Any], cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1(deleteRule), insertRule = js.Any.fromFunction2(insertRule), media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSMediaRule]
  }
  @scala.inline
  implicit class CSSMediaRuleOps[Self <: org.scalajs.dom.raw.CSSMediaRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: org.scalajs.dom.raw.MediaList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

