package typingsSlinky.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellLabel extends StObject {
  
  var cellLabel: String = js.native
  
  var cellText: String = js.native
  
  var cellTextSelected: String = js.native
  
  var itemChecked: String = js.native
  
  var itemDecorator: String = js.native
  
  var label: String = js.native
  
  var root: String = js.native
}
object CellLabel {
  
  @scala.inline
  def apply(
    cellLabel: String,
    cellText: String,
    cellTextSelected: String,
    itemChecked: String,
    itemDecorator: String,
    label: String,
    root: String
  ): CellLabel = {
    val __obj = js.Dynamic.literal(cellLabel = cellLabel.asInstanceOf[js.Any], cellText = cellText.asInstanceOf[js.Any], cellTextSelected = cellTextSelected.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellLabel]
  }
  
  @scala.inline
  implicit class CellLabelMutableBuilder[Self <: CellLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLabel(value: String): Self = StObject.set(x, "cellLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTextSelected(value: String): Self = StObject.set(x, "cellTextSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
