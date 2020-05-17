package typingsSlinky.stremioAddonSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adult extends js.Object {
  /**
    * If the addon includes adult content.
    *
    * Defaults to false.
    */
  var adult: js.UndefOr[Boolean] = js.native
  /**
    * If the addon includes P2P content, such as BitTorrent, which may reveal the user's IP to other streaming parties.
    *
    * Used to provide an adequate warning to the user.
    */
  var p2p: js.UndefOr[Boolean] = js.native
}

object Adult {
  @scala.inline
  def apply(): Adult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Adult]
  }
  @scala.inline
  implicit class AdultOps[Self <: Adult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adult")(js.undefined)
        ret
    }
    @scala.inline
    def withP2p(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP2p: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p2p")(js.undefined)
        ret
    }
  }
  
}

