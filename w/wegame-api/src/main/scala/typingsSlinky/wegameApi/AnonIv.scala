package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIv extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
    */
  var encryptedData: String = js.native
  /**
    * 加密算法的初始向量
    */
  var iv: String = js.native
}

object AnonIv {
  @scala.inline
  def apply(encryptedData: String, iv: String): AnonIv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIv]
  }
  @scala.inline
  implicit class AnonIvOps[Self <: AnonIv] (val x: Self) extends AnyVal {
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
  }
  
}

