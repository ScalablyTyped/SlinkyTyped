package typingsSlinky.tuyaPanelKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebView {
  
  @JSImport("tuya-panel-kit", "WebView")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: WebView.type): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView] = new Default[tag.type, typingsSlinky.tuyaPanelKit.mod.WebView](js.Array(this.component, p.asInstanceOf[js.Any]))
}
