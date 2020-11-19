package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.focalPointPickerMod.FocalPointPicker.FocalPoint
import typingsSlinky.wordpressComponents.focalPointPickerMod.FocalPointPicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocalPointPicker {
  
  @JSImport("@wordpress/components", "FocalPointPicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
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
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: FocalPoint => Unit, url: String, value: FocalPoint): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
