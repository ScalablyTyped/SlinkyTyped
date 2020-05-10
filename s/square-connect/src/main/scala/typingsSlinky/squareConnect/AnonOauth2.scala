package typingsSlinky.squareConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOauth2 extends js.Object {
  var oauth2: AnonAccessToken = js.native
  var oauth2ClientSecret: AnonIn = js.native
}

object AnonOauth2 {
  @scala.inline
  def apply(oauth2: AnonAccessToken, oauth2ClientSecret: AnonIn): AnonOauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauth2]
  }
  @scala.inline
  implicit class AnonOauth2Ops[Self <: AnonOauth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOauth2(value: AnonAccessToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOauth2ClientSecret(value: AnonIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2ClientSecret")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

