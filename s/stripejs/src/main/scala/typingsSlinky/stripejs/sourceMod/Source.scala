package typingsSlinky.stripejs.sourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripejs.customerMod.Customer
import typingsSlinky.stripejs.stripejsStrings.canceled
import typingsSlinky.stripejs.stripejsStrings.chargeable
import typingsSlinky.stripejs.stripejsStrings.code_verification
import typingsSlinky.stripejs.stripejsStrings.consumed
import typingsSlinky.stripejs.stripejsStrings.failed
import typingsSlinky.stripejs.stripejsStrings.none
import typingsSlinky.stripejs.stripejsStrings.pending
import typingsSlinky.stripejs.stripejsStrings.receiver
import typingsSlinky.stripejs.stripejsStrings.redirect
import typingsSlinky.stripejs.stripejsStrings.reusable
import typingsSlinky.stripejs.stripejsStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source
  extends /**
  * A matching name to the type with extra information about the payment method
  * @see type
  */
/* key */ StringDictionary[js.Any] {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00,
    * or 1 for ¥1, Japanese Yen being a zero-decimal currency) representing the total
    * amount associated with the source
    */
  var amount: Double = js.native
  /**
    * The client secret of the source.
    * Used for client-side retrieval using a publishable key.
    */
  var client_secret: String = js.native
  /**
    * Information related to the code verification flow
    * Present if the source is authenticated by a verification code
    */
  var code_verification: js.UndefOr[CodeVerification] = js.native
  /**
    * Time at which the object was created.
    * Measured in seconds since the Unix epoch.
    * (Timestamp)
    */
  var created: Double = js.native
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String = js.native
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none = js.native
  /**
    * Unique identifier for the object
    */
  var id: String = js.native
  /**
    * LIVE MODE = true
    * TEST MODE = false
    */
  var livemode: Boolean = js.native
  /**
    * Your own saved information with this bank account
    */
  var metadata: StringDictionary[String] = js.native
  var `object`: source = js.native
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: Customer = js.native
  /**
    * Information related to the receiver flow.
    * Present if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.native
  /**
    * Information related to the redirect flow.
    * Present if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.native
  /**
    * Extra information about a source
    * NOTE: This will appear on your customer’s statement every time you charge the source
    */
  var statement_descriptor: String = js.native
  /**
    * The status of the source
    * NOTE: Only `chargeable` sources can be used to create a charge
    */
  var status: pending | canceled | failed | consumed | chargeable = js.native
  /**
    * The type of the source.
    * NOTE: The type is a payment method
    */
  var `type`: paymentOptions = js.native
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable = js.native
}

object Source {
  @scala.inline
  def apply(
    amount: Double,
    client_secret: String,
    created: Double,
    currency: String,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: StringDictionary[String],
    `object`: source,
    owner: Customer,
    statement_descriptor: String,
    status: pending | canceled | failed | consumed | chargeable,
    `type`: paymentOptions,
    usage: reusable
  ): Source = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlow(value: redirect | receiver | code_verification | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLivemode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: pending | canceled | failed | consumed | chargeable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: paymentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: reusable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode_verification(value: CodeVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode_verification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code_verification")(js.undefined)
        ret
    }
    @scala.inline
    def withReceiver(value: Receiver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiver")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect(value: Redirect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
  }
  
}

