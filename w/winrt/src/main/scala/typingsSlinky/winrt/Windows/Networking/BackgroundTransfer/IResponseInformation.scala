package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResponseInformation extends js.Object {
  var actualUri: Uri = js.native
  var headers: IMapView[String, String] = js.native
  var isResumable: Boolean = js.native
  var statusCode: Double = js.native
}

object IResponseInformation {
  @scala.inline
  def apply(actualUri: Uri, headers: IMapView[String, String], isResumable: Boolean, statusCode: Double): IResponseInformation = {
    val __obj = js.Dynamic.literal(actualUri = actualUri.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isResumable = isResumable.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseInformation]
  }
  @scala.inline
  implicit class IResponseInformationOps[Self <: IResponseInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: IMapView[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResumable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResumable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

