package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarPushable {
  
  @JSImport("semantic-ui-react", "SidebarPushable")
  @js.native
  object component extends js.Object
  
  def withProps(p: SidebarPushableProps): SharedBuilder_SidebarPushableProps_269623663 = new SharedBuilder_SidebarPushableProps_269623663(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SidebarPushable.type): SharedBuilder_SidebarPushableProps_269623663 = new SharedBuilder_SidebarPushableProps_269623663(js.Array(this.component, js.Dictionary.empty))()
}
