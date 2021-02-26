package typingsSlinky.storybookClientApi.typesMod

import typingsSlinky.storybookAddons.typesMod.StoryId
import typingsSlinky.storybookAddons.typesMod.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSelection extends StObject {
  
  var storyId: StoryId = js.native
  
  var viewMode: ViewMode = js.native
}
object StoreSelection {
  
  @scala.inline
  def apply(storyId: StoryId, viewMode: ViewMode): StoreSelection = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSelection]
  }
  
  @scala.inline
  implicit class StoreSelectionMutableBuilder[Self <: StoreSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStoryId(value: StoryId): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
