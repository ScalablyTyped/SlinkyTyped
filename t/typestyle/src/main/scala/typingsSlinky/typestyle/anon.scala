package typingsSlinky.typestyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoGenerateTag extends StObject {
    
    var autoGenerateTag: Boolean = js.native
  }
  object AutoGenerateTag {
    
    @scala.inline
    def apply(autoGenerateTag: Boolean): AutoGenerateTag = {
      val __obj = js.Dynamic.literal(autoGenerateTag = autoGenerateTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoGenerateTag]
    }
    
    @scala.inline
    implicit class AutoGenerateTagMutableBuilder[Self <: AutoGenerateTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGenerateTag(value: Boolean): Self = StObject.set(x, "autoGenerateTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextContent extends StObject {
    
    var textContent: String | Null = js.native
  }
  object TextContent {
    
    @scala.inline
    def apply(): TextContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextContent]
    }
    
    @scala.inline
    implicit class TextContentMutableBuilder[Self <: TextContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContentNull: Self = StObject.set(x, "textContent", null)
    }
  }
}
