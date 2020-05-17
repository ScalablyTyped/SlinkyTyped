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
    def withCurrentNode(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstChild(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastChild(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextNode(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentNode(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousNode(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreviousSibling(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSibling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRoot(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhatToShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whatToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: org.scalajs.dom.raw.NodeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(null)
        ret
    }
  }
  
}

