package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantArticleId extends js.Object {
  var merchantArticleId: String = js.native
  var secret: String = js.native
  var serial: String = js.native
}

object MerchantArticleId {
  @scala.inline
  def apply(merchantArticleId: String, secret: String, serial: String): MerchantArticleId = {
    val __obj = js.Dynamic.literal(merchantArticleId = merchantArticleId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantArticleId]
  }
  @scala.inline
  implicit class MerchantArticleIdOps[Self <: MerchantArticleId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMerchantArticleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantArticleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

