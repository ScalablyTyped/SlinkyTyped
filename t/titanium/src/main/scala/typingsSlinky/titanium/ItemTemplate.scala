package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.UI.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template that represents the basic appearance of a list item.
  */
@js.native
trait ItemTemplate extends StObject {
  
  /**
    * Contains an array of subview templates to be added (in order) as children to this view.
    */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.native
  
  /**
    * Contains key-value pairs of view events and their listeners that are applied to the ListItem.
    */
  var events: js.UndefOr[js.Any] = js.native
  
  /**
    * Contains key-value pairs of view properties and their values that are applied to the ListItem.
    */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.native
}
object ItemTemplate {
  
  @scala.inline
  def apply(): ItemTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemTemplate]
  }
  
  @scala.inline
  implicit class ItemTemplateMutableBuilder[Self <: ItemTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildTemplates(value: js.Array[ViewTemplate]): Self = StObject.set(x, "childTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTemplatesUndefined: Self = StObject.set(x, "childTemplates", js.undefined)
    
    @scala.inline
    def setChildTemplatesVarargs(value: ViewTemplate*): Self = StObject.set(x, "childTemplates", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setProperties(value: Dictionary[ListItem]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
