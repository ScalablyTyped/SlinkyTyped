package typingsSlinky.xmlCore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.xmlCore.typesMod.AssocArray
import typingsSlinky.xmlCore.typesMod.IXmlSerializable
import typingsSlinky.xmlCore.typesMod.XmlAttributeType
import typingsSlinky.xmlCore.typesMod.XmlChildElementType
import typingsSlinky.xmlCore.typesMod.XmlSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml-core/dist/types/xml_object", JSImport.Namespace)
@js.native
object xmlObjectMod extends js.Object {
  
  @js.native
  class XmlObject () extends IXmlSerializable {
    def this(properties: js.Object) = this()
    
    /* protected */ def CreateDocument(): Document = js.native
    
    /* protected */ def CreateElement(): Element = js.native
    /* protected */ def CreateElement(
      document: js.UndefOr[scala.Nothing],
      localName: js.UndefOr[scala.Nothing],
      namespaceUri: js.UndefOr[scala.Nothing],
      prefix: String
    ): Element = js.native
    /* protected */ def CreateElement(document: js.UndefOr[scala.Nothing], localName: js.UndefOr[scala.Nothing], namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(
      document: js.UndefOr[scala.Nothing],
      localName: js.UndefOr[scala.Nothing],
      namespaceUri: String,
      prefix: String
    ): Element = js.native
    /* protected */ def CreateElement(
      document: js.UndefOr[scala.Nothing],
      localName: js.UndefOr[scala.Nothing],
      namespaceUri: Null,
      prefix: String
    ): Element = js.native
    /* protected */ def CreateElement(document: js.UndefOr[scala.Nothing], localName: String): Element = js.native
    /* protected */ def CreateElement(
      document: js.UndefOr[scala.Nothing],
      localName: String,
      namespaceUri: js.UndefOr[scala.Nothing],
      prefix: String
    ): Element = js.native
    /* protected */ def CreateElement(document: js.UndefOr[scala.Nothing], localName: String, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: js.UndefOr[scala.Nothing], localName: String, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: js.UndefOr[scala.Nothing], localName: String, namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document): Element = js.native
    /* protected */ def CreateElement(
      document: Document,
      localName: js.UndefOr[scala.Nothing],
      namespaceUri: js.UndefOr[scala.Nothing],
      prefix: String
    ): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: js.UndefOr[scala.Nothing], namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: js.UndefOr[scala.Nothing], namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: js.UndefOr[scala.Nothing], namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: js.UndefOr[scala.Nothing], prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: Null, prefix: String): Element = js.native
    
    def Element: js.UndefOr[org.scalajs.dom.raw.Element | Null] = js.native
    
    def GetAttribute(name: String): String | Null = js.native
    def GetAttribute(name: String, defaultValue: String): String | Null = js.native
    def GetAttribute(name: String, defaultValue: String, required: Boolean): String | Null = js.native
    def GetAttribute(name: String, defaultValue: Null, required: Boolean): String | Null = js.native
    
    def GetChild(localName: String): Element | Null = js.native
    def GetChild(localName: String, required: Boolean): Element | Null = js.native
    
    def GetChildren(localName: String): js.Array[Element] = js.native
    def GetChildren(localName: String, nameSpace: String): js.Array[Element] = js.native
    
    def GetElement(name: String): Element = js.native
    def GetElement(name: String, required: Boolean): Element = js.native
    
    def GetFirstChild(localName: String): Element | Null = js.native
    def GetFirstChild(localName: String, namespace: String): Element | Null = js.native
    
    /* protected */ def GetPrefix(): String = js.native
    
    /* protected */ def GetStatic(): XmlSchema = js.native
    
    def GetXml(hard: Boolean): Element | Null = js.native
    
    def HasChanged(): Boolean = js.native
    
    def IsEmpty(): Boolean = js.native
    
    def LoadXml(param: Element): Unit = js.native
    
    def LocalName: String = js.native
    
    def NamespaceURI: String | Null = js.native
    
    /* protected */ def OnGetXml(element: Element): Unit = js.native
    
    /* protected */ def OnLoadXml(element: Element): Unit = js.native
    
    def Prefix: String | Null = js.native
    def Prefix_=(value: String | Null): Unit = js.native
    
    /**
      * XmlElement
      * undefined - class initialized
      * null - has some changes
      * element - has cached element
      *
      * @protected
      * @type {(Element | null | undefined)}
      * @memberOf XmlObject
      */
    var element: js.UndefOr[Element | Null] = js.native
    
    var localName: js.UndefOr[String] = js.native
    
    var namespaceURI: js.UndefOr[String | Null] = js.native
    
    var prefix: String | Null = js.native
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
    
    def LoadXml[T /* <: XmlObject */](param: String): T = js.native
    def LoadXml[T /* <: XmlObject */](param: Element): T = js.native
    
    var attributes: AssocArray[XmlAttributeType[_]] = js.native
    
    var elements: AssocArray[XmlChildElementType[_]] = js.native
    
    var localName: String = js.native
    
    var namespaceURI: String | Null = js.native
    
    var prefix: String | Null = js.native
  }
}
