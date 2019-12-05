package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderRequest extends js.Object {
  var deadline: js.Date
  var formatId: String
  def getDeferral(): DataProviderDeferral
  def setData(value: js.Any): Unit
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
}

