package typingsSlinky.stripe.mod.setupIntents

import typingsSlinky.stripe.mod.accounts.IAccountCreationOptions
import typingsSlinky.stripe.mod.bankAccounts.IBankAccount
import typingsSlinky.stripe.mod.cards.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetupIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccountCreationOptions = js.native
}

object ISetupIntentTransferData {
  @scala.inline
  def apply(destination: String | IBankAccount | ICardHash | IAccountCreationOptions): ISetupIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentTransferData]
  }
  @scala.inline
  implicit class ISetupIntentTransferDataOps[Self <: ISetupIntentTransferData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String | IBankAccount | ICardHash | IAccountCreationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

