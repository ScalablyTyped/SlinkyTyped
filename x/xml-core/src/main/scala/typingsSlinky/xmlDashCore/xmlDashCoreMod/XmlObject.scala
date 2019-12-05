package typingsSlinky.xmlDashCore.xmlDashCoreMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.xmlDashCore.Anon_T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlObject")
@js.native
class XmlObject () extends IXmlSerializable {
  val Element: js.UndefOr[org.scalajs.dom.raw.Element | Null] = js.native
  val LocalName: String = js.native
  val NamespaceURI: String | Null = js.native
  var Prefix: String | Null = js.native
  var element: js.UndefOr[org.scalajs.dom.raw.Element | Null] = js.native
  var localName: js.UndefOr[String] = js.native
  var prefix: String | Null = js.native
  /* protected */ def CreateDocument(): Document = js.native
  /* protected */ def CreateElement(): org.scalajs.dom.raw.Element = js.native
  /* protected */ def CreateElement(document: Document): org.scalajs.dom.raw.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String): org.scalajs.dom.raw.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String): org.scalajs.dom.raw.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String, prefix: String): org.scalajs.dom.raw.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: Null, prefix: String): org.scalajs.dom.raw.Element = js.native
  def GetAttribute(name: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String, required: Boolean): String | Null = js.native
  def GetAttribute(name: String, defaultValue: Null, required: Boolean): String | Null = js.native
  def GetChild(localName: String): org.scalajs.dom.raw.Element | Null = js.native
  def GetChild(localName: String, required: Boolean): org.scalajs.dom.raw.Element | Null = js.native
  def GetChildren(localName: String): js.Array[org.scalajs.dom.raw.Element] = js.native
  def GetChildren(localName: String, nameSpace: String): js.Array[org.scalajs.dom.raw.Element] = js.native
  def GetElement(name: String): org.scalajs.dom.raw.Element = js.native
  def GetElement(name: String, required: Boolean): org.scalajs.dom.raw.Element = js.native
  def GetFirstChild(localName: String): org.scalajs.dom.raw.Element | Null = js.native
  def GetFirstChild(localName: String, namespace: String): org.scalajs.dom.raw.Element | Null = js.native
  /* protected */ def GetPrefix(): String = js.native
  /* protected */ def GetStatic(): XmlSchema = js.native
  def GetXml(hard: Boolean): org.scalajs.dom.raw.Element | Null = js.native
  def HasChanged(): Boolean = js.native
  def IsEmpty(): Boolean = js.native
  def LoadXml(param: org.scalajs.dom.raw.Element): Unit = js.native
  /* protected */ def OnGetXml(element: org.scalajs.dom.raw.Element): Unit = js.native
  /* protected */ def OnLoadXml(element: org.scalajs.dom.raw.Element): Unit = js.native
}

/* static members */
@JSImport("xml-core", "XmlObject")
@js.native
object XmlObject extends js.Object {
  var attributes: AssocArray[XmlAttributeType[_]] = js.native
  var elements: AssocArray[XmlChildElementType[_]] = js.native
  var localName: String = js.native
  var namespaceURI: String | Null = js.native
  var prefix: String | Null = js.native
  def CreateDocument(): Document = js.native
  def CreateDocument(root: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = js.native
  def GetAttribute(element: Element, attrName: String): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = js.native
  def GetChild(node: Element, localName: String): Element | Null = js.native
  def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = js.native
  def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = js.native
  def GetChildren(node: Node, localName: String): js.Array[Element] = js.native
  def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = js.native
  def GetElement(element: Element, name: String): Element = js.native
  def GetElement(element: Element, name: String, required: Boolean): Element = js.native
  def GetElementById(document: typingsSlinky.std.Document, idValue: String): Element | Null = js.native
  def GetElementById(element: typingsSlinky.std.Element, idValue: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
  def LoadXml[T /* <: XmlObject */](`this`: Anon_T[T], param: String): T = js.native
  def LoadXml[T /* <: XmlObject */](`this`: Anon_T[T], param: typingsSlinky.std.Element): T = js.native
}

