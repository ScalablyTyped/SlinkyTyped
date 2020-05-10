package typingsSlinky.stripe.mod.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuthDeauthorizationResponse extends js.Object {
  /**
    * The unique id of the account you have revoked access to, as a string. This is the same as the stripe_user_id you passed in. If this is returned, the revocation was successful.
    */
  var stripe_user_id: String = js.native
}

object IOAuthDeauthorizationResponse {
  @scala.inline
  def apply(stripe_user_id: String): IOAuthDeauthorizationResponse = {
    val __obj = js.Dynamic.literal(stripe_user_id = stripe_user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthDeauthorizationResponse]
  }
  @scala.inline
  implicit class IOAuthDeauthorizationResponseOps[Self <: IOAuthDeauthorizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripe_user_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripe_user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

