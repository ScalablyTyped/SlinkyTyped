package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.toggleControlMod.ToggleControl.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleControl {
  
  @JSImport("@wordpress/components", "ToggleControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helpReactElement(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* isChecked */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ToggleControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
