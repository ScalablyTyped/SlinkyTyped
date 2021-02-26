package typingsSlinky.xmldoc

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.xmldoc.xmldocStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmldoc", "XmlCDataNode")
  @js.native
  class XmlCDataNode protected () extends XmlNode {
    def this(cdata: String) = this()
    
    var cdata: String = js.native
    
    def toString(opts: XmlOptions): String = js.native
    
    def toStringWithIndent(indent: String): String = js.native
    def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
    
    var `type`: typingsSlinky.xmldoc.xmldocStrings.cdata = js.native
  }
  
  @JSImport("xmldoc", "XmlCommentNode")
  @js.native
  class XmlCommentNode protected () extends XmlNode {
    def this(comment: String) = this()
    
    var comment: String = js.native
    
    def toString(opts: XmlOptions): String = js.native
    
    def toStringWithIndent(indent: String): String = js.native
    def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
    
    var `type`: typingsSlinky.xmldoc.xmldocStrings.comment = js.native
  }
  
  @JSImport("xmldoc", "XmlDocument")
  @js.native
  class XmlDocument protected () extends XmlElement {
    def this(xml: String) = this()
    
    var doctype: String = js.native
  }
  
  @JSImport("xmldoc", "XmlElement")
  @js.native
  class XmlElement protected () extends XmlNode {
    def this(tag: XmlTag) = this()
    
    var attr: XmlAttributes = js.native
    
    def childNamed(name: String): js.UndefOr[XmlElement] = js.native
    
    def childWithAttribute(name: String): js.UndefOr[XmlElement] = js.native
    def childWithAttribute(name: String, value: String): js.UndefOr[XmlElement] = js.native
    
    var children: js.Array[XmlNode] = js.native
    
    def childrenNamed(name: String): js.Array[XmlElement] = js.native
    
    var column: Double = js.native
    
    def descendantWithPath(path: String): js.UndefOr[XmlElement] = js.native
    
    def eachChild(
      iterator: js.Function3[/* child */ this.type, /* index */ Double, /* array */ js.Array[XmlNode], Unit]
    ): Unit = js.native
    def eachChild[T](
      iterator: js.ThisFunction3[
          /* this */ T, 
          /* child */ this.type, 
          /* index */ Double, 
          /* array */ js.Array[XmlNode], 
          Unit
        ],
      context: T
    ): Unit = js.native
    
    var firstChild: XmlNode | Null = js.native
    
    var lastChild: XmlNode | Null = js.native
    
    var line: Double = js.native
    
    var name: String = js.native
    
    var position: Double = js.native
    
    var startTagPosition: Double = js.native
    
    def toString(opts: XmlOptions): String = js.native
    
    def toStringWithIndent(indent: String): String = js.native
    def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
    
    var `type`: element = js.native
    
    var `val`: String = js.native
    
    def valueWithPath(path: String): js.UndefOr[String] = js.native
  }
  
  @JSImport("xmldoc", "XmlTextNode")
  @js.native
  class XmlTextNode protected () extends XmlNode {
    def this(text: String) = this()
    
    var text: String = js.native
    
    def toString(opts: XmlOptions): String = js.native
    
    def toStringWithIndent(indent: String): String = js.native
    def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
    
    var `type`: typingsSlinky.xmldoc.xmldocStrings.text = js.native
  }
  
  type XmlAttributes = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.xmldoc.mod.XmlElement
    - typingsSlinky.xmldoc.mod.XmlTextNode
    - typingsSlinky.xmldoc.mod.XmlCDataNode
    - typingsSlinky.xmldoc.mod.XmlCommentNode
  */
  trait XmlNode extends StObject
  
  @js.native
  trait XmlOptions extends StObject {
    
    var compressed: js.UndefOr[Boolean] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var preserveWhitespace: js.UndefOr[Boolean] = js.native
    
    var trimmed: js.UndefOr[Boolean] = js.native
  }
  object XmlOptions {
    
    @scala.inline
    def apply(): XmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlOptions]
    }
    
    @scala.inline
    implicit class XmlOptionsMutableBuilder[Self <: XmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      @scala.inline
      def setTrimmed(value: Boolean): Self = StObject.set(x, "trimmed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimmedUndefined: Self = StObject.set(x, "trimmed", js.undefined)
    }
  }
  
  @js.native
  trait XmlTag extends StObject {
    
    var attributes: XmlAttributes = js.native
    
    var name: String = js.native
  }
  object XmlTag {
    
    @scala.inline
    def apply(attributes: XmlAttributes, name: String): XmlTag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlTag]
    }
    
    @scala.inline
    implicit class XmlTagMutableBuilder[Self <: XmlTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: XmlAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
