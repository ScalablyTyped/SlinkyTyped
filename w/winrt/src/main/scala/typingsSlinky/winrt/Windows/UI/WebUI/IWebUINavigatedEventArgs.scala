package typingsSlinky.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebUINavigatedEventArgs extends js.Object {
  var navigatedOperation: WebUINavigatedOperation = js.native
}

object IWebUINavigatedEventArgs {
  @scala.inline
  def apply(navigatedOperation: WebUINavigatedOperation): IWebUINavigatedEventArgs = {
    val __obj = js.Dynamic.literal(navigatedOperation = navigatedOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebUINavigatedEventArgs]
  }
  @scala.inline
  implicit class IWebUINavigatedEventArgsOps[Self <: IWebUINavigatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigatedOperation(value: WebUINavigatedOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigatedOperation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

