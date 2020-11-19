package typingsSlinky.stripe.mod.issuing.authorizations

import typingsSlinky.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthorizationApproveOptions extends js.Object {
  
  /**
    * If the authorization’s is_held_amount_controllable property is true, you may provide this value to control how much to hold for the authorization.
    * Must be positive (use decline to decline an authorization request).
    */
  var held_amount: js.UndefOr[Double] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
}
object IAuthorizationApproveOptions {
  
  @scala.inline
  def apply(): IAuthorizationApproveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuthorizationApproveOptions]
  }
  
  @scala.inline
  implicit class IAuthorizationApproveOptionsOps[Self <: IAuthorizationApproveOptions] (val x: Self) extends AnyVal {
    
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
    def setHeld_amount(value: Double): Self = this.set("held_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeld_amount: Self = this.set("held_amount", js.undefined)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
