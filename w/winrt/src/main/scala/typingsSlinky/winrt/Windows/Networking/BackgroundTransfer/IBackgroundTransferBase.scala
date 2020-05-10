package typingsSlinky.winrt.Windows.Networking.BackgroundTransfer

import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTransferBase extends js.Object {
  var costPolicy: BackgroundTransferCostPolicy = js.native
  var group: String = js.native
  var method: String = js.native
  var proxyCredential: PasswordCredential = js.native
  var serverCredential: PasswordCredential = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

object IBackgroundTransferBase {
  @scala.inline
  def apply(
    costPolicy: BackgroundTransferCostPolicy,
    group: String,
    method: String,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    setRequestHeader: (String, String) => Unit
  ): IBackgroundTransferBase = {
    val __obj = js.Dynamic.literal(costPolicy = costPolicy.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], setRequestHeader = js.Any.fromFunction2(setRequestHeader))
    __obj.asInstanceOf[IBackgroundTransferBase]
  }
  @scala.inline
  implicit class IBackgroundTransferBaseOps[Self <: IBackgroundTransferBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCostPolicy(value: BackgroundTransferCostPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("costPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerCredential(value: PasswordCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetRequestHeader(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestHeader")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

