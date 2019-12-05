package typingsSlinky.stripe.stripeMod.setupIntents

import typingsSlinky.stripe.stripeMod.accounts.IAccountCreationOptions
import typingsSlinky.stripe.stripeMod.cards.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | typingsSlinky.stripe.stripeMod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions
}

object ISetupIntentTransferData {
  @scala.inline
  def apply(
    destination: String | typingsSlinky.stripe.stripeMod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions
  ): ISetupIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISetupIntentTransferData]
  }
}

