package typingsSlinky.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticated extends js.Object {
  /**
    * Whether or not authentication was performed. 3D Secure will succeed without authentication when the
    * card is not enrolled.
    */
  var authenticated: Boolean = js.native
  /**
    * Whether or not 3D Secure succeeded.
    */
  var succeeded: Boolean = js.native
  /**
    * The version of 3D Secure that was used for this payment.
    */
  var version: String = js.native
}

object Authenticated {
  @scala.inline
  def apply(authenticated: Boolean, succeeded: Boolean, version: String): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
  @scala.inline
  implicit class AuthenticatedOps[Self <: Authenticated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

