package typingsSlinky.winrtUwp.anon

import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpChallengeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeHeaderValue extends js.Object {
  /** The HttpChallengeHeaderValue version of the string. */ var challengeHeaderValue: HttpChallengeHeaderValue = js.native
  /** true if input is valid HttpChallengeHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ChallengeHeaderValue {
  @scala.inline
  def apply(challengeHeaderValue: HttpChallengeHeaderValue, returnValue: Boolean): ChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(challengeHeaderValue = challengeHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeHeaderValue]
  }
  @scala.inline
  implicit class ChallengeHeaderValueOps[Self <: ChallengeHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeHeaderValue(value: HttpChallengeHeaderValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeHeaderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

