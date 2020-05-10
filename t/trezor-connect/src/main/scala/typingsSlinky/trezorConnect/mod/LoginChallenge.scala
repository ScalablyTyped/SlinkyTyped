package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginChallenge extends RequestLoginParams {
  var challengeHidden: String = js.native
  var challengeVisual: String = js.native
}

object LoginChallenge {
  @scala.inline
  def apply(challengeHidden: String, challengeVisual: String): LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginChallenge]
  }
  @scala.inline
  implicit class LoginChallengeOps[Self <: LoginChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeVisual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeVisual")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

