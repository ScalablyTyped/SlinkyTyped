package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
@js.native
trait NodeIterator extends StObject {
  
  def detach(): Unit = js.native
  
  val filter: org.scalajs.dom.raw.NodeFilter | Null = js.native
  
  def nextNode(): org.scalajs.dom.raw.Node | Null = js.native
  
  val pointerBeforeReferenceNode: scala.Boolean = js.native
  
  def previousNode(): org.scalajs.dom.raw.Node | Null = js.native
  
  val referenceNode: org.scalajs.dom.raw.Node = js.native
  
  val root: org.scalajs.dom.raw.Node = js.native
  
  val whatToShow: Double = js.native
}
object NodeIterator {
  
  @scala.inline
  def apply(
    detach: () => Unit,
    nextNode: () => org.scalajs.dom.raw.Node | Null,
    pointerBeforeReferenceNode: scala.Boolean,
    previousNode: () => org.scalajs.dom.raw.Node | Null,
    referenceNode: org.scalajs.dom.raw.Node,
    root: org.scalajs.dom.raw.Node,
    whatToShow: Double
  ): org.scalajs.dom.raw.NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.NodeIterator]
  }
  
  @scala.inline
  implicit class NodeIteratorMutableBuilder[Self <: org.scalajs.dom.raw.NodeIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetach(value: () => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilter(value: org.scalajs.dom.raw.NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setNextNode(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "nextNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPointerBeforeReferenceNode(value: scala.Boolean): Self = StObject.set(x, "pointerBeforeReferenceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousNode(value: () => org.scalajs.dom.raw.Node | Null): Self = StObject.set(x, "previousNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReferenceNode(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: org.scalajs.dom.raw.Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhatToShow(value: Double): Self = StObject.set(x, "whatToShow", value.asInstanceOf[js.Any])
  }
}
