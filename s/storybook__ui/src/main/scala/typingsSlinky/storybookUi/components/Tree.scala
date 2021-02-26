package typingsSlinky.storybookUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.storybookApi.storiesMod.StoriesHash
import typingsSlinky.storybookUi.anon.Data
import typingsSlinky.storybookUi.sidebarTypesMod.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  @scala.inline
  def apply(
    data: StoriesHash,
    highlightedRef: MutableRefObject[Highlight],
    isBrowsing: Boolean,
    isMain: Boolean,
    onSelectStoryId: String => Unit,
    refId: String,
    setHighlightedItemId: String => Unit
  ): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], highlightedRef = highlightedRef.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], onSelectStoryId = js.Any.fromFunction1(onSelectStoryId), refId = refId.asInstanceOf[js.Any], setHighlightedItemId = js.Any.fromFunction1(setHighlightedItemId))
    new Builder(js.Array(this.component, __props.asInstanceOf[Data]))
  }
  
  @JSImport("@storybook/ui/dist/components/sidebar/Tree", "Tree")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def selectedStoryId(value: String): this.type = set("selectedStoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedStoryIdNull: this.type = set("selectedStoryId", null)
  }
  
  def withProps(p: Data): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
