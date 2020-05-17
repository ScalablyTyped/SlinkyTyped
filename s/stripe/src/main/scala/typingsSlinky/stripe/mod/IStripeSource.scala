package typingsSlinky.stripe.mod

import typingsSlinky.stripe.mod.bitcoinReceivers.IBitcoinReceiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any Stripe source, including a bank account, credit/debit card, or less common "Source" types (see https://stripe.com/docs/api/sources/object). */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stripe.mod.cards.ICard
  - typingsSlinky.stripe.mod.bitcoinReceivers.IBitcoinReceiver
  - typingsSlinky.stripe.mod.bankAccounts.IBankAccount
  - typingsSlinky.stripe.mod.sources.ISource
*/
trait IStripeSource extends js.Object

object IStripeSource {
  @scala.inline
  implicit def apply(value: typingsSlinky.stripe.mod.bankAccounts.IBankAccount): IStripeSource = value.asInstanceOf[IStripeSource]
  @scala.inline
  implicit def apply(value: IBitcoinReceiver): IStripeSource = value.asInstanceOf[IStripeSource]
  @scala.inline
  implicit def apply(value: typingsSlinky.stripe.mod.cards.ICard): IStripeSource = value.asInstanceOf[IStripeSource]
  @scala.inline
  implicit def apply(value: typingsSlinky.stripe.mod.sources.ISource): IStripeSource = value.asInstanceOf[IStripeSource]
}

