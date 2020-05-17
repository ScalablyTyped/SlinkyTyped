package typingsSlinky.tensorflowTfjsLayers.anon

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackList extends js.Object {
  var callbackList: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList = js.native
  var history: History = js.native
}

object CallbackList {
  @scala.inline
  def apply(callbackList: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList, history: History): CallbackList = {
    val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackList]
  }
  @scala.inline
  implicit class CallbackListOps[Self <: CallbackList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackList(value: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHistory(value: History): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

