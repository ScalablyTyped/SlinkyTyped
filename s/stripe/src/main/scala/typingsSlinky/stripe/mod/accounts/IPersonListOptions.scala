package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.anon.Executive
import typingsSlinky.stripe.mod.IListOptions
import org.scalablytyped.runtime.StObject
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
  implicit class IPersonListOptionsMutableBuilder[Self <: IPersonListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationship(value: Executive): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
  }
}
