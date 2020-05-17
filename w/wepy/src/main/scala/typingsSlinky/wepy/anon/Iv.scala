package typingsSlinky.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iv extends js.Object {
  var encryptedData: String = js.native
  var iv: String = js.native
  var rawData: String = js.native
  var signature: String = js.native
  var userInfo: js.Object = js.native
}

object Iv {
  @scala.inline
  def apply(encryptedData: String, iv: String, rawData: String, signature: String, userInfo: js.Object): Iv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
  @scala.inline
  implicit class IvOps[Self <: Iv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptedData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInfo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

