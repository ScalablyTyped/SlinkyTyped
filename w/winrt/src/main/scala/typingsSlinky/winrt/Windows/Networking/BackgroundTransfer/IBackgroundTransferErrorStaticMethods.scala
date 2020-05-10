package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTransferErrorStaticMethods extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus = js.native
}

object IBackgroundTransferErrorStaticMethods {
  @scala.inline
  def apply(getStatus: Double => WebErrorStatus): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
  @scala.inline
  implicit class IBackgroundTransferErrorStaticMethodsOps[Self <: IBackgroundTransferErrorStaticMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetStatus(value: Double => WebErrorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStatus")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

