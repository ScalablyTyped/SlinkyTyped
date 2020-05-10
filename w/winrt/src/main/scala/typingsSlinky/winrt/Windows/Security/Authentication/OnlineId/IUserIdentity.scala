package typingsSlinky.winrt.Windows.Security.Authentication.OnlineId

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserIdentity extends js.Object {
  var firstName: String = js.native
  var id: String = js.native
  var isBetaAccount: Boolean = js.native
  var isConfirmedPC: Boolean = js.native
  var lastName: String = js.native
  var safeCustomerId: String = js.native
  var signInName: String = js.native
  var tickets: IVectorView[OnlineIdServiceTicket] = js.native
}

object IUserIdentity {
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
  ): IUserIdentity = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserIdentity]
  }
  @scala.inline
  implicit class IUserIdentityOps[Self <: IUserIdentity] (val x: Self) extends AnyVal {
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

