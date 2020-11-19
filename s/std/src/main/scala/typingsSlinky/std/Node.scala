package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Node is an interface from which a number of DOM API object types inherit. It allows those types to be treated similarly; for example, inheriting the same set of methods, or being tested in the same way. */
@js.native
trait Node extends EventTarget {
  
  val ATTRIBUTE_NODE: Double = js.native
  
  /**
    * node is a CDATASection node.
    */
  val CDATA_SECTION_NODE: Double = js.native
  
  /**
    * node is a Comment node.
    */
  val COMMENT_NODE: Double = js.native
  
  /**
    * node is a DocumentFragment node.
    */
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  
  /**
    * node is a document.
    */
  val DOCUMENT_NODE: Double = js.native
  
  /**
    * Set when other is a descendant of node.
    */
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  
  /**
    * Set when other is an ancestor of node.
    */
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  
  /**
    * Set when node and other are not in the same tree.
    */
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  
  /**
    * Set when other is following node.
    */
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  
  /**
    * Set when other is preceding node.
    */
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  
  /**
    * node is a doctype.
    */
  val DOCUMENT_TYPE_NODE: Double = js.native
  
  /**
    * node is an element.
    */
  val ELEMENT_NODE: Double = js.native
  
  val ENTITY_NODE: Double = js.native
  
  val ENTITY_REFERENCE_NODE: Double = js.native
  
  val NOTATION_NODE: Double = js.native
  
  /**
    * node is a ProcessingInstruction node.
    */
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  
  /**
    * node is a Text node.
    */
  val TEXT_NODE: Double = js.native
  
  def appendChild[T /* <: org.scalajs.dom.raw.Node */](newChild: T): T = js.native
  
  /**
    * Returns node's node document's document base URL.
    */
  val baseURI: java.lang.String = js.native
  
  /**
    * Returns the children.
    */
  val childNodes: org.scalajs.dom.raw.NodeListOf[ChildNode with org.scalajs.dom.raw.Node] = js.native
  
  /**
    * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
    */
  def cloneNode(): org.scalajs.dom.raw.Node = js.native
  def cloneNode(deep: scala.Boolean): org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns a bitmask indicating the position of other relative to node.
    */
  def compareDocumentPosition(other: org.scalajs.dom.raw.Node): Double = js.native
  
  /**
    * Returns true if other is an inclusive descendant of node, and false otherwise.
    */
  def contains(): scala.Boolean = js.native
  def contains(other: org.scalajs.dom.raw.Node): scala.Boolean = js.native
  
  /**
    * Returns the first child.
    */
  val firstChild: ChildNode | Null = js.native
  
  /**
    * Returns node's root.
    */
  def getRootNode(): org.scalajs.dom.raw.Node = js.native
  def getRootNode(options: GetRootNodeOptions): org.scalajs.dom.raw.Node = js.native
  
  /**
    * Returns whether node has children.
    */
  def hasChildNodes(): scala.Boolean = js.native
  
  def insertBefore[T /* <: org.scalajs.dom.raw.Node */](newChild: T): T = js.native
  def insertBefore[T /* <: org.scalajs.dom.raw.Node */](newChild: T, refChild: org.scalajs.dom.raw.Node): T = js.native
  
  /**
    * Returns true if node is connected and false otherwise.
    */
  val isConnected: scala.Boolean = js.native
  
  def isDefaultNamespace(): scala.Boolean = js.native
  def isDefaultNamespace(namespace: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns whether node and otherNode have the same properties.
    */
  def isEqualNode(): scala.Boolean = js.native
  def isEqualNode(otherNode: org.scalajs.dom.raw.Node): scala.Boolean = js.native
  
  def isSameNode(): scala.Boolean = js.native
  def isSameNode(otherNode: org.scalajs.dom.raw.Node): scala.Boolean = js.native
  
  /**
    * Returns the last child.
    */
  val lastChild: ChildNode | Null = js.native
  
  def lookupNamespaceURI(): java.lang.String | Null = js.native
  def lookupNamespaceURI(prefix: java.lang.String): java.lang.String | Null = js.native
  
  def lookupPrefix(): java.lang.String | Null = js.native
  def lookupPrefix(namespace: java.lang.String): java.lang.String | Null = js.native
  
  /** @deprecated */
  val namespaceURI: java.lang.String | Null = js.native
  
  /**
    * Returns the next sibling.
    */
  val nextSibling: ChildNode | Null = js.native
  
  /**
    * Returns a string appropriate for the type of node.
    */
  val nodeName: java.lang.String = js.native
  
  /**
    * Returns the type of node.
    */
  val nodeType: Double = js.native
  
  var nodeValue: java.lang.String | Null = js.native
  
  /**
    * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
    */
  def normalize(): Unit = js.native
  
  /**
    * Returns the node document. Returns null for documents.
    */
  val ownerDocument: org.scalajs.dom.raw.Document | Null = js.native
  
  /**
    * Returns the parent element.
    */
  val parentElement: org.scalajs.dom.raw.HTMLElement | Null = js.native
  
  /**
    * Returns the parent.
    */
  val parentNode: (org.scalajs.dom.raw.Node with org.scalajs.dom.raw.ParentNode) | Null = js.native
  
  /**
    * Returns the previous sibling.
    */
  val previousSibling: ChildNode | Null = js.native
  
  def removeChild[T /* <: org.scalajs.dom.raw.Node */](oldChild: T): T = js.native
  
  def replaceChild[T /* <: org.scalajs.dom.raw.Node */](newChild: org.scalajs.dom.raw.Node, oldChild: T): T = js.native
  
  var textContent: java.lang.String | Null = js.native
}
