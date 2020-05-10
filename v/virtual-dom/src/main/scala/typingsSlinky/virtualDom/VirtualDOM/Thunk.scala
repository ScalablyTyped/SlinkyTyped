package typingsSlinky.virtualDom.VirtualDOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thunk extends VTree {
  var `type`: String = js.native
   // 'Thunk'
  var vnode: VTree = js.native
  def render(previous: VTree): VTree = js.native
}

object Thunk {
  @scala.inline
  def apply(render: VTree => VTree, `type`: String, vnode: VTree): Thunk = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render), vnode = vnode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thunk]
  }
  @scala.inline
  implicit class ThunkOps[Self <: Thunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: VTree => VTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVnode(value: VTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vnode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

