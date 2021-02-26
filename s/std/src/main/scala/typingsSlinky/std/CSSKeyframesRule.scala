package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing a complete set of keyframes for a CSS animation. It corresponds to the contains of a whole @keyframes at-rule. It implements the CSSRule interface with a type value of 7 (CSSRule.KEYFRAMES_RULE). */
@js.native
trait CSSKeyframesRule extends CSSRule {
  
  def appendRule(rule: java.lang.String): Unit = js.native
  
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  
  def deleteRule(select: java.lang.String): Unit = js.native
  
  def findRule(select: java.lang.String): org.scalajs.dom.raw.CSSKeyframeRule | Null = js.native
  
  var name: java.lang.String = js.native
}
object CSSKeyframesRule {
  
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
    appendRule: java.lang.String => Unit,
    cssRules: org.scalajs.dom.raw.CSSRuleList,
    cssText: java.lang.String,
    deleteRule: java.lang.String => Unit,
    findRule: java.lang.String => org.scalajs.dom.raw.CSSKeyframeRule | Null,
    name: java.lang.String,
    `type`: Double
  ): org.scalajs.dom.raw.CSSKeyframesRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], appendRule = js.Any.fromFunction1(appendRule), cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1(deleteRule), findRule = js.Any.fromFunction1(findRule), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.CSSKeyframesRule]
  }
  
  @scala.inline
  implicit class CSSKeyframesRuleMutableBuilder[Self <: org.scalajs.dom.raw.CSSKeyframesRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendRule(value: java.lang.String => Unit): Self = StObject.set(x, "appendRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCssRules(value: org.scalajs.dom.raw.CSSRuleList): Self = StObject.set(x, "cssRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRule(value: java.lang.String => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindRule(value: java.lang.String => org.scalajs.dom.raw.CSSKeyframeRule | Null): Self = StObject.set(x, "findRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
