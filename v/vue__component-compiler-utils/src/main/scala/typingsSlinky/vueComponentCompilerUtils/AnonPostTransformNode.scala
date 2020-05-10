package typingsSlinky.vueComponentCompilerUtils

import typingsSlinky.vueComponentCompilerUtils.utilsMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPostTransformNode extends js.Object {
  def postTransformNode(node: ASTNode): Unit = js.native
}

object AnonPostTransformNode {
  @scala.inline
  def apply(postTransformNode: ASTNode => Unit): AnonPostTransformNode = {
    val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
    __obj.asInstanceOf[AnonPostTransformNode]
  }
  @scala.inline
  implicit class AnonPostTransformNodeOps[Self <: AnonPostTransformNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostTransformNode(value: ASTNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postTransformNode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

