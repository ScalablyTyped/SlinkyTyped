package typingsSlinky.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the setAssociations mixin of the hasMany association.
  * @see HasManySetAssociationsMixin
  */
@js.native
trait HasManySetAssociationsMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.native
}
object HasManySetAssociationsMixinOptions {
  
  @scala.inline
  def apply(): HasManySetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManySetAssociationsMixinOptions]
  }
  
  @scala.inline
  implicit class HasManySetAssociationsMixinOptionsMutableBuilder[Self <: HasManySetAssociationsMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
