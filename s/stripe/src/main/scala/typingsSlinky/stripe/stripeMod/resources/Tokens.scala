package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IDataOptions
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.StripeResource
import typingsSlinky.stripe.stripeMod.tokens.IBankAccountToken
import typingsSlinky.stripe.stripeMod.tokens.IBankAccountTokenCreationOptions
import typingsSlinky.stripe.stripeMod.tokens.ICardToken
import typingsSlinky.stripe.stripeMod.tokens.ICardTokenCreationOptions
import typingsSlinky.stripe.stripeMod.tokens.IPiiTokenCreationOptions
import typingsSlinky.stripe.stripeMod.tokens.IToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Tokens")
@js.native
class Tokens () extends StripeResource {
  def create(data: IBankAccountTokenCreationOptions): js.Promise[IBankAccountToken] = js.native
  /**
    * Creates a single use token that wraps the details of a bank account. This token can be used
    * in place of a bank account object with any API method. These tokens can only be used once:
    * by attaching them to a recipient or managed account.
    */
  def create(data: IBankAccountTokenCreationOptions, options: HeaderOptions): js.Promise[IBankAccountToken] = js.native
  def create(
    data: IBankAccountTokenCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[IBankAccountToken]
  ): js.Promise[IBankAccountToken] = js.native
  def create(data: IBankAccountTokenCreationOptions, response: IResponseFn[IBankAccountToken]): js.Promise[IBankAccountToken] = js.native
  def create(data: ICardTokenCreationOptions): js.Promise[ICardToken] = js.native
  /**
    * Creates a single use token that wraps the details of a credit card. This token can be used
    * in place of a credit card object with any API method. These tokens can only be used once:
    * by creating a new charge object, or attaching them to a customer.
    */
  def create(data: ICardTokenCreationOptions, options: HeaderOptions): js.Promise[ICardToken] = js.native
  def create(data: ICardTokenCreationOptions, options: HeaderOptions, response: IResponseFn[ICardToken]): js.Promise[ICardToken] = js.native
  def create(data: ICardTokenCreationOptions, response: IResponseFn[ICardToken]): js.Promise[ICardToken] = js.native
  def create(data: IPiiTokenCreationOptions): js.Promise[IToken] = js.native
  /**
    * Creates a single use token that wraps the details of personally identifiable information (PII).
    * This token can be used in place of a personal_id_number in the Account Update API method.
    * These tokens can only be used once.
    */
  def create(data: IPiiTokenCreationOptions, options: HeaderOptions): js.Promise[IToken] = js.native
  def create(data: IPiiTokenCreationOptions, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  def create(data: IPiiTokenCreationOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  def retrieve(tokenId: String): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, data: IDataOptions): js.Promise[IToken] = js.native
  /**
    * Retrieves the token with the given ID.
    */
  def retrieve(tokenId: String, data: IDataOptions, options: HeaderOptions): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, data: IDataOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, options: HeaderOptions): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, options: HeaderOptions, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
  def retrieve(tokenId: String, response: IResponseFn[IToken]): js.Promise[IToken] = js.native
}

