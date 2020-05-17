package typingsSlinky.stylus.mod.Stylus.Nodes

import typingsSlinky.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends Node {
  var hasMedia: scala.Boolean = js.native
  var hasProperties: scala.Boolean = js.native
  var isEmpty: scala.Boolean = js.native
  var node: Node = js.native
  var nodes: js.Array[Node] = js.native
  var parent: Block = js.native
  var scope: scala.Boolean = js.native
  /**
    * Push a `node` to this block.
    */
  def push(node: Node): scala.Unit = js.native
}

object Block {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hasMedia: scala.Boolean,
    hasProperties: scala.Boolean,
    hash: java.lang.String,
    isEmpty: scala.Boolean,
    lineno: Double,
    node: Node,
    nodeName: java.lang.String,
    nodes: js.Array[Node],
    operate: (java.lang.String, Node) => Node,
    parent: Block,
    push: Node => scala.Unit,
    scope: scala.Boolean,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Block = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hasMedia = hasMedia.asInstanceOf[js.Any], hasProperties = hasProperties.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), parent = parent.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), scope = scope.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasMedia(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasProperties(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEmpty(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: Node => scala.Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScope(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

