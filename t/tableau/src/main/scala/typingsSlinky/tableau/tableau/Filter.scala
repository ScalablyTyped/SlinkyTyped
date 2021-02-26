package typingsSlinky.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  /** Gets the field that is currently being filtered. */
  def getFieldAsync(): js.Promise[Field] = js.native
  
  /** Gets the name of the field being filtered. Note that this is the caption as shown in the UI and not the actual database field name. */
  def getFieldName(): String = js.native
  
  /** Gets the type of the filter. See FilterType Enum for the values in the enum. */
  def getFilterType(): FilterType = js.native
  
  /** Gets the parent worksheet */
  def getWorksheet(): Worksheet = js.native
}
object Filter {
  
  @scala.inline
  def apply(
    getFieldAsync: () => js.Promise[Field],
    getFieldName: () => String,
    getFilterType: () => FilterType,
    getWorksheet: () => Worksheet
  ): Filter = {
    val __obj = js.Dynamic.literal(getFieldAsync = js.Any.fromFunction0(getFieldAsync), getFieldName = js.Any.fromFunction0(getFieldName), getFilterType = js.Any.fromFunction0(getFilterType), getWorksheet = js.Any.fromFunction0(getWorksheet))
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFieldAsync(value: () => js.Promise[Field]): Self = StObject.set(x, "getFieldAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldName(value: () => String): Self = StObject.set(x, "getFieldName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterType(value: () => FilterType): Self = StObject.set(x, "getFilterType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorksheet(value: () => Worksheet): Self = StObject.set(x, "getWorksheet", js.Any.fromFunction0(value))
  }
}
