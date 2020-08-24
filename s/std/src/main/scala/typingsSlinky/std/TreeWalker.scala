package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The nodes of a document subtree and a position within them. */
@js.native
trait TreeWalker extends js.Object {
  var currentNode: org.scalajs.dom.raw.Node = js.native
  val filter: org.scalajs.dom.raw.NodeFilter | Null = js.native
  val root: org.scalajs.dom.raw.Node = js.native
  val whatToShow: Double = js.native
  def firstChild(): org.scalajs.dom.raw.Node | Null = js.native
  def lastChild(): org.scalajs.dom.raw.Node | Null = js.native
  def nextNode(): org.scalajs.dom.raw.Node | Null = js.native
  def nextSibling(): org.scalajs.dom.raw.Node | Null = js.native
  def parentNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousSibling(): org.scalajs.dom.raw.Node | Null = js.native
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
    whatToShow: Double
  ): TreeWalker = {
    val __obj = js.Dynamic.literal(currentNode = currentNode.asInstanceOf[js.Any], firstChild = js.Any.fromFunction0(firstChild), lastChild = js.Any.fromFunction0(lastChild), nextNode = js.Any.fromFunction0(nextNode), nextSibling = js.Any.fromFunction0(nextSibling), parentNode = js.Any.fromFunction0(parentNode), previousNode = js.Any.fromFunction0(previousNode), previousSibling = js.Any.fromFunction0(previousSibling), root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalker]
  }
  @scala.inline
  implicit class TreeWalkerOps[Self <: org.scalajs.dom.raw.TreeWalker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentNode(value: org.scalajs.dom.raw.Node): Self = this.set("currentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("firstChild", js.Any.fromFunction0(value))
    @scala.inline
    def setLastChild(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("lastChild", js.Any.fromFunction0(value))
    @scala.inline
    def setNextNode(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("nextNode", js.Any.fromFunction0(value))
    @scala.inline
    def setNextSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("nextSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setParentNode(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("parentNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousNode(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("previousNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = this.set("previousSibling", js.Any.fromFunction0(value))
    @scala.inline
    def setRoot(value: org.scalajs.dom.raw.Node): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhatToShow(value: Double): Self = this.set("whatToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: org.scalajs.dom.raw.NodeFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
  }
  
}

