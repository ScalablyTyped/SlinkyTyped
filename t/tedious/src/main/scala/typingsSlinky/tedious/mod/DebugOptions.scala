package typingsSlinky.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugOptions extends js.Object {
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet data details (default: false).
    */
  var data: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet details (default: false).
    */
  var packet: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet payload details (default: false).
    */
  var payload: js.UndefOr[Boolean] = js.native
  /**
    * A boolean, controlling whether debug events will be emitted with text describing token stream tokens (default: false).
    */
  var token: js.UndefOr[Boolean] = js.native
}

object DebugOptions {
  @scala.inline
  def apply(): DebugOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugOptions]
  }
  @scala.inline
  implicit class DebugOptionsOps[Self <: DebugOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withPacket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packet")(js.undefined)
        ret
    }
    @scala.inline
    def withPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

