package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.spectacle.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpectacleLogo {
  
  @scala.inline
  def apply(size: Double): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Size]))
  }
  
  @JSImport("spectacle", "SpectacleLogo")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Size): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
