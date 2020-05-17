package typingsSlinky.sharepoint.SP

import typingsSlinky.microsoftAjax.Sys.EventArgs
import typingsSlinky.microsoftAjax.Sys.Net.WebRequestExecutor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageRequestFailedEventArgs extends EventArgs {
  def get_errorMessage(): String = js.native
  def get_executor(): WebRequestExecutor = js.native
  def get_isErrorPage(): Boolean = js.native
}

object PageRequestFailedEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_errorMessage: () => String,
    get_executor: () => WebRequestExecutor,
    get_isErrorPage: () => Boolean
  ): PageRequestFailedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_executor = js.Any.fromFunction0(get_executor), get_isErrorPage = js.Any.fromFunction0(get_isErrorPage))
    __obj.asInstanceOf[PageRequestFailedEventArgs]
  }
  @scala.inline
  implicit class PageRequestFailedEventArgsOps[Self <: PageRequestFailedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_errorMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_errorMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_executor(value: () => WebRequestExecutor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_executor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_isErrorPage(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_isErrorPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

