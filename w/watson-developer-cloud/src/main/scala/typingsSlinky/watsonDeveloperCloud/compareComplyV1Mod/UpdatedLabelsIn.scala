package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The updated labeling from the input document, accounting for the submitted feedback. */
@js.native
trait UpdatedLabelsIn extends StObject {
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.Array[Category] = js.native
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.Array[TypeLabel] = js.native
}
object UpdatedLabelsIn {
  
  @scala.inline
  def apply(categories: js.Array[Category], types: js.Array[TypeLabel]): UpdatedLabelsIn = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedLabelsIn]
  }
  
  @scala.inline
  implicit class UpdatedLabelsInMutableBuilder[Self <: UpdatedLabelsIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[TypeLabel]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TypeLabel*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
