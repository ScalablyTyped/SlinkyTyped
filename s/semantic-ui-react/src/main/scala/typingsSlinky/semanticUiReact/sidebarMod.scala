package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarComponent
import typingsSlinky.semanticUiReact.sidebarSidebarMod.SidebarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SidebarProps, js.Object, js.Any] {
    def this(props: SidebarProps) = this()
    def this(props: SidebarProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sidebar", JSImport.Default)
  @js.native
  val default: SidebarComponent = js.native
  
  type _To = SidebarComponent
  
  /* This means you don't have to write `default`, but can instead just say `sidebarMod.foo` */
  override def _to: SidebarComponent = default
}
