package typingsSlinky.stripe.stripeMod

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.stripe.Anon_Bindingsversion
import typingsSlinky.stripe.Anon_NamePartnerid
import typingsSlinky.stripe.stripeMod.resources.Accounts
import typingsSlinky.stripe.stripeMod.resources.ApplicationFees
import typingsSlinky.stripe.stripeMod.resources.Balance
import typingsSlinky.stripe.stripeMod.resources.BalanceTransaction
import typingsSlinky.stripe.stripeMod.resources.BitcoinReceivers
import typingsSlinky.stripe.stripeMod.resources.Charges
import typingsSlinky.stripe.stripeMod.resources.Checkout
import typingsSlinky.stripe.stripeMod.resources.CountrySpecs
import typingsSlinky.stripe.stripeMod.resources.Coupons
import typingsSlinky.stripe.stripeMod.resources.CreditNotes
import typingsSlinky.stripe.stripeMod.resources.Customers
import typingsSlinky.stripe.stripeMod.resources.Disputes
import typingsSlinky.stripe.stripeMod.resources.EphemeralKeys
import typingsSlinky.stripe.stripeMod.resources.Events
import typingsSlinky.stripe.stripeMod.resources.FileLinks
import typingsSlinky.stripe.stripeMod.resources.Files
import typingsSlinky.stripe.stripeMod.resources.InvoiceItems
import typingsSlinky.stripe.stripeMod.resources.Invoices
import typingsSlinky.stripe.stripeMod.resources.Issuing
import typingsSlinky.stripe.stripeMod.resources.OAuth
import typingsSlinky.stripe.stripeMod.resources.Orders
import typingsSlinky.stripe.stripeMod.resources.PaymentIntents
import typingsSlinky.stripe.stripeMod.resources.PaymentMethods
import typingsSlinky.stripe.stripeMod.resources.Payouts
import typingsSlinky.stripe.stripeMod.resources.Plans
import typingsSlinky.stripe.stripeMod.resources.Products
import typingsSlinky.stripe.stripeMod.resources.RecipientCards
import typingsSlinky.stripe.stripeMod.resources.Recipients
import typingsSlinky.stripe.stripeMod.resources.Refunds
import typingsSlinky.stripe.stripeMod.resources.Reviews
import typingsSlinky.stripe.stripeMod.resources.SKUs
import typingsSlinky.stripe.stripeMod.resources.SetupIntents
import typingsSlinky.stripe.stripeMod.resources.Sources
import typingsSlinky.stripe.stripeMod.resources.SubscriptionItems
import typingsSlinky.stripe.stripeMod.resources.Subscriptions
import typingsSlinky.stripe.stripeMod.resources.TaxRates
import typingsSlinky.stripe.stripeMod.resources.Tokens
import typingsSlinky.stripe.stripeMod.resources.Topups
import typingsSlinky.stripe.stripeMod.resources.Transfers
import typingsSlinky.stripe.stripeMod.resources.UsageRecordSummaries
import typingsSlinky.stripe.stripeMod.resources.UsageRecords
import typingsSlinky.stripe.stripeMod.resources.WebHooks
import typingsSlinky.stripe.stripeMod.resources.WebhookEndpoints
import typingsSlinky.stripe.stripeStrings.request
import typingsSlinky.stripe.stripeStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  var DEFAULT_API_VERSION: String = js.native
  var DEFAULT_BASE_PATH: String = js.native
  var DEFAULT_HOST: String = js.native
  var DEFAULT_PORT: String = js.native
  var DEFAULT_TIMEOUT: Double = js.native
  var PACKAGE_VERSION: String = js.native
  var StripeResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.StripeResource */ js.Any = js.native
  var USER_AGENT: Anon_Bindingsversion = js.native
  var USER_AGENT_SERIALIZED: String = js.native
  var accounts: Accounts = js.native
  var applicationFees: ApplicationFees = js.native
  var balance: Balance = js.native
  var balanceTransactions: BalanceTransaction = js.native
  var bitcoinReceivers: BitcoinReceivers = js.native
  var charges: Charges = js.native
  var checkout: Checkout = js.native
  var countrySpecs: CountrySpecs = js.native
  var coupons: Coupons = js.native
  var creditNotes: CreditNotes = js.native
  var customers: Customers = js.native
  var disputes: Disputes = js.native
  var ephemeralKeys: EphemeralKeys = js.native
  var events: Events = js.native
  var fileLinks: FileLinks = js.native
  var files: Files = js.native
  var invoiceItems: InvoiceItems = js.native
  var invoices: Invoices = js.native
  var issuing: Issuing = js.native
  var oauth: OAuth = js.native
  var orders: Orders = js.native
  var paymentIntents: PaymentIntents = js.native
  var paymentMethods: PaymentMethods = js.native
  var payouts: Payouts = js.native
  var plans: Plans = js.native
  var products: Products = js.native
  /**
    * @deprecated
    */
  var recipientCards: RecipientCards = js.native
  /**
    * @deprecated
    */
  var recipients: Recipients = js.native
  var refunds: Refunds = js.native
  var resources: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.resources */ js.Any = js.native
  var reviews: Reviews = js.native
  var setupIntents: SetupIntents = js.native
  var skus: SKUs = js.native
  var sources: Sources = js.native
  var subscriptionItems: SubscriptionItems = js.native
  var subscriptions: Subscriptions = js.native
  var taxRates: TaxRates = js.native
  var tokens: Tokens = js.native
  var topups: Topups = js.native
  var transfers: Transfers = js.native
  var usageRecordSummaries: UsageRecordSummaries = js.native
  var usageRecords: UsageRecords = js.native
  var webhookEndpoints: WebhookEndpoints = js.native
  var webhooks: WebHooks = js.native
  def getClientUserAgent(response: js.Function1[/* userAgent */ String, Unit]): Unit = js.native
  def getConstant(c: String): js.Any = js.native
  def getMaxNetworkRetries(): Double = js.native
  def getTelemetryEnabled(): Boolean = js.native
  @JSName("off")
  def off_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_request(event: request, handler: js.Function1[/* event */ RequestEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_response(event: response, handler: js.Function1[/* event */ ResponseEvent, Unit]): Unit = js.native
  def setApiKey(): Unit = js.native
  def setApiKey(key: String): Unit = js.native
  def setApiVersion(): Unit = js.native
  def setApiVersion(version: String): Unit = js.native
  def setAppInfo(): Unit = js.native
  def setAppInfo(info: Anon_NamePartnerid): Unit = js.native
  def setHost(host: String): Unit = js.native
  def setHost(host: String, port: String): Unit = js.native
  def setHost(host: String, port: String, protocol: String): Unit = js.native
  def setHost(host: String, port: Double): Unit = js.native
  def setHost(host: String, port: Double, protocol: String): Unit = js.native
  def setHttpAgent(agent: Agent): Unit = js.native
  def setMaxNetworkRetries(maxNetworkRetries: Double): Unit = js.native
  def setPort(port: String): Unit = js.native
  def setPort(port: Double): Unit = js.native
  def setProtocol(protocol: String): Unit = js.native
  def setTelemetryEnabled(enabled: Boolean): Unit = js.native
  def setTimeout(): Unit = js.native
  def setTimeout(timeout: Double): Unit = js.native
}

