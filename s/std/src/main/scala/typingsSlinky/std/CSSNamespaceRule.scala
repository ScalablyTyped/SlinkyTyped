package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object representing a single CSS @namespace at-rule. It implements the CSSRule interface, with a type value of 10 (CSSRule.NAMESPACE_RULE). */
@js.native
trait CSSNamespaceRule extends CSSRule {
  
  val namespaceURI: java.lang.String = js.native
  
  val prefix: java.lang.String = js.native
}
object CSSNamespaceRule {
  
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
    cssText: java.lang.String,
    namespaceURI: java.lang.String,
    prefix: java.lang.String,
    `type`: Double
  ): org.scalajs.dom.raw.CSSNamespaceRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.CSSNamespaceRule]
  }
  
  @scala.inline
  implicit class CSSNamespaceRuleMutableBuilder[Self <: org.scalajs.dom.raw.CSSNamespaceRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespaceURI(value: java.lang.String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
