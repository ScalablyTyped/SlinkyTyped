package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AadOauthTokenResult extends js.Object {
  var accessToken: String = js.native
  var refreshTokenCache: String = js.native
}

object AadOauthTokenResult {
  @scala.inline
  def apply(accessToken: String, refreshTokenCache: String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], refreshTokenCache = refreshTokenCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenResult]
  }
  @scala.inline
  implicit class AadOauthTokenResultOps[Self <: AadOauthTokenResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshTokenCache(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshTokenCache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

