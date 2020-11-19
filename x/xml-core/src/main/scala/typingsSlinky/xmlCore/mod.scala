package typingsSlinky.xmlCore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.std.BufferSource
import typingsSlinky.xmlCore.errorMod.XE
import typingsSlinky.xmlCore.typesMod.AssocArray
import typingsSlinky.xmlCore.typesMod.IConverter
import typingsSlinky.xmlCore.typesMod.XmlAttributeType
import typingsSlinky.xmlCore.typesMod.XmlBufferEncoding
import typingsSlinky.xmlCore.typesMod.XmlChildElementType
import typingsSlinky.xmlCore.typesMod.XmlContentType
import typingsSlinky.xmlCore.typesMod.XmlElementType
import typingsSlinky.xmlCore.utilsMod.SelectNodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  def Parse(xmlString: String): Document = js.native
  
  val Select: SelectNodes = js.native
  
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  
  def Stringify(target: Node): String = js.native
  
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  val XmlBase64Converter: IConverter[js.typedarray.Uint8Array] = js.native
  
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
  
  val XmlNumberConverter: IConverter[Double] = js.native
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  def isDocument(obj: js.Any): /* is std.Document */ Boolean = js.native
  
  def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
  
  @js.native
  class Collection[I] ()
    extends typingsSlinky.xmlCore.collectionMod.Collection[I] {
    def this(items: js.Array[I]) = this()
  }
  
  @js.native
  class Convert ()
    extends typingsSlinky.xmlCore.convertMod.Convert
  /* static members */
  @js.native
  object Convert extends js.Object {
    
    /* protected */ def Base64Padding(base64: String): String = js.native
    
    def FromBase64(base64Text: String): js.typedarray.Uint8Array = js.native
    
    def FromBase64Url(base64url: String): js.typedarray.Uint8Array = js.native
    
    def FromBinary(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Converts Date to string
      *
      * @static
      * @param {Date} dateTime
      * @returns {string}
      *
      * @memberOf Convert
      */
    def FromDateTime(dateTime: js.Date): String = js.native
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    def FromHex(hexString: String): js.typedarray.Uint8Array = js.native
    
    def FromString(str: String): js.typedarray.Uint8Array = js.native
    def FromString(str: String, enc: XmlBufferEncoding): js.typedarray.Uint8Array = js.native
    
    def FromUtf8String(text: String): js.typedarray.Uint8Array = js.native
    
    def ToBase64(buf: js.typedarray.Uint8Array): String = js.native
    
    def ToBase64Url(data: js.typedarray.Uint8Array): String = js.native
    
    def ToBinary(buffer: js.typedarray.Uint8Array): String = js.native
    
    /**
      * Converts string to Date
      *
      * @static
      * @param {string} dateTime
      * @returns {Date}
      *
      * @memberOf Convert
      */
    def ToDateTime(dateTime: String): js.Date = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: js.typedarray.Uint8Array): String = js.native
    
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
    
    def ToUtf8String(buffer: js.typedarray.Uint8Array): String = js.native
  }
  
  @js.native
  class NamespaceManager ()
    extends typingsSlinky.xmlCore.namespaceManagerMod.NamespaceManager
  
  @js.native
  object XE extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.xmlCore.errorMod.XE with Double] = js.native
    
    /* 16 */ val ALGORITHM_NOT_SUPPORTED: typingsSlinky.xmlCore.errorMod.XE.ALGORITHM_NOT_SUPPORTED with Double = js.native
    
    /* 17 */ val ALGORITHM_WRONG_NAME: typingsSlinky.xmlCore.errorMod.XE.ALGORITHM_WRONG_NAME with Double = js.native
    
    /* 11 */ val ATTRIBUTE_MISSING: typingsSlinky.xmlCore.errorMod.XE.ATTRIBUTE_MISSING with Double = js.native
    
    /* 4 */ val COLLECTION_LIMIT: typingsSlinky.xmlCore.errorMod.XE.COLLECTION_LIMIT with Double = js.native
    
    /* 12 */ val CONTENT_MISSING: typingsSlinky.xmlCore.errorMod.XE.CONTENT_MISSING with Double = js.native
    
    /* 8 */ val CONVERTER_UNSUPPORTED: typingsSlinky.xmlCore.errorMod.XE.CONVERTER_UNSUPPORTED with Double = js.native
    
    /* 13 */ val CRYPTOGRAPHIC: typingsSlinky.xmlCore.errorMod.XE.CRYPTOGRAPHIC with Double = js.native
    
    /* 14 */ val CRYPTOGRAPHIC_NO_MODULE: typingsSlinky.xmlCore.errorMod.XE.CRYPTOGRAPHIC_NO_MODULE with Double = js.native
    
    /* 15 */ val CRYPTOGRAPHIC_UNKNOWN_TRANSFORM: typingsSlinky.xmlCore.errorMod.XE.CRYPTOGRAPHIC_UNKNOWN_TRANSFORM with Double = js.native
    
    /* 3 */ val DECORATOR_NULL_PARAM: typingsSlinky.xmlCore.errorMod.XE.DECORATOR_NULL_PARAM with Double = js.native
    
    /* 9 */ val ELEMENT_MALFORMED: typingsSlinky.xmlCore.errorMod.XE.ELEMENT_MALFORMED with Double = js.native
    
    /* 10 */ val ELEMENT_MISSING: typingsSlinky.xmlCore.errorMod.XE.ELEMENT_MISSING with Double = js.native
    
    /* 5 */ val METHOD_NOT_IMPLEMENTED: typingsSlinky.xmlCore.errorMod.XE.METHOD_NOT_IMPLEMENTED with Double = js.native
    
    /* 6 */ val METHOD_NOT_SUPPORTED: typingsSlinky.xmlCore.errorMod.XE.METHOD_NOT_SUPPORTED with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.xmlCore.errorMod.XE.NONE with Double = js.native
    
    /* 2 */ val NULL_PARAM: typingsSlinky.xmlCore.errorMod.XE.NULL_PARAM with Double = js.native
    
    /* 1 */ val NULL_REFERENCE: typingsSlinky.xmlCore.errorMod.XE.NULL_REFERENCE with Double = js.native
    
    /* 7 */ val PARAM_REQUIRED: typingsSlinky.xmlCore.errorMod.XE.PARAM_REQUIRED with Double = js.native
    
    /* 18 */ val XML_EXCEPTION: typingsSlinky.xmlCore.errorMod.XE.XML_EXCEPTION with Double = js.native
  }
  
  @js.native
  class XmlCollection[I /* <: typingsSlinky.xmlCore.xmlObjectMod.XmlObject */] ()
    extends typingsSlinky.xmlCore.xmlCollectionMod.XmlCollection[I]
  /* static members */
  @js.native
  object XmlCollection extends js.Object {
    
    var parser: js.Any = js.native
  }
  
  @js.native
  class XmlError protected ()
    extends typingsSlinky.xmlCore.errorMod.XmlError {
    def this(code: XE, args: js.Any*) = this()
  }
  
  @js.native
  object XmlNodeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.xmlCore.xmlMod.XmlNodeType with Double] = js.native
    
    /* 2 */ val Attribute: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Attribute with Double = js.native
    
    /* 4 */ val CDATA: typingsSlinky.xmlCore.xmlMod.XmlNodeType.CDATA with Double = js.native
    
    /* 8 */ val Comment: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Comment with Double = js.native
    
    /* 9 */ val Document: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Document with Double = js.native
    
    /* 11 */ val DocumentFragment: typingsSlinky.xmlCore.xmlMod.XmlNodeType.DocumentFragment with Double = js.native
    
    /* 10 */ val DocumentType: typingsSlinky.xmlCore.xmlMod.XmlNodeType.DocumentType with Double = js.native
    
    /* 1 */ val Element: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Element with Double = js.native
    
    /* 15 */ val EndElement: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EndElement with Double = js.native
    
    /* 16 */ val EndEntity: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EndEntity with Double = js.native
    
    /* 6 */ val Entity: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Entity with Double = js.native
    
    /* 5 */ val EntityReference: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EntityReference with Double = js.native
    
    /* 0 */ val None: typingsSlinky.xmlCore.xmlMod.XmlNodeType.None with Double = js.native
    
    /* 12 */ val Notation: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Notation with Double = js.native
    
    /* 7 */ val ProcessingInstruction: typingsSlinky.xmlCore.xmlMod.XmlNodeType.ProcessingInstruction with Double = js.native
    
    /* 14 */ val SignificantWhitespace: typingsSlinky.xmlCore.xmlMod.XmlNodeType.SignificantWhitespace with Double = js.native
    
    /* 3 */ val Text: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Text with Double = js.native
    
    /* 13 */ val Whitespace: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Whitespace with Double = js.native
    
    /* 17 */ val XmlDeclaration: typingsSlinky.xmlCore.xmlMod.XmlNodeType.XmlDeclaration with Double = js.native
  }
  
  @js.native
  class XmlObject ()
    extends typingsSlinky.xmlCore.xmlObjectMod.XmlObject {
    def this(properties: js.Object) = this()
  }
  /* static members */
  @js.native
  object XmlObject extends js.Object {
    
    /**
      * Creates new instance of XmlDocument with given name of root element
      * @param  {string} root Name of root element
      * @param  {string} namespaceUri
      * @param  {string} prefix
      * @returns Document
      */
    def CreateDocument(): Document = js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: js.UndefOr[scala.Nothing], prefix: String): Document = js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: String): Document = js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: String, prefix: String): Document = js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: Null, prefix: String): Document = js.native
    def CreateDocument(root: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: js.UndefOr[scala.Nothing], prefix: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = js.native
    
    def GetAttribute(element: Element, attrName: String): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = js.native
    
    def GetChild(node: Element, localName: String): Element | Null = js.native
    def GetChild(node: Element, localName: String, nameSpace: js.UndefOr[scala.Nothing], required: Boolean): Element | Null = js.native
    def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = js.native
    def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = js.native
    
    def GetChildren(node: Node, localName: String): js.Array[Element] = js.native
    def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = js.native
    
    def GetElement(element: Element, name: String): Element = js.native
    def GetElement(element: Element, name: String, required: Boolean): Element = js.native
    
    def GetElementById(element: Document, idValue: String): Element | Null = js.native
    def GetElementById(element: Element, idValue: String): Element | Null = js.native
    
    def GetFirstChild(node: Node, localName: String): Element | Null = js.native
    def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
    
    def LoadXml[T /* <: typingsSlinky.xmlCore.xmlObjectMod.XmlObject */](param: String): T = js.native
    def LoadXml[T /* <: typingsSlinky.xmlCore.xmlObjectMod.XmlObject */](param: Element): T = js.native
    
    var attributes: AssocArray[XmlAttributeType[_]] = js.native
    
    var elements: AssocArray[XmlChildElementType[_]] = js.native
    
    var localName: String = js.native
    
    var namespaceURI: String | Null = js.native
    
    var prefix: String | Null = js.native
  }
}
