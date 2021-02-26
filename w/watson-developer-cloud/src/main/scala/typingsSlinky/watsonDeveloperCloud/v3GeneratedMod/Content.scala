package typingsSlinky.watsonDeveloperCloud.v3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Content. */
@js.native
trait Content extends StObject {
  
  /** An array of `ContentItem` objects that provides the text that is to be analyzed. */
  var content_items: js.Array[ContentItem] = js.native
}
object Content {
  
  @scala.inline
  def apply(content_items: js.Array[ContentItem]): Content = {
    val __obj = js.Dynamic.literal(content_items = content_items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_items(value: js.Array[ContentItem]): Self = StObject.set(x, "content_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_itemsVarargs(value: ContentItem*): Self = StObject.set(x, "content_items", js.Array(value :_*))
  }
}
