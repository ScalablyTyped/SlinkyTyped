package typingsSlinky.storybookReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookReactNative.storyViewMod.Props
import typingsSlinky.storybookReactNative.storyViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StoryView {
  
  @scala.inline
  def apply(stories: js.Any, url: String): Builder = {
    val __props = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def onDevice(value: Boolean): this.type = set("onDevice", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
