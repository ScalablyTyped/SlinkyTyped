package typingsSlinky.vueTemplateCompiler.mod

import typingsSlinky.vue.vnodeMod.VNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompiledResultFunctions extends js.Object {
  var staticRenderFns: js.Array[js.Function0[VNode]] = js.native
  def render(): VNode = js.native
}

object CompiledResultFunctions {
  @scala.inline
  def apply(render: () => VNode, staticRenderFns: js.Array[js.Function0[VNode]]): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render), staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
  @scala.inline
  implicit class CompiledResultFunctionsOps[Self <: CompiledResultFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: () => VNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStaticRenderFns(value: js.Array[js.Function0[VNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticRenderFns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

