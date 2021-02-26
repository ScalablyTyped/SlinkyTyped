package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.storybookReactNative.storyListViewMod.Props
import typingsSlinky.storybookReactNative.storyListViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StoryListView {
  
  @scala.inline
  def apply(stories: js.Any): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryListView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
