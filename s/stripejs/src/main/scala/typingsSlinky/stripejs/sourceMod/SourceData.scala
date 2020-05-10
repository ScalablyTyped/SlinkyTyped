package typingsSlinky.stripejs.sourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripejs.customerMod.Customer
import typingsSlinky.stripejs.stripejsStrings.code_verification
import typingsSlinky.stripejs.stripejsStrings.none
import typingsSlinky.stripejs.stripejsStrings.receiver
import typingsSlinky.stripejs.stripejsStrings.redirect
import typingsSlinky.stripejs.stripejsStrings.reusable
import typingsSlinky.stripejs.stripejsStrings.single_use
import typingsSlinky.stripejs.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceData extends js.Object {
  /**
    * This is the amount for which the source will be chargeable once ready
    */
  var amount: Double = js.native
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String = js.native
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none = js.native
  /**
    * Information about a mandate possiblity attached to a source object
    * (generally for bank debits) as well as its acceptance status
    */
  var mandate: js.UndefOr[Mandate] = js.native
  /**
    * Extra data you want to add to the source object
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: js.UndefOr[Customer] = js.native
  /**
    * Can be set only if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.native
  /**
    * Required if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.native
  /**
    * An arbitrary string to be displayed on your customer’s statement
    * @example if your website is RunClub and the item you’re charging for is a race ticket,
    * you may want to specify a statement_descriptor of RunClub 5K race ticket.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  var three_d_secure_2_eap: js.UndefOr[js.Any] = js.native
  /**
    * When passed, token properties will override source parameters
    */
  var token: js.UndefOr[Token] = js.native
  /**
    * The type of the source to create
    */
  var `type`: paymentOptions = js.native
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable | single_use = js.native
}

object SourceData {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    flow: redirect | receiver | code_verification | none,
    `type`: paymentOptions,
    usage: reusable | single_use
  ): SourceData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
  @scala.inline
  implicit class SourceDataOps[Self <: SourceData] (val x: Self) extends AnyVal {
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
    def withType(value: paymentOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsage(value: reusable | single_use): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMandate(value: Mandate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mandate")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Customer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
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
    @scala.inline
    def withStatement_descriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatement_descriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statement_descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withThree_d_secure_2_eap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure_2_eap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThree_d_secure_2_eap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("three_d_secure_2_eap")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

