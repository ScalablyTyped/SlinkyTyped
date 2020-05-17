package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageRequestSucceededEventArgs extends EventArgs {
  def get_executor(): WebRequestExecutor = js.native
}

object PageRequestSucceededEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_executor: () => WebRequestExecutor): PageRequestSucceededEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_executor = js.Any.fromFunction0(get_executor))
    __obj.asInstanceOf[PageRequestSucceededEventArgs]
  }
  @scala.inline
  implicit class PageRequestSucceededEventArgsOps[Self <: PageRequestSucceededEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_executor(value: () => WebRequestExecutor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_executor")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

