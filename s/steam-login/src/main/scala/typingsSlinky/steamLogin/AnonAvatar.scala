package typingsSlinky.steamLogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvatar extends js.Object {
  var avatar: String = js.native
  var avatarfull: String = js.native
  var avatarmedium: String = js.native
  var commentpermission: js.UndefOr[Double] = js.native
  var communityvisibilitystate: Double = js.native
  var gameextrainfo: js.UndefOr[String] = js.native
  var gameid: js.UndefOr[String] = js.native
  var gameserverip: js.UndefOr[String] = js.native
  var lastlogoff: Double = js.native
  var loccityid: js.UndefOr[Double] = js.native
  var loccountrycode: js.UndefOr[String] = js.native
  var locstatecode: js.UndefOr[String] = js.native
  var personaname: String = js.native
  var personastate: Double = js.native
  var primaryclanid: js.UndefOr[String] = js.native
  var profilestate: js.UndefOr[Double] = js.native
  var profileurl: String = js.native
  var realname: js.UndefOr[String] = js.native
  var steamid: String = js.native
  var timecreated: js.UndefOr[Double] = js.native
}

object AnonAvatar {
  @scala.inline
  def apply(
    avatar: String,
    avatarfull: String,
    avatarmedium: String,
    communityvisibilitystate: Double,
    lastlogoff: Double,
    personaname: String,
    personastate: Double,
    profileurl: String,
    steamid: String
  ): AnonAvatar = {
    val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], avatarfull = avatarfull.asInstanceOf[js.Any], avatarmedium = avatarmedium.asInstanceOf[js.Any], communityvisibilitystate = communityvisibilitystate.asInstanceOf[js.Any], lastlogoff = lastlogoff.asInstanceOf[js.Any], personaname = personaname.asInstanceOf[js.Any], personastate = personastate.asInstanceOf[js.Any], profileurl = profileurl.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatar]
  }
  @scala.inline
  implicit class AnonAvatarOps[Self <: AnonAvatar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatarfull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarfull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatarmedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarmedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommunityvisibilitystate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communityvisibilitystate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastlogoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastlogoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonaname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonastate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personastate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileurl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteamid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steamid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommentpermission(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentpermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentpermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentpermission")(js.undefined)
        ret
    }
    @scala.inline
    def withGameextrainfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameextrainfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameextrainfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameextrainfo")(js.undefined)
        ret
    }
    @scala.inline
    def withGameid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameid")(js.undefined)
        ret
    }
    @scala.inline
    def withGameserverip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameserverip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGameserverip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gameserverip")(js.undefined)
        ret
    }
    @scala.inline
    def withLoccityid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loccityid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoccityid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loccityid")(js.undefined)
        ret
    }
    @scala.inline
    def withLoccountrycode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loccountrycode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoccountrycode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loccountrycode")(js.undefined)
        ret
    }
    @scala.inline
    def withLocstatecode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locstatecode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocstatecode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locstatecode")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryclanid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryclanid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryclanid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryclanid")(js.undefined)
        ret
    }
    @scala.inline
    def withProfilestate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilestate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilestate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilestate")(js.undefined)
        ret
    }
    @scala.inline
    def withRealname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realname")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timecreated")(js.undefined)
        ret
    }
  }
  
}

