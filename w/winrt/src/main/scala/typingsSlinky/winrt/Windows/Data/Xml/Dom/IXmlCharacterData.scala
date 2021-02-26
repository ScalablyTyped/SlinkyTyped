package typingsSlinky.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlCharacterData extends IXmlNode {
  
  def appendData(data: String): Unit = js.native
  
  var data: String = js.native
  
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  def insertData(offset: Double, data: String): Unit = js.native
  
  var length: Double = js.native
  
  def replaceData(offset: Double, count: Double, data: String): Unit = js.native
  
  def substringData(offset: Double, count: Double): String = js.native
}
object IXmlCharacterData {
  
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    appendData: String => Unit,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    data: String,
    deleteData: (Double, Double) => Unit,
    firstChild: IXmlNode,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    insertData: (Double, String) => Unit,
    lastChild: IXmlNode,
    length: Double,
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
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    replaceData: (Double, Double, String) => Unit,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode,
    substringData: (Double, Double) => String
  ): IXmlCharacterData = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2(deleteData), firstChild = firstChild.asInstanceOf[js.Any], getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), lastChild = lastChild.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), substringData = js.Any.fromFunction2(substringData))
    __obj.asInstanceOf[IXmlCharacterData]
  }
  
  @scala.inline
  implicit class IXmlCharacterDataMutableBuilder[Self <: IXmlCharacterData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendData(value: String => Unit): Self = StObject.set(x, "appendData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteData(value: (Double, Double) => Unit): Self = StObject.set(x, "deleteData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertData(value: (Double, String) => Unit): Self = StObject.set(x, "insertData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceData(value: (Double, Double, String) => Unit): Self = StObject.set(x, "replaceData", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
  }
}
