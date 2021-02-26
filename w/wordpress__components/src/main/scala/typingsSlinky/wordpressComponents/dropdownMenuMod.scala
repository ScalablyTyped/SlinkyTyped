package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.Props
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMenuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/dropdown-menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DropdownMenu {
    
    @js.native
    trait BaseProps extends StObject {
      
      /**
        * A class name to apply to the dropdown wrapper element.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * The Dashicon icon slug to be shown in the collapsed menu button.
        * @defaultValue "menu"
        */
      var icon: js.UndefOr[Icon] = js.native
      
      /**
        * A human-readable label to present as accessibility text on the
        * focused collapsed menu button.
        */
      var label: String = js.native
      
      /**
        * A human-readable label to present as accessibility text on the
        * expanded menu container.
        * @defaultValue value of `label`
        */
      var menuLabel: js.UndefOr[String] = js.native
      
      /**
        * The direction in which the menu should open. Specify y- and x-axis
        * as a space-separated string.
        * @defaultValue "top center"
        */
      var position: js.UndefOr[Position] = js.native
    }
    object BaseProps {
      
      @scala.inline
      def apply(label: String): BaseProps = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseProps]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuLabel(value: String): Self = StObject.set(x, "menuLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuLabelUndefined: Self = StObject.set(x, "menuLabel", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      }
    }
    
    @js.native
    trait Control extends StObject {
      
      /**
        * Dashicon icon slug.
        */
      var icon: Icon = js.native
      
      /**
        * Describes whether or not the control is disabled.
        */
      var isDisabled: js.UndefOr[Boolean] = js.native
      
      /**
        * Function to invoke when the option is selected.
        */
      def onClick(): Unit = js.native
      
      /**
        * Human-readable title for the control.
        */
      var title: String = js.native
    }
    object Control {
      
      @scala.inline
      def apply(icon: Icon, onClick: () => Unit, title: String): Control = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Control]
      }
      
      @scala.inline
      implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
        
        @scala.inline
        def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren
      - typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def PropsWithChildren(children: RenderProps => ReactElement, label: String): typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren]
      }
      
      @scala.inline
      def PropsWithControls(controls: js.Array[Control], label: String): typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls = {
        val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls]
      }
    }
    
    @js.native
    trait PropsWithChildren
      extends BaseProps
         with Props {
      
      /**
        * A function render prop which should return an element or elements
        * valid for use in a `DropdownMenu`: `MenuItem`, `MenuItemsChoice`, or
        * `MenuGroup`.
        */
      def children(props: RenderProps): ReactElement = js.native
      
      var controls: js.UndefOr[scala.Nothing] = js.native
    }
    object PropsWithChildren {
      
      @scala.inline
      def apply(children: RenderProps => ReactElement, label: String): PropsWithChildren = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithChildren]
      }
      
      @scala.inline
      implicit class PropsWithChildrenMutableBuilder[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: RenderProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait PropsWithControls
      extends BaseProps
         with Props {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      /**
        * An array of objects describing the options to be shown in the
        * expanded menu.
        */
      var controls: js.Array[Control] = js.native
    }
    object PropsWithControls {
      
      @scala.inline
      def apply(controls: js.Array[Control], label: String): PropsWithControls = {
        val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropsWithControls]
      }
      
      @scala.inline
      implicit class PropsWithControlsMutableBuilder[Self <: PropsWithControls] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value :_*))
      }
    }
  }
}
