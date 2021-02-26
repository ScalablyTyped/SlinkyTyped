package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.srcSelectionMod.SelectionExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldSelection extends SelectionExtent {
  
  /**
    * The field name to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var field: js.UndefOr[FieldName] = js.native
  
  /**
    * The name of a selection.
    */
  var selection: String = js.native
}
object FieldSelection {
  
  @scala.inline
  def apply(selection: String): FieldSelection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSelection]
  }
  
  @scala.inline
  implicit class FieldSelectionMutableBuilder[Self <: FieldSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
