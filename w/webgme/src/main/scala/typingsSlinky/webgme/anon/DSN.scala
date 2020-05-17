package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSN extends js.Object {
  var DSN: String = js.native
  var enable: Boolean = js.native
  var ravenOptions: Null | String = js.native
}

object DSN {
  @scala.inline
  def apply(DSN: String, enable: Boolean): DSN = {
    val __obj = js.Dynamic.literal(DSN = DSN.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSN]
  }
  @scala.inline
  implicit class DSNOps[Self <: DSN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDSN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DSN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRavenOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ravenOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRavenOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ravenOptions")(null)
        ret
    }
  }
  
}

