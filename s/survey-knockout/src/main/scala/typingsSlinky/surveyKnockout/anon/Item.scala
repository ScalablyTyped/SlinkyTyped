package typingsSlinky.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends StObject {
  
  var clearButton: String = js.native
  
  var image: String = js.native
  
  var item: String = js.native
  
  var itemChecked: String = js.native
  
  var itemControl: String = js.native
  
  var itemInline: String = js.native
  
  var itemText: String = js.native
  
  var label: String = js.native
  
  var root: String = js.native
}
object Item {
  
  @scala.inline
  def apply(
    clearButton: String,
    image: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemInline: String,
    itemText: String,
    label: String,
    root: String
  ): Item = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButton(value: String): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemControl(value: String): Self = StObject.set(x, "itemControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInline(value: String): Self = StObject.set(x, "itemInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
