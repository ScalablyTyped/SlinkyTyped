package typingsSlinky.xmlcreate

import typingsSlinky.xmlcreate.optionsMod.IStringOptions
import typingsSlinky.xmlcreate.xmlAttributeTextMod.IXmlAttributeTextOptions
import typingsSlinky.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typingsSlinky.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlAttributeMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlAttribute", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlAttribute[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @js.native
  trait IXmlAttributeOptions extends StObject {
    
    /**
      * The name of the attribute.
      */
    var name: String = js.native
    
    /**
      * Whether to replace any invalid characters in the name of the attribute
      * with the Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.native
  }
  object IXmlAttributeOptions {
    
    @scala.inline
    def apply(name: String): IXmlAttributeOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlAttributeOptions]
    }
    
    @scala.inline
    implicit class IXmlAttributeOptionsMutableBuilder[Self <: IXmlAttributeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInName(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInNameUndefined: Self = StObject.set(x, "replaceInvalidCharsInName", js.undefined)
    }
  }
  
  @js.native
  trait XmlAttribute[Parent] extends StObject {
    
    val _children: js.Any = js.native
    
    var _name: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _replaceInvalidCharsInName: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Adds a character reference to this attribute and returns the new
      * character reference.
      */
    def charRef(options: IXmlCharRefOptions): typingsSlinky.xmlcreate.xmlCharRefMod.default[this.type] = js.native
    
    /**
      * Adds an entity reference to this attribute and returns the new entity
      * reference.
      */
    def entityRef(options: IXmlEntityRefOptions): typingsSlinky.xmlcreate.xmlEntityRefMod.default[this.type] = js.native
    
    /**
      * Gets the name of this attribute.
      */
    def name: String = js.native
    /**
      * Sets the name of this attribute.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Adds attribute text to this attribute and returns the new text.
      */
    def text(options: IXmlAttributeTextOptions): typingsSlinky.xmlcreate.xmlAttributeTextMod.default[this.type] = js.native
    
    def toString(options: IStringOptions): String = js.native
    
    /**
      * Returns the parent of this attribute.
      */
    def up(): Parent = js.native
  }
}
