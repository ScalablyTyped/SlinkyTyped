package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.radioControlMod.RadioControl.Option
import typingsSlinky.wordpressComponents.radioControlMod.RadioControl.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioControl {
  
  @JSImport("@wordpress/components", "RadioControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
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
    
    @scala.inline
    def optionsVarargs(value: Option[T]*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: js.Array[Option[T]]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: T): this.type = set("selected", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T](onChange: js.UndefOr[T] => Unit): Builder[T] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}
