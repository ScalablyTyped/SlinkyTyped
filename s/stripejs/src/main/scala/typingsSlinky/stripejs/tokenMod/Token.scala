package typingsSlinky.stripejs.tokenMod

import typingsSlinky.stripejs.customerMod.BankAccount
import typingsSlinky.stripejs.customerMod.Card
import typingsSlinky.stripejs.stripejsStrings.account
import typingsSlinky.stripejs.stripejsStrings.bank_account
import typingsSlinky.stripejs.stripejsStrings.card
import typingsSlinky.stripejs.stripejsStrings.pii
import typingsSlinky.stripejs.stripejsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /**
    * Hash describing the bank account
    */
  var bank_account: js.UndefOr[BankAccount] = js.native
  /**
    * Hash describing the card used to make the charge
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * IP address of the client that generated the token
    */
  var client_ip: String = js.native
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: String = js.native
  /**
    * The unique identifier for the token
    */
  var id: String = js.native
  /**
    * LIVE MODE = `true`
    * TEST MODE = `false`
    */
  var livemode: Boolean = js.native
  var `object`: token = js.native
  /**
    * Type of the token
    */
  var `type`: account | bank_account | card | pii = js.native
  /**
    * Whether this token has already been used (tokens can be used only once)
    */
  var used: Boolean = js.native
}

object Token {
  @scala.inline
  def apply(
    client_ip: String,
    created: String,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: account | bank_account | card | pii,
    used: Boolean
  ): Token = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
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
    def withObject(value: token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: account | bank_account | card | pii): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBank_account(value: BankAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBank_account: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bank_account")(js.undefined)
        ret
    }
    @scala.inline
    def withCard(value: Card): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(js.undefined)
        ret
    }
  }
  
}

