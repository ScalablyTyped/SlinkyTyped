package typingsSlinky.storybookUi.anon

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookUi.sidebarTypesMod.ItemRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightedRef extends StObject {
  
  var data: StoriesHash = js.native
  
  var highlightedRef: MutableRefObject[ItemRef] = js.native
  
  var isBrowsing: Boolean = js.native
  
  var isMain: Boolean = js.native
  
  def onSelectStoryId(storyId: String): Unit = js.native
  
  var refId: String = js.native
  
  var selectedStoryId: String = js.native
  
  def setHighlightedItemId(itemId: String): Unit = js.native
}
object HighlightedRef {
  
  @scala.inline
  def apply(
    data: StoriesHash,
    highlightedRef: MutableRefObject[ItemRef],
    isBrowsing: Boolean,
    isMain: Boolean,
    onSelectStoryId: String => Unit,
    refId: String,
    selectedStoryId: String,
    setHighlightedItemId: String => Unit
  ): HighlightedRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onSelectStoryId = js.Any.fromFunction1(onSelectStoryId), refId = refId.asInstanceOf[js.Any], selectedStoryId = selectedStoryId.asInstanceOf[js.Any], setHighlightedItemId = js.Any.fromFunction1(setHighlightedItemId))
    __obj.asInstanceOf[HighlightedRef]
  }
  
  @scala.inline
  implicit class HighlightedRefMutableBuilder[Self <: HighlightedRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StoriesHash): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedRef(value: MutableRefObject[ItemRef]): Self = StObject.set(x, "highlightedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectStoryId(value: String => Unit): Self = StObject.set(x, "onSelectStoryId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedStoryId(value: String): Self = StObject.set(x, "selectedStoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHighlightedItemId(value: String => Unit): Self = StObject.set(x, "setHighlightedItemId", js.Any.fromFunction1(value))
  }
}
