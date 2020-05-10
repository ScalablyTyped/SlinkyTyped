package typingsSlinky.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlDocument extends IXmlNode {
  var doctype: XmlDocumentType = js.native
  var documentElement: XmlElement = js.native
  var documentUri: String = js.native
  var implementation: XmlDomImplementation = js.native
  def createAttribute(name: String): XmlAttribute = js.native
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute = js.native
  def createCDataSection(data: String): XmlCDataSection = js.native
  def createComment(data: String): XmlComment = js.native
  def createDocumentFragment(): XmlDocumentFragment = js.native
  def createElement(tagName: String): XmlElement = js.native
  def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement = js.native
  def createEntityReference(name: String): XmlEntityReference = js.native
  def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction = js.native
  def createTextNode(data: String): XmlText = js.native
  def getElementById(elementId: String): XmlElement = js.native
  def getElementsByTagName(tagName: String): XmlNodeList = js.native
  def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
}

object IXmlDocument {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    createAttribute: String => XmlAttribute,
    createAttributeNS: (js.Any, String) => XmlAttribute,
    createCDataSection: String => XmlCDataSection,
    createComment: String => XmlComment,
    createDocumentFragment: () => XmlDocumentFragment,
    createElement: String => XmlElement,
    createElementNS: (js.Any, String) => XmlElement,
    createEntityReference: String => XmlEntityReference,
    createProcessingInstruction: (String, String) => XmlProcessingInstruction,
    createTextNode: String => XmlText,
    doctype: XmlDocumentType,
    documentElement: XmlElement,
    documentUri: String,
    firstChild: IXmlNode,
    getElementById: String => XmlElement,
    getElementsByTagName: String => XmlNodeList,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    implementation: XmlDomImplementation,
    importNode: (IXmlNode, Boolean) => IXmlNode,
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
  ): IXmlDocument = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDataSection = js.Any.fromFunction1(createCDataSection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], documentUri = documentUri.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), implementation = implementation.asInstanceOf[js.Any], importNode = js.Any.fromFunction2(importNode), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlDocument]
  }
  @scala.inline
  implicit class IXmlDocumentOps[Self <: IXmlDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAttribute(value: String => XmlAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateAttributeNS(value: (js.Any, String) => XmlAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAttributeNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateCDataSection(value: String => XmlCDataSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCDataSection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateComment(value: String => XmlComment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDocumentFragment(value: () => XmlDocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDocumentFragment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateElement(value: String => XmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateElementNS(value: (js.Any, String) => XmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElementNS")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateEntityReference(value: String => XmlEntityReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createEntityReference")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateProcessingInstruction(value: (String, String) => XmlProcessingInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createProcessingInstruction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateTextNode(value: String => XmlText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTextNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoctype(value: XmlDocumentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentElement(value: XmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetElementById(value: String => XmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetElementsByTagName(value: String => XmlNodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElementsByTagName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImplementation(value: XmlDomImplementation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportNode(value: (IXmlNode, Boolean) => IXmlNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importNode")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

