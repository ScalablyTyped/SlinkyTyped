package typingsSlinky.stripejs.mod

import typingsSlinky.stripejs.anon.Clientsecret
import typingsSlinky.stripejs.elementMod.ElementCreatorOptions
import typingsSlinky.stripejs.elementMod.ElementFactory
import typingsSlinky.stripejs.elementMod.StripeElement
import typingsSlinky.stripejs.paymentMod.StripePaymentOptions
import typingsSlinky.stripejs.paymentMod.StripePaymentRequest
import typingsSlinky.stripejs.sourceMod.SourceData
import typingsSlinky.stripejs.sourceMod.SourceResult
import typingsSlinky.stripejs.stripejsStrings.bank_account
import typingsSlinky.stripejs.stripejsStrings.pii
import typingsSlinky.stripejs.tokenMod.BankTokenData
import typingsSlinky.stripejs.tokenMod.IBANTokenData
import typingsSlinky.stripejs.tokenMod.PiiTokenData
import typingsSlinky.stripejs.tokenMod.TokenData
import typingsSlinky.stripejs.tokenMod.TokenResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeJS extends js.Object {
  
  /**
    * Initialization function for StripeJS
    * @see https://stripe.com/docs/stripe-js/reference#including-stripejs
    *
    * @param key - The public key of the user
    * @param [options] - Any options to configure StripeJS
    *
    * @return StripeJS instance
    */
  def apply(key: String): StripeJS = js.native
  def apply(key: String, options: StripeConfigOptions): StripeJS = js.native
  
  /**
    * The currently used key
    */
  var _apiKey: String = js.native
  
  /**
    * The mode in which the requests are currently done
    * @example 'test'
    */
  var _keyMode: String = js.native
  
  def createSource(data: SourceData): js.Promise[SourceResult] = js.native
  /**
    *  convert payment information collected by Elements into a Source object that you safely pass
    *  to your server to use in an API call
    *  @see https://stripe.com/docs/stripe-js/reference#stripe-create-source
    *
    * @param element - The element from which information should be extracted
    * @param data - An object containing the type of Source you want to create and any additional payment source information
    * NOTE: You cannot pass raw card information without an `Element`!
    *
    * @return an object containing the generated Source or an error
    */
  def createSource(element: StripeElement, data: SourceData): js.Promise[SourceResult] = js.native
  
  /**
    * to convert information collected by Elements into a single-use token that you safely pass to your server
    * to use in an API call
    * @see https://stripe.com/docs/stripe-js/reference#stripe-create-token
    *
    * @param element - The element from which the data should be extracted
    * @param [data] - an object containing additional payment information you might have collected
    *
    * @return an object containing the generated token or an error
    */
  def createToken(element: StripeElement): js.Promise[TokenResult] = js.native
  def createToken(element: StripeElement, data: IBANTokenData): js.Promise[TokenResult] = js.native
  def createToken(element: StripeElement, data: TokenData): js.Promise[TokenResult] = js.native
  @JSName("createToken")
  def createToken_bankaccount(`type`: bank_account, data: BankTokenData): js.Promise[TokenResult] = js.native
  @JSName("createToken")
  def createToken_pii(`type`: pii, data: PiiTokenData): js.Promise[TokenResult] = js.native
  
  /**
    * Create an instance of elements which can be used to manage a group of StripeJS elements
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    *
    * @param [options] - Configuration options for the elements object
    *
    * @return an instance of `Elements` to manage a group of elements
    */
  def elements(): ElementFactory = js.native
  def elements(options: ElementCreatorOptions): ElementFactory = js.native
  
  /**
    * Creates a new payment request based on the given options
    * @see https://stripe.com/docs/stripe-js/reference#stripe-payment-request
    *
    * @param options - Options that should be used to configure the payment request
    */
  def paymentRequest(options: StripePaymentOptions): StripePaymentRequest = js.native
  
  /**
    * Retrieve a Source using its unique ID and client secret
    * NOTE: The parameters are always available in any source object fetched with StripeJS
    *
    * @param id - Unique identifier of the source
    * @param client_secret - A secret available to the web client that created the Source
    *
    * @return an object containing the generated Source or an error
    */
  def retrieveSource(hasIdClient_secret: Clientsecret): js.Promise[SourceResult] = js.native
}
