package typingsSlinky.stripe.mod.tokens

import typingsSlinky.stripe.mod.IResourceObject
import typingsSlinky.stripe.stripeStrings.bank_account
import typingsSlinky.stripe.stripeStrings.card
import typingsSlinky.stripe.stripeStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_ip(value: String): Self = this.set("client_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: token): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: card | bank_account): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsed(value: Boolean): Self = this.set("used", value.asInstanceOf[js.Any])
  }
}
