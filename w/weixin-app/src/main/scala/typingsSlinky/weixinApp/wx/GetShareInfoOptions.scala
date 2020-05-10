package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.AnonEncryptedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetShareInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** shareTicket */
  var shareTicket: String = js.native
  @JSName("success")
  def success_MGetShareInfoOptions(res: AnonEncryptedData): Unit = js.native
}

object GetShareInfoOptions {
  @scala.inline
  def apply(shareTicket: String, success: AnonEncryptedData => Unit): GetShareInfoOptions = {
    val __obj = js.Dynamic.literal(shareTicket = shareTicket.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetShareInfoOptions]
  }
  @scala.inline
  implicit class GetShareInfoOptionsOps[Self <: GetShareInfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShareTicket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: AnonEncryptedData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

