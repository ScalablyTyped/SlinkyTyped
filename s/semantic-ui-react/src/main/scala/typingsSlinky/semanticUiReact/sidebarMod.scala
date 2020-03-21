package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarComponent
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Namespace)
@js.native
object sidebarMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[SidebarProps, ComponentState, js.Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[SidebarComponent]
  
}

