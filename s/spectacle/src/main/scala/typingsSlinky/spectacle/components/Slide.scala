package typingsSlinky.spectacle.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.anon.BackgroundColor
import typingsSlinky.spectacle.anon.CurrentSlide
import typingsSlinky.spectacle.mod.TransitionEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slide {
  @JSImport("spectacle", "Slide")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundImage(value: String): this.type = set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundOpacity(value: Double): this.type = set("backgroundOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundPosition(value: String): this.type = set("backgroundPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundRepeat(value: String): this.type = set("backgroundRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundSize(value: String): this.type = set("backgroundSize", value.asInstanceOf[js.Any])
    @scala.inline
    def scaleRatio(value: Double): this.type = set("scaleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def template(value: /* options */ CurrentSlide => ReactElement): this.type = set("template", js.Any.fromFunction1(value))
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionEffect(value: TransitionEffect): this.type = set("transitionEffect", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BackgroundColor): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

