package typingsSlinky.ssh2Streams.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostbasedAuthMethodData extends AuthMethodData {
  var blob: js.UndefOr[Buffer] = js.native
  var key: Buffer = js.native
  var keyAlgo: String = js.native
  var localHostname: String = js.native
  var localUsername: String = js.native
  var signature: js.UndefOr[Buffer] = js.native
}

object HostbasedAuthMethodData {
  @scala.inline
  def apply(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostbasedAuthMethodData]
  }
  @scala.inline
  implicit class HostbasedAuthMethodDataOps[Self <: HostbasedAuthMethodData] (val x: Self) extends AnyVal {
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
    def withLocalHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localUsername")(value.asInstanceOf[js.Any])
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

