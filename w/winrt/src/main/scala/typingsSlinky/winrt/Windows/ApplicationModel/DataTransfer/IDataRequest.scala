package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataRequest extends js.Object {
  var data: DataPackage = js.native
  var deadline: js.Date = js.native
  def failWithDisplayText(value: String): Unit = js.native
  def getDeferral(): DataRequestDeferral = js.native
}

object IDataRequest {
  @scala.inline
  def apply(
    data: DataPackage,
    deadline: js.Date,
    failWithDisplayText: String => Unit,
    getDeferral: () => DataRequestDeferral
  ): IDataRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], deadline = deadline.asInstanceOf[js.Any], failWithDisplayText = js.Any.fromFunction1(failWithDisplayText), getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IDataRequest]
  }
  @scala.inline
  implicit class IDataRequestOps[Self <: IDataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: DataPackage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailWithDisplayText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failWithDisplayText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDeferral(value: () => DataRequestDeferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

