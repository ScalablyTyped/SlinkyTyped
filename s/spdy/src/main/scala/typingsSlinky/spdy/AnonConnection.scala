package typingsSlinky.spdy

import typingsSlinky.spdy.mod.server.Protocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnection extends js.Object {
  var connection: js.UndefOr[AnonAutoSpdy31] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  var `x-forwarded-for`: js.UndefOr[Boolean] = js.native
}

object AnonConnection {
  @scala.inline
  def apply(): AnonConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConnection]
  }
  @scala.inline
  implicit class AnonConnectionOps[Self <: AnonConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: AnonAutoSpdy31): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withPlain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[Protocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-forwarded-for`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded-for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-forwarded-for`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded-for")(js.undefined)
        ret
    }
  }
  
}

