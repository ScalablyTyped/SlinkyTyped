package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenBase extends IResourceObject {
  /**
    * IP address of the client that generated the token
    */
  var client_ip: String = js.native
  var created: Double = js.native
  var livemode: Boolean = js.native
  /**
    * Value is "token""
    */
  @JSName("object")
  var object_ITokenBase: token = js.native
  /**
    * Type of the token: card or bank_account
    */
  var `type`: card | bank_account = js.native
  /**
    * Whether or not this token has already been used (tokens can be used only once)
    */
  var used: Boolean = js.native
}

object ITokenBase {
  @scala.inline
  def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: token,
    `type`: card | bank_account,
    used: Boolean
  ): ITokenBase = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenBase]
  }
  @scala.inline
  implicit class ITokenBaseOps[Self <: ITokenBase] (val x: Self) extends AnyVal {
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
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
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
    def withType(value: card | bank_account): Self = {
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
  }
  
}

