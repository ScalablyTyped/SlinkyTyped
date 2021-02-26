package typingsSlinky.waterline.mod

import typingsSlinky.waterline.waterlineStrings.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined waterline.waterline.BaseAttribute<number> & {  type :'float'} */
@js.native
trait FloatAttribute extends _Attribute {
  
  var allowNull: js.UndefOr[Boolean] = js.native
  
  var autoCreatedAt: js.UndefOr[Boolean] = js.native
  
  var autoUpdatedAt: js.UndefOr[Boolean] = js.native
  
  var columnName: js.UndefOr[String] = js.native
  
  var defaultsTo: js.UndefOr[Double | DefaultsToFn[Double]] = js.native
  
  var enum: js.UndefOr[js.Array[Double]] = js.native
  
  var index: js.UndefOr[Boolean] = js.native
  
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] with float = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var validations: js.UndefOr[AttributeValidations] = js.native
}
object FloatAttribute {
  
  @scala.inline
  def apply(`type`: js.UndefOr[String] with float): FloatAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatAttribute]
  }
  
  @scala.inline
  implicit class FloatAttributeMutableBuilder[Self <: FloatAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNull(value: Boolean): Self = StObject.set(x, "allowNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullUndefined: Self = StObject.set(x, "allowNull", js.undefined)
    
    @scala.inline
    def setAutoCreatedAt(value: Boolean): Self = StObject.set(x, "autoCreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreatedAtUndefined: Self = StObject.set(x, "autoCreatedAt", js.undefined)
    
    @scala.inline
    def setAutoUpdatedAt(value: Boolean): Self = StObject.set(x, "autoUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdatedAtUndefined: Self = StObject.set(x, "autoUpdatedAt", js.undefined)
    
    @scala.inline
    def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    @scala.inline
    def setDefaultsTo(value: Double | DefaultsToFn[Double]): Self = StObject.set(x, "defaultsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsToFunction0(value: () => Double): Self = StObject.set(x, "defaultsTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDefaultsToUndefined: Self = StObject.set(x, "defaultsTo", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[Double]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: Double*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: js.UndefOr[String] with float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    @scala.inline
    def setValidations(value: AttributeValidations): Self = StObject.set(x, "validations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationsUndefined: Self = StObject.set(x, "validations", js.undefined)
  }
}
