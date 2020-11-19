package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProviderRequest extends IDataProviderRequest
object DataProviderRequest {
  
  @scala.inline
  def apply(
    deadline: js.Date,
    formatId: String,
    getDeferral: () => DataProviderDeferral,
    setData: js.Any => Unit
  ): DataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], formatId = formatId.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[DataProviderRequest]
  }
}
