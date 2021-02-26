package typingsSlinky.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by ListView's currentItem API
  **/
@js.native
trait IListViewItem extends StObject {
  
  /**
    * Gets or sets whether the ListView item is focused.
    **/
  var hasFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets index of the ListView item.
    **/
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets key of the ListView item.
    **/
  var key: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the ListView item is focused and is showing its focus visual.
    **/
  var showFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the type, if any.
    **/
  var `type`: js.UndefOr[ObjectType] = js.native
}
object IListViewItem {
  
  @scala.inline
  def apply(): IListViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListViewItem]
  }
  
  @scala.inline
  implicit class IListViewItemMutableBuilder[Self <: IListViewItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFocus(value: Boolean): Self = StObject.set(x, "hasFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFocusUndefined: Self = StObject.set(x, "hasFocus", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setShowFocus(value: Boolean): Self = StObject.set(x, "showFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFocusUndefined: Self = StObject.set(x, "showFocus", js.undefined)
    
    @scala.inline
    def setType(value: ObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
