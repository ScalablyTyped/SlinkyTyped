package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAvatarUrl extends js.Object {
  /**
    * 用户的微信头像 url
    */
  var avatarUrl: String = js.native
  /**
    * 用户的微信昵称
    */
  var nickname: String = js.native
  /**
    * 用户 openid
    */
  var openid: String = js.native
}

object AnonAvatarUrl {
  @scala.inline
  def apply(avatarUrl: String, nickname: String, openid: String): AnonAvatarUrl = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], openid = openid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAvatarUrl]
  }
  @scala.inline
  implicit class AnonAvatarUrlOps[Self <: AnonAvatarUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

