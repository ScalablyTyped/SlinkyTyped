package typingsSlinky.socketIoEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'broadcast' | 'json' | 'volatile', boolean | undefined> */
@js.native
trait Recordbroadcastjsonvolati extends js.Object {
  var broadcast: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var volatile: js.UndefOr[Boolean] = js.native
}

object Recordbroadcastjsonvolati {
  @scala.inline
  def apply(): Recordbroadcastjsonvolati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recordbroadcastjsonvolati]
  }
  @scala.inline
  implicit class RecordbroadcastjsonvolatiOps[Self <: Recordbroadcastjsonvolati] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(js.undefined)
        ret
    }
    @scala.inline
    def withJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withVolatile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volatile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolatile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volatile")(js.undefined)
        ret
    }
  }
  
}

