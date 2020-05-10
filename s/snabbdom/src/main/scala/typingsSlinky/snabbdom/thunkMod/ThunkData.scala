package typingsSlinky.snabbdom.thunkMod

import typingsSlinky.snabbdom.vnodeMod.VNodeData
import typingsSlinky.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThunkData extends VNodeData {
  @JSName("args")
  var args_ThunkData: js.Array[_] = js.native
  @JSName("fn")
  def fn_MThunkData(): VNode_ = js.native
}

object ThunkData {
  @scala.inline
  def apply(args: js.Array[_], fn: () => VNode_): ThunkData = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[ThunkData]
  }
  @scala.inline
  implicit class ThunkDataOps[Self <: ThunkData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: () => VNode_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

