package typingsSlinky.tensorflowTfjsData.deepMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepMapAsyncResult extends js.Object {
  var recurse: Boolean = js.native
  var value: js.Promise[_] = js.native
}

object DeepMapAsyncResult {
  @scala.inline
  def apply(recurse: Boolean, value: js.Promise[_]): DeepMapAsyncResult = {
    val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepMapAsyncResult]
  }
  @scala.inline
  implicit class DeepMapAsyncResultOps[Self <: DeepMapAsyncResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

