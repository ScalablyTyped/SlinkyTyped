package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.spectacle.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FullScreen {
  
  @scala.inline
  def apply(color: String, size: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Color]))
  }
  
  @JSImport("spectacle", "FullScreen")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Color): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
