package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.Control
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownMenu {
  
  object PropsWithChildren {
    
    @scala.inline
    def apply(children: RenderProps => ReactElement, label: String): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren]))
    }
    
    @JSImport("@wordpress/components", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def icon(value: typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PropsWithControls {
    
    @scala.inline
    def apply(controls: js.Array[Control], label: String): Builder = {
      val __props = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls]))
    }
    
    @JSImport("@wordpress/components", "DropdownMenu")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def icon(value: typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon): this.type = set("icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def menuLabel(value: String): this.type = set("menuLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.dropdownMenuMod.DropdownMenu.PropsWithControls): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
