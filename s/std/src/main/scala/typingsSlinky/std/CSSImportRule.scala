package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSImportRule extends CSSRule {
  
  val href: java.lang.String = js.native
  
  val media: org.scalajs.dom.raw.MediaList = js.native
  
  val styleSheet: org.scalajs.dom.raw.CSSStyleSheet = js.native
}
object CSSImportRule {
  
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
    href: java.lang.String,
    media: org.scalajs.dom.raw.MediaList,
    styleSheet: org.scalajs.dom.raw.CSSStyleSheet,
    `type`: Double
  ): org.scalajs.dom.raw.CSSImportRule = {
    val __obj = js.Dynamic.literal(CHARSET_RULE = CHARSET_RULE.asInstanceOf[js.Any], FONT_FACE_RULE = FONT_FACE_RULE.asInstanceOf[js.Any], IMPORT_RULE = IMPORT_RULE.asInstanceOf[js.Any], KEYFRAMES_RULE = KEYFRAMES_RULE.asInstanceOf[js.Any], KEYFRAME_RULE = KEYFRAME_RULE.asInstanceOf[js.Any], MEDIA_RULE = MEDIA_RULE.asInstanceOf[js.Any], NAMESPACE_RULE = NAMESPACE_RULE.asInstanceOf[js.Any], PAGE_RULE = PAGE_RULE.asInstanceOf[js.Any], STYLE_RULE = STYLE_RULE.asInstanceOf[js.Any], SUPPORTS_RULE = SUPPORTS_RULE.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], styleSheet = styleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.CSSImportRule]
  }
  
  @scala.inline
  implicit class CSSImportRuleMutableBuilder[Self <: org.scalajs.dom.raw.CSSImportRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: org.scalajs.dom.raw.MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheet(value: org.scalajs.dom.raw.CSSStyleSheet): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
  }
}
