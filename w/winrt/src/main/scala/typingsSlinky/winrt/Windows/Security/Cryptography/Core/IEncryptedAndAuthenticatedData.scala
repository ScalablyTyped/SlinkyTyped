package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEncryptedAndAuthenticatedData extends js.Object {
  var authenticationTag: IBuffer = js.native
  var encryptedData: IBuffer = js.native
}

object IEncryptedAndAuthenticatedData {
  @scala.inline
  def apply(authenticationTag: IBuffer, encryptedData: IBuffer): IEncryptedAndAuthenticatedData = {
    val __obj = js.Dynamic.literal(authenticationTag = authenticationTag.asInstanceOf[js.Any], encryptedData = encryptedData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedAndAuthenticatedData]
  }
  @scala.inline
  implicit class IEncryptedAndAuthenticatedDataOps[Self <: IEncryptedAndAuthenticatedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationTag(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticationTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptedData(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

