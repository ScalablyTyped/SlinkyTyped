package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.Props
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.wordpressComponentsBooleans.`false`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.container
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.firstElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("@wordpress/components", "Dropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandOnMobile(value: Boolean): this.type = set("expandOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusOnMount(value: firstElement | container | `false`): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerTitleReactElement(value: ReactElement): this.type = set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerTitle(value: ReactElement): this.type = set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(renderContent: RenderProps => ReactElement, renderToggle: RenderProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(renderContent = js.Any.fromFunction1(renderContent), renderToggle = js.Any.fromFunction1(renderToggle))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
