package typingsSlinky.winrtUwp.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ID, tickets, and other information associated with a user. */
@js.native
trait UserIdentity extends js.Object {
  /** Contains the first name of the user. This value is available only to Microsoft application partners. */
  var firstName: String = js.native
  /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
  var id: String = js.native
  /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
  var isBetaAccount: Boolean = js.native
  /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
  var isConfirmedPC: Boolean = js.native
  /** Contains the user's last name. This value is available only to Microsoft application partners. */
  var lastName: String = js.native
  /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
  var safeCustomerId: String = js.native
  /** The sign in name of the user. This value is available only to Microsoft application partners. */
  var signInName: String = js.native
  /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
  var tickets: IVectorView[OnlineIdServiceTicket] = js.native
}

object UserIdentity {
  @scala.inline
  def apply(
    firstName: String,
    id: String,
    isBetaAccount: Boolean,
    isConfirmedPC: Boolean,
    lastName: String,
    safeCustomerId: String,
    signInName: String,
    tickets: IVectorView[OnlineIdServiceTicket]
  ): UserIdentity = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  @scala.inline
  implicit class UserIdentityOps[Self <: UserIdentity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBetaAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBetaAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConfirmedPC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConfirmedPC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeCustomerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignInName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signInName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickets(value: IVectorView[OnlineIdServiceTicket]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

