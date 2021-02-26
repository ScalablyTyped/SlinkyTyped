package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.iframeMod.IFrameProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IFrame {
  
  @scala.inline
  def apply(allowFullScreen: Boolean, id: String, scale: Double, src: String, title: String): Builder = {
    val __props = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IFrameProps]))
  }
  
  @JSImport("@storybook/components", "IFrame")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookComponents.mod.IFrame] {
    
    @scala.inline
    def style(value: js.Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IFrameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
