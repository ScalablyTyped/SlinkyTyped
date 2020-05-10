package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallbackList extends js.Object {
  var callbackList: CallbackList = js.native
  var history: History = js.native
}

object AnonCallbackList {
  @scala.inline
  def apply(callbackList: CallbackList, history: History): AnonCallbackList = {
    val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackList]
  }
  @scala.inline
  implicit class AnonCallbackListOps[Self <: AnonCallbackList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackList(value: CallbackList): Self = {
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

