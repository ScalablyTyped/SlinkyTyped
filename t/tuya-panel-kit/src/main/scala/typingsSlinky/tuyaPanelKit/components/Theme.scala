package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.tuyaPanelKit.mod.ThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Theme {
  
  @JSImport("tuya-panel-kit", "Theme")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThemeProps): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.Theme] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.Theme](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Theme.type): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.Theme] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.Theme](js.Array(this.component, js.Dictionary.empty))()
}
