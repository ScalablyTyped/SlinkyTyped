package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.mod.bankAccounts.IBankAccount
import typingsSlinky.stripe.mod.cards.ICard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Helper
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.bankAccounts.IBankAccount
  - typingsSlinky.stripe.mod.cards.ICard
*/
trait IExternalAccount extends js.Object

object IExternalAccount {
  @scala.inline
  implicit def apply(value: IBankAccount): IExternalAccount = value.asInstanceOf[IExternalAccount]
  @scala.inline
  implicit def apply(value: ICard): IExternalAccount = value.asInstanceOf[IExternalAccount]
}

