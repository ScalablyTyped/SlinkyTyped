package typingsSlinky.uuid1345.anon

import typingsSlinky.uuid1345.uuid1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingMac extends js.Object {
  var encoding: binary = js.native
  var mac: js.UndefOr[Boolean] = js.native
}

object EncodingMac {
  @scala.inline
  def apply(encoding: binary): EncodingMac = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingMac]
  }
  @scala.inline
  implicit class EncodingMacOps[Self <: EncodingMac] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
  }
  
}

