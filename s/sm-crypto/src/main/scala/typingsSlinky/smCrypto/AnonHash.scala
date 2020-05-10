package typingsSlinky.smCrypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHash extends js.Object {
  var der: js.UndefOr[Boolean] = js.native
  var hash: js.UndefOr[Boolean] = js.native
  var publicKey: js.UndefOr[String] = js.native
}

object AnonHash {
  @scala.inline
  def apply(): AnonHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHash]
  }
  @scala.inline
  implicit class AnonHashOps[Self <: AnonHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("der")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("der")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
  }
  
}

