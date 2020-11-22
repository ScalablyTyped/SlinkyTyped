package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebView {
  
  @JSImport("tuya-panel-kit", "WebView")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: WebView.type): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView](js.Array(this.component, js.Dictionary.empty))()
}
