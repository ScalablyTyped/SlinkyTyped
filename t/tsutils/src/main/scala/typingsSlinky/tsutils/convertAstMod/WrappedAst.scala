package typingsSlinky.tsutils.convertAstMod

import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedAst extends NodeWrap {
  @JSName("next")
  var next_WrappedAst: NodeWrap = js.native
  @JSName("node")
  var node_WrappedAst: SourceFile = js.native
  @JSName("parent")
  var parent_WrappedAst: js.UndefOr[scala.Nothing] = js.native
  @JSName("skip")
  var skip_WrappedAst: js.UndefOr[scala.Nothing] = js.native
}

object WrappedAst {
  @scala.inline
  def apply(children: js.Array[NodeWrap], kind: SyntaxKind, next: NodeWrap, node: SourceFile): WrappedAst = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedAst]
  }
  @scala.inline
  implicit class WrappedAstOps[Self <: WrappedAst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: NodeWrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
  }
  
}

