package typingsSlinky.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebUIBackgroundTaskInstanceStatics extends js.Object {
  var current: IWebUIBackgroundTaskInstance = js.native
}

object IWebUIBackgroundTaskInstanceStatics {
  @scala.inline
  def apply(current: IWebUIBackgroundTaskInstance): IWebUIBackgroundTaskInstanceStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUIBackgroundTaskInstanceStatics]
  }
  @scala.inline
  implicit class IWebUIBackgroundTaskInstanceStaticsOps[Self <: IWebUIBackgroundTaskInstanceStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: IWebUIBackgroundTaskInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

