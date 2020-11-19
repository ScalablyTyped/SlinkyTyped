package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarPusher {
  
  @JSImport("semantic-ui-react", "SidebarPusher")
  @js.native
  object component extends js.Object
  
  def withProps(p: SidebarPusherProps): SharedBuilder_SidebarPusherProps_1793364942 = new SharedBuilder_SidebarPusherProps_1793364942(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SidebarPusher.type): SharedBuilder_SidebarPusherProps_1793364942 = new SharedBuilder_SidebarPusherProps_1793364942(js.Array(this.component, js.Dictionary.empty))()
}
