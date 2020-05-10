package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BanClient extends js.Object {
  /** ban reason */
  var banreason: String = js.native
  var clid: Double = js.native
  /** myteamspeak id, use "empty" to ban all clients without connected myteamspeak */
  var mytsid: js.UndefOr[String] = js.native
  /** bantime in seconds, if left empty it will result in a permaban */
  var time: js.UndefOr[Double] = js.native
}

object BanClient {
  @scala.inline
  def apply(banreason: String, clid: Double): BanClient = {
    val __obj = js.Dynamic.literal(banreason = banreason.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanClient]
  }
  @scala.inline
  implicit class BanClientOps[Self <: BanClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanreason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banreason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMytsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMytsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

