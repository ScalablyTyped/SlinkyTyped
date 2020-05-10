package typingsSlinky.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  var attributes: XmlNamedNodeMap = js.native
  var childNodes: XmlNodeList = js.native
  var firstChild: IXmlNode = js.native
  var lastChild: IXmlNode = js.native
  var localName: js.Any = js.native
  var namespaceUri: js.Any = js.native
  var nextSibling: IXmlNode = js.native
  var nodeName: String = js.native
  var nodeType: NodeType = js.native
  var nodeValue: js.Any = js.native
  var ownerDocument: XmlDocument = js.native
  var parentNode: IXmlNode = js.native
  var prefix: js.Any = js.native
  var previousSibling: IXmlNode = js.native
  def appendChild(newChild: IXmlNode): IXmlNode = js.native
  def cloneNode(deep: Boolean): IXmlNode = js.native
  def hasChildNodes(): Boolean = js.native
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  def normalize(): Unit = js.native
  def removeChild(childNode: IXmlNode): IXmlNode = js.native
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
}

object IXmlNode {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    firstChild: IXmlNode,
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
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode
  ): IXmlNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild.asInstanceOf[js.Any], getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlNode]
  }
  @scala.inline
  implicit class IXmlNodeOps[Self <: IXmlNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChild(value: IXmlNode => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttributes(value: XmlNamedNodeMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildNodes(value: XmlNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneNode(value: Boolean => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstChild(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasChildNodes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsertBefore(value: (IXmlNode, IXmlNode) => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertBefore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLastChild(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespaceUri(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSibling(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: NodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOwnerDocument(value: XmlDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentNode(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousSibling(value: IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveChild(value: IXmlNode => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceChild(value: (IXmlNode, IXmlNode) => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

