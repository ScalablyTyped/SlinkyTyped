package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with hasOne relationship
  *
  * @see Association class hasOne method
  */
@js.native
trait AssociationOptionsHasOne extends AssociationOptions {
  
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
}
object AssociationOptionsHasOne {
  
  @scala.inline
  def apply(): AssociationOptionsHasOne = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsHasOne]
  }
  
  @scala.inline
  implicit class AssociationOptionsHasOneMutableBuilder[Self <: AssociationOptionsHasOne] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: DataTypeAbstract): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
  }
}
