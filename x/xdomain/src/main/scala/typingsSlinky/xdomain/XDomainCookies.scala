package typingsSlinky.xdomain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDomainCookies extends js.Object {
  var master: String = js.native
  var slave: String = js.native
}

object XDomainCookies {
  @scala.inline
  def apply(master: String, slave: String): XDomainCookies = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainCookies]
  }
  @scala.inline
  implicit class XDomainCookiesOps[Self <: XDomainCookies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

