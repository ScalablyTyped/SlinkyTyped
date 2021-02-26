package typingsSlinky.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCommentMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlComment", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlComment[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @js.native
  trait IXmlCommentOptions extends StObject {
    
    /**
      * The content of the comment.
      */
    var charData: String = js.native
    
    /**
      * Whether to replace any invalid characters in the content of the comment
      * with the Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
  }
  object IXmlCommentOptions {
    
    @scala.inline
    def apply(charData: String): IXmlCommentOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCommentOptions]
    }
    
    @scala.inline
    implicit class IXmlCommentOptionsMutableBuilder[Self <: IXmlCommentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlComment[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _replaceInvalidCharsInCharData: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this comment.
      */
    def charData: String = js.native
    /**
      * Sets the text of this comment.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this comment.
      */
    def up(): Parent = js.native
  }
}
