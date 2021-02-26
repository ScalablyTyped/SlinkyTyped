package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.util.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IErrors extends ICollection {
  
  /** [Method] Adds an item to the collection
    * @returns Object The item added.
    */
  @JSName("add")
  var add_IErrors: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns all of the errors for the given field
    * @param fieldName String The field to get errors for.
    * @returns Object[] All errors for the given field.
    */
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Array]] = js.native
  
  /** [Method] Returns true if there are no errors in the collection
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
}
object IErrors {
  
  @scala.inline
  def apply(): IErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrors]
  }
  
  @scala.inline
  implicit class IErrorsMutableBuilder[Self <: IErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: () => _): Self = StObject.set(x, "add", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setGetByField(value: /* fieldName */ js.UndefOr[String] => Array): Self = StObject.set(x, "getByField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByFieldUndefined: Self = StObject.set(x, "getByField", js.undefined)
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
  }
}
