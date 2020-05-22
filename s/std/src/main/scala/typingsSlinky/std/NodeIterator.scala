package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
trait NodeIterator extends js.Object {
  val filter: org.scalajs.dom.raw.NodeFilter | Null
  val pointerBeforeReferenceNode: scala.Boolean
  val referenceNode: org.scalajs.dom.raw.Node
  val root: org.scalajs.dom.raw.Node
  val whatToShow: Double
  def detach(): Unit
  def nextNode(): org.scalajs.dom.raw.Node | Null
  def previousNode(): org.scalajs.dom.raw.Node | Null
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
    whatToShow: Double,
    filter: org.scalajs.dom.raw.NodeFilter = null
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
}

