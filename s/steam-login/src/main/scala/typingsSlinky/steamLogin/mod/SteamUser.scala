package typingsSlinky.steamLogin.mod

import typingsSlinky.steamLogin.AnonAvatar
import typingsSlinky.steamLogin.AnonLarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamUser extends js.Object {
  var _json: AnonAvatar = js.native
  var avatar: AnonLarge = js.native
  var name: String = js.native
  var profile: String = js.native
  var steamid: String = js.native
  var username: String = js.native
}

object SteamUser {
  @scala.inline
  def apply(
    _json: AnonAvatar,
    avatar: AnonLarge,
    name: String,
    profile: String,
    steamid: String,
    username: String
  ): SteamUser = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], steamid = steamid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SteamUser]
  }
  @scala.inline
  implicit class SteamUserOps[Self <: SteamUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_json(value: AnonAvatar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatar(value: AnonLarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteamid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steamid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

