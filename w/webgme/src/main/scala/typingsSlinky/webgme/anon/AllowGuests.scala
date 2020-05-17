package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowGuests extends js.Object {
  /**
    * Generate a guest account for non-authenticated connections.
    *    config.authentication.allowGuests = true;
    */
  var allowGuests: Boolean = js.native
  /**
    * Allow clients to create new users via the REST api.
    *    config.authentication.allowUserRegistration = true;
    */
  var allowUserRegistration: Boolean = js.native
  var authorizer: Options = js.native
  /**
    * If true certain parts will require that users are authenticated.
    *    config.authentication.enable = false;
    */
  var enable: Boolean = js.native
  /**
    * User account which non-authenticated connections will access the storage.
    *    config.authentication.guestAccount = 'guest';
    */
  var guestAccount: String = js.native
  var jwt: Algorithm = js.native
  /**
    * Where clients are redirected if not authenticated.
    *    config.authentication.logInUrl = '/profile/login';
    */
  var logInUrl: String = js.native
  /**
    * Where clients are redirected after logout.
    *   config.authentication.logOutUrl = '/profile/login';
    */
  var logOutUrl: String = js.native
  /**
    * Strength of the salting of the users' passwords bcrypt.
    *   config.authentication.salts = 10;
    */
  var salts: Double = js.native
}

object AllowGuests {
  @scala.inline
  def apply(
    allowGuests: Boolean,
    allowUserRegistration: Boolean,
    authorizer: Options,
    enable: Boolean,
    guestAccount: String,
    jwt: Algorithm,
    logInUrl: String,
    logOutUrl: String,
    salts: Double
  ): AllowGuests = {
    val __obj = js.Dynamic.literal(allowGuests = allowGuests.asInstanceOf[js.Any], allowUserRegistration = allowUserRegistration.asInstanceOf[js.Any], authorizer = authorizer.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], guestAccount = guestAccount.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], logInUrl = logInUrl.asInstanceOf[js.Any], logOutUrl = logOutUrl.asInstanceOf[js.Any], salts = salts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowGuests]
  }
  @scala.inline
  implicit class AllowGuestsOps[Self <: AllowGuests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowGuests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGuests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowUserRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorizer(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuestAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJwt(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jwt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogInUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logInUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogOutUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logOutUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

