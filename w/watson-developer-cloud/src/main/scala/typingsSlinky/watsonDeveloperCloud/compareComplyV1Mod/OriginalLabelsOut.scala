package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The original labeling from the input document, without the submitted feedback. */
@js.native
trait OriginalLabelsOut extends js.Object {
  
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.UndefOr[js.Array[Category]] = js.native
  
  /** A string identifying the type of modification the feedback entry in the `updated_labels` array. Possible values are `added`, `not_changed`, and `removed`. */
  var modification: js.UndefOr[String] = js.native
  
  /** Description of the action specified by the element and whom it affects. */
  var types: js.UndefOr[js.Array[TypeLabel]] = js.native
}
object OriginalLabelsOut {
  
  @scala.inline
  def apply(): OriginalLabelsOut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalLabelsOut]
  }
  
  @scala.inline
  implicit class OriginalLabelsOutOps[Self <: OriginalLabelsOut] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: Category*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Category]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setModification(value: String): Self = this.set("modification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModification: Self = this.set("modification", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: TypeLabel*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[TypeLabel]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
