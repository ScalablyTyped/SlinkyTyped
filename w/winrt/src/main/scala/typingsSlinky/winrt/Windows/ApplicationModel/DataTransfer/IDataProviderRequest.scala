package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataProviderRequest extends js.Object {
  var deadline: js.Date = js.native
  var formatId: String = js.native
  def getDeferral(): DataProviderDeferral = js.native
  def setData(value: js.Any): Unit = js.native
}

object IDataProviderRequest {
  @scala.inline
  def apply(
    deadline: js.Date,
    formatId: String,
    getDeferral: () => DataProviderDeferral,
    setData: js.Any => Unit
  ): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[IDataProviderRequest]
  }
  @scala.inline
  implicit class IDataProviderRequestOps[Self <: IDataProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => DataProviderDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

