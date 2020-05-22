package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The nodes of a document subtree and a position within them. */
trait TreeWalker extends js.Object {
  var currentNode: org.scalajs.dom.raw.Node
  val filter: org.scalajs.dom.raw.NodeFilter | Null
  val root: org.scalajs.dom.raw.Node
  val whatToShow: Double
  def firstChild(): org.scalajs.dom.raw.Node | Null
  def lastChild(): org.scalajs.dom.raw.Node | Null
  def nextNode(): org.scalajs.dom.raw.Node | Null
  def nextSibling(): org.scalajs.dom.raw.Node | Null
  def parentNode(): org.scalajs.dom.raw.Node | Null
  def previousNode(): org.scalajs.dom.raw.Node | Null
  def previousSibling(): org.scalajs.dom.raw.Node | Null
}

object TreeWalker {
  @scala.inline
  def apply(
    currentNode: org.scalajs.dom.raw.Node,
    firstChild: () => org.scalajs.dom.raw.Node | Null,
    lastChild: () => org.scalajs.dom.raw.Node | Null,
    nextNode: () => org.scalajs.dom.raw.Node | Null,
    nextSibling: () => org.scalajs.dom.raw.Node | Null,
    parentNode: () => org.scalajs.dom.raw.Node | Null,
    previousNode: () => org.scalajs.dom.raw.Node | Null,
    previousSibling: () => org.scalajs.dom.raw.Node | Null,
    root: org.scalajs.dom.raw.Node,
    whatToShow: Double,
    filter: org.scalajs.dom.raw.NodeFilter = null
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
}

