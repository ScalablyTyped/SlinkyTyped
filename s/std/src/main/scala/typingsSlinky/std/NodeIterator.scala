package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An iterator over the members of a list of the nodes in a subtree of the DOM. The nodes will be returned in document order. */
@js.native
trait NodeIterator extends js.Object {
  val filter: org.scalajs.dom.raw.NodeFilter | Null = js.native
  val pointerBeforeReferenceNode: scala.Boolean = js.native
  val referenceNode: org.scalajs.dom.raw.Node = js.native
  val root: org.scalajs.dom.raw.Node = js.native
  val whatToShow: Double = js.native
  def detach(): Unit = js.native
  def nextNode(): org.scalajs.dom.raw.Node | Null = js.native
  def previousNode(): org.scalajs.dom.raw.Node | Null = js.native
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
  ): NodeIterator = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), nextNode = js.Any.fromFunction0(nextNode), pointerBeforeReferenceNode = pointerBeforeReferenceNode.asInstanceOf[js.Any], previousNode = js.Any.fromFunction0(previousNode), referenceNode = referenceNode.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], whatToShow = whatToShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIterator]
  }
  @scala.inline
  implicit class NodeIteratorOps[Self <: org.scalajs.dom.raw.NodeIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNextNode(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPointerBeforeReferenceNode(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerBeforeReferenceNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousNode(value: () => org.scalajs.dom.raw.Node | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReferenceNode(value: org.scalajs.dom.raw.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceNode")(value.asInstanceOf[js.Any])
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

