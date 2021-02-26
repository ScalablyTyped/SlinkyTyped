package typingsSlinky.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCdataMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlCdata[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @js.native
  trait IXmlCdataOptions extends StObject {
    
    /**
      * The character data of the CDATA section.
      */
    var charData: String = js.native
    
    /**
      * Whether to replace any invalid characters in the character data of the
      * CDATA section with the Unicode replacement character. By default, this
      * is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
  }
  object IXmlCdataOptions {
    
    @scala.inline
    def apply(charData: String): IXmlCdataOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCdataOptions]
    }
    
    @scala.inline
    implicit class IXmlCdataOptionsMutableBuilder[Self <: IXmlCdataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlCdata[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _replaceInvalidCharsInCharData: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the character data of this CDATA section.
      */
    def charData: String = js.native
    /**
      * Sets the character data of this CDATA section.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this CDATA section.
      */
    def up(): Parent = js.native
  }
}
