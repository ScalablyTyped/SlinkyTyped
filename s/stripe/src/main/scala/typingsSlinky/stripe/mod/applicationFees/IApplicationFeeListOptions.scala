package typingsSlinky.stripe.mod.applicationFees

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApplicationFeeListOptions extends IListOptionsCreated {
  
  /**
    * Only return application fees for the charge specified by this charge ID.
    */
  var charge: String = js.native
}
object IApplicationFeeListOptions {
  
  @scala.inline
  def apply(charge: String): IApplicationFeeListOptions = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFeeListOptions]
  }
  
  @scala.inline
  implicit class IApplicationFeeListOptionsOps[Self <: IApplicationFeeListOptions] (val x: Self) extends AnyVal {
    
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
    def setCharge(value: String): Self = this.set("charge", value.asInstanceOf[js.Any])
  }
}
