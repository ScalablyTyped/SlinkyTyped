package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typingsSlinky.semanticUiReact.menuItemMod.MenuItemProps
import typingsSlinky.semanticUiReact.menuMenuMod.MenuComponent
import typingsSlinky.semanticUiReact.menuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MenuProps, js.Object, js.Any] {
    def this(props: MenuProps) = this()
    def this(props: MenuProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu", JSImport.Default)
    @js.native
    val ^ : MenuComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu", "default.Header")
    @js.native
    class Header protected ()
      extends Component[MenuHeaderProps, js.Object, js.Any] {
      def this(props: MenuHeaderProps) = this()
      def this(props: MenuHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/collections/Menu", "default.Item")
    @js.native
    class Item protected ()
      extends Component[MenuItemProps, js.Object, js.Any] {
      def this(props: MenuItemProps) = this()
      def this(props: MenuItemProps, context: js.Any) = this()
    }
    
    type _To = MenuComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MenuComponent = ^
  }
}
