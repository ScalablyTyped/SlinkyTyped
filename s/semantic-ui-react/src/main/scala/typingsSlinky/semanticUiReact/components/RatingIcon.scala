package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.ratingIconMod.RatingIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RatingIcon {
  
  @JSImport("semantic-ui-react", "RatingIcon")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.RatingIcon] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onKeyUp(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onKeyUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RatingIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RatingIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
