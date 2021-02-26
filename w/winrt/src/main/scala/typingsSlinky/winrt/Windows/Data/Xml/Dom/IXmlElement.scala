package typingsSlinky.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlElement extends IXmlNode {
  
  def getAttribute(attributeName: String): String = js.native
  
  def getAttributeNS(namespaceUri: js.Any, localName: String): String = js.native
  
  def getAttributeNode(attributeName: String): XmlAttribute = js.native
  
  def getAttributeNodeNS(namespaceUri: js.Any, localName: String): XmlAttribute = js.native
  
  def getElementsByTagName(tagName: String): XmlNodeList = js.native
  
  def removeAttribute(attributeName: String): Unit = js.native
  
  def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit = js.native
  
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute = js.native
  
  def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
  
  def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit = js.native
  
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute = js.native
  
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute = js.native
  
  var tagName: String = js.native
}
object IXmlElement {
  
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    firstChild: IXmlNode,
    getAttribute: String => String,
    getAttributeNS: (js.Any, String) => String,
    getAttributeNode: String => XmlAttribute,
    getAttributeNodeNS: (js.Any, String) => XmlAttribute,
    getElementsByTagName: String => XmlNodeList,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => Unit,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeAttribute: String => Unit,
    removeAttributeNS: (js.Any, String) => Unit,
    removeAttributeNode: XmlAttribute => XmlAttribute,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode,
    setAttribute: (String, String) => Unit,
    setAttributeNS: (js.Any, String, String) => Unit,
    setAttributeNode: XmlAttribute => XmlAttribute,
    setAttributeNodeNS: XmlAttribute => XmlAttribute,
    tagName: String
  ): IXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlElement]
  }
  
  @scala.inline
  implicit class IXmlElementMutableBuilder[Self <: IXmlElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttribute(value: String => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNS(value: (js.Any, String) => String): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNode(value: String => XmlAttribute): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNodeNS(value: (js.Any, String) => XmlAttribute): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => XmlNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttribute(value: String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNS(value: (js.Any, String) => Unit): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttributeNode(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeNS(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeNode(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNS(value: XmlAttribute => XmlAttribute): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
