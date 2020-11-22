package typingsSlinky.storybookComponents.components

import org.scalajs.dom.raw.HTMLIFrameElement
import slinky.web.html.iframe.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.storybookComponents.zoomIFrameMod.IZoomIFrameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomIFrame {
  
  @JSImport("@storybook/components/dist/Zoom/ZoomIFrame", "ZoomIFrame")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.storybookComponents.zoomIFrameMod.ZoomIFrame] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IZoomIFrameProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(iFrameRef: MutableRefObject[HTMLIFrameElement], scale: Double): Builder = {
    val __props = js.Dynamic.literal(iFrameRef = iFrameRef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IZoomIFrameProps]))
  }
}
