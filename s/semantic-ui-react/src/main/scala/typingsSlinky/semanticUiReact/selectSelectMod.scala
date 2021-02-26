package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typingsSlinky.semanticUiReact.dropdownDropdownMod.StrictDropdownProps
import typingsSlinky.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", JSImport.Default)
    @js.native
    val ^ : SelectComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Divider")
    @js.native
    class Divider protected ()
      extends Component[DropdownDividerProps, js.Object, js.Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Header")
    @js.native
    class Header protected ()
      extends Component[DropdownHeaderProps, js.Object, js.Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Item")
    @js.native
    class Item protected ()
      extends Component[DropdownItemProps, js.Object, js.Any] {
      def this(props: DropdownItemProps) = this()
      def this(props: DropdownItemProps, context: js.Any) = this()
    }
    
    type _To = SelectComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SelectComponent = ^
  }
  
  @js.native
  trait SelectComponent extends FunctionComponent[SelectProps] {
    
    var Divider: ReactComponentClass[DropdownDividerProps] = js.native
    
    var Header: ReactComponentClass[DropdownHeaderProps] = js.native
    
    var Item: ReactComponentClass[DropdownItemProps] = js.native
    
    var Menu: ReactComponentClass[DropdownMenuProps] = js.native
  }
  
  @js.native
  trait SelectProps
    extends StrictSelectProps
       with /* key */ StringDictionary[js.Any]
  object SelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
  }
  
  @js.native
  trait StrictSelectProps extends StrictDropdownProps {
    
    /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
    @JSName("options")
    var options_StrictSelectProps: js.Array[DropdownItemProps] = js.native
  }
  object StrictSelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): StrictSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSelectProps]
    }
    
    @scala.inline
    implicit class StrictSelectPropsMutableBuilder[Self <: StrictSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[DropdownItemProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: DropdownItemProps*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
}
