package typingsSlinky.ssh2Streams.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyAuthMethodData extends _AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.native
  var key: Buffer = js.native
  var keyAlgo: String = js.native
  var signature: js.UndefOr[Buffer] = js.native
}

object PublicKeyAuthMethodData {
  @scala.inline
  def apply(key: Buffer, keyAlgo: String): PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAuthMethodData]
  }
  @scala.inline
  implicit class PublicKeyAuthMethodDataOps[Self <: PublicKeyAuthMethodData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyAlgo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyAlgo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blob")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
  }
  
}

