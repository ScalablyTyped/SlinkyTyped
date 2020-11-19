package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.anon.Executive
import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPersonListOptions extends IListOptions {
  
  var relationship: Executive = js.native
}
object IPersonListOptions {
  
  @scala.inline
  def apply(relationship: Executive): IPersonListOptions = {
    val __obj = js.Dynamic.literal(relationship = relationship.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonListOptions]
  }
  
  @scala.inline
  implicit class IPersonListOptionsOps[Self <: IPersonListOptions] (val x: Self) extends AnyVal {
    
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
    def setRelationship(value: Executive): Self = this.set("relationship", value.asInstanceOf[js.Any])
  }
}
