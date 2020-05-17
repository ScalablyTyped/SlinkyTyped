package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any CSS at-rule that contains other rules nested within it. */
@js.native
trait CSSGroupingRule extends CSSRule {
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  def deleteRule(index: Double): Unit = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}

object CSSGroupingRule {
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
    cssRules: org.scalajs.dom.raw.CSSRuleList,
    cssText: java.lang.String,
    deleteRule: Double => Unit,
    insertRule: (java.lang.String, Double) => Double,
    `type`: Double
  ): CSSGroupingRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], UNKNOWN_RULE = UNKNOWN_RULE.asInstanceOf[js.Any], VIEWPORT_RULE = VIEWPORT_RULE.asInstanceOf[js.Any], cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1(deleteRule), insertRule = js.Any.fromFunction2(insertRule))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSGroupingRule]
  }
  @scala.inline
  implicit class CSSGroupingRuleOps[Self <: CSSGroupingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssRules(value: org.scalajs.dom.raw.CSSRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteRule(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsertRule(value: (java.lang.String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRule")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

