package typingsSlinky.tunnelSsh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCipher extends js.Object {
  var cipher: js.UndefOr[js.Array[String]] = js.native
  var compress: js.UndefOr[js.Array[String]] = js.native
  var hmac: js.UndefOr[js.Array[String]] = js.native
  var key: js.UndefOr[js.Array[String]] = js.native
  var serverHostKey: js.UndefOr[js.Array[String]] = js.native
}

object AnonCipher {
  @scala.inline
  def apply(): AnonCipher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCipher]
  }
  @scala.inline
  implicit class AnonCipherOps[Self <: AnonCipher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCipher(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCipher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withHmac(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHmac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmac")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withServerHostKey(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverHostKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerHostKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverHostKey")(js.undefined)
        ret
    }
  }
  
}

