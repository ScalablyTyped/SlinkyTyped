package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.columnTypesMod.ColumnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsArray extends StObject {
  
  var isArray: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double | String] = js.native
  
  var precision: js.UndefOr[Double | Null] = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[ColumnType | String] = js.native
}
object IsArray {
  
  @scala.inline
  def apply(): IsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsArray]
  }
  
  @scala.inline
  implicit class IsArrayMutableBuilder[Self <: IsArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    @scala.inline
    def setLength(value: Double | String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setType(value: ColumnType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
