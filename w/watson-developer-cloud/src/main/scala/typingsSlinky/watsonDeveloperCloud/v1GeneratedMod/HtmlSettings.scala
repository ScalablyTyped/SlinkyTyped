package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of HTML conversion settings. */
@js.native
trait HtmlSettings extends StObject {
  
  var exclude_content: js.UndefOr[XPathPatterns] = js.native
  
  /** Array of HTML tag attributes to exclude. */
  var exclude_tag_attributes: js.UndefOr[js.Array[String]] = js.native
  
  /** Array of HTML tags that are excluded completely. */
  var exclude_tags_completely: js.UndefOr[js.Array[String]] = js.native
  
  /** Array of HTML tags which are excluded but still retain content. */
  var exclude_tags_keep_content: js.UndefOr[js.Array[String]] = js.native
  
  var keep_content: js.UndefOr[XPathPatterns] = js.native
  
  /** An array of HTML tag attributes to keep in the converted document. */
  var keep_tag_attributes: js.UndefOr[js.Array[String]] = js.native
}
object HtmlSettings {
  
  @scala.inline
  def apply(): HtmlSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlSettings]
  }
  
  @scala.inline
  implicit class HtmlSettingsMutableBuilder[Self <: HtmlSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude_content(value: XPathPatterns): Self = StObject.set(x, "exclude_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_contentUndefined: Self = StObject.set(x, "exclude_content", js.undefined)
    
    @scala.inline
    def setExclude_tag_attributes(value: js.Array[String]): Self = StObject.set(x, "exclude_tag_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_tag_attributesUndefined: Self = StObject.set(x, "exclude_tag_attributes", js.undefined)
    
    @scala.inline
    def setExclude_tag_attributesVarargs(value: String*): Self = StObject.set(x, "exclude_tag_attributes", js.Array(value :_*))
    
    @scala.inline
    def setExclude_tags_completely(value: js.Array[String]): Self = StObject.set(x, "exclude_tags_completely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_tags_completelyUndefined: Self = StObject.set(x, "exclude_tags_completely", js.undefined)
    
    @scala.inline
    def setExclude_tags_completelyVarargs(value: String*): Self = StObject.set(x, "exclude_tags_completely", js.Array(value :_*))
    
    @scala.inline
    def setExclude_tags_keep_content(value: js.Array[String]): Self = StObject.set(x, "exclude_tags_keep_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_tags_keep_contentUndefined: Self = StObject.set(x, "exclude_tags_keep_content", js.undefined)
    
    @scala.inline
    def setExclude_tags_keep_contentVarargs(value: String*): Self = StObject.set(x, "exclude_tags_keep_content", js.Array(value :_*))
    
    @scala.inline
    def setKeep_content(value: XPathPatterns): Self = StObject.set(x, "keep_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_contentUndefined: Self = StObject.set(x, "keep_content", js.undefined)
    
    @scala.inline
    def setKeep_tag_attributes(value: js.Array[String]): Self = StObject.set(x, "keep_tag_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_tag_attributesUndefined: Self = StObject.set(x, "keep_tag_attributes", js.undefined)
    
    @scala.inline
    def setKeep_tag_attributesVarargs(value: String*): Self = StObject.set(x, "keep_tag_attributes", js.Array(value :_*))
  }
}
