package typingsSlinky.storybookComponents.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  @JSImport("@storybook/components/dist/tooltip/ListItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def LinkWrapper(value: ReactComponentClass[js.Object]): this.type = set("LinkWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centerReactElement(value: ReactElement): this.type = set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def center(value: ReactElement): this.type = set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def href(value: String | js.Object): this.type = set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftReactElement(value: ReactElement): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: ReactElement): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def rightReactElement(value: ReactElement): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def right(value: ReactElement): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
