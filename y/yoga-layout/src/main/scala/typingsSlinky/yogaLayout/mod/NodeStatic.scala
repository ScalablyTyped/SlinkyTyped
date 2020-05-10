package typingsSlinky.yogaLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeStatic extends js.Object {
  def create(): YogaNode = js.native
  def createDefault(): YogaNode = js.native
  def createWithConfig(config: YogaConfig): YogaNode = js.native
  def destroy(node: YogaNode): js.Any = js.native
}

object NodeStatic {
  @scala.inline
  def apply(
    create: () => YogaNode,
    createDefault: () => YogaNode,
    createWithConfig: YogaConfig => YogaNode,
    destroy: YogaNode => js.Any
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), createDefault = js.Any.fromFunction0(createDefault), createWithConfig = js.Any.fromFunction1(createWithConfig), destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[NodeStatic]
  }
  @scala.inline
  implicit class NodeStaticOps[Self <: NodeStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: () => YogaNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateDefault(value: () => YogaNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateWithConfig(value: YogaConfig => YogaNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: YogaNode => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

