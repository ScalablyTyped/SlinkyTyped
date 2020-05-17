package typingsSlinky.uuid1345.anon

import typingsSlinky.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MacBoolean extends js.Object {
  var encoding: `object` = js.native
  var mac: js.UndefOr[Boolean] = js.native
}

object MacBoolean {
  @scala.inline
  def apply(encoding: `object`): MacBoolean = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacBoolean]
  }
  @scala.inline
  implicit class MacBooleanOps[Self <: MacBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: `object`): Self = {
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

