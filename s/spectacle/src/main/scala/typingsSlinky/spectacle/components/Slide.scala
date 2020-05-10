package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.CSSProperties
import typingsSlinky.spectacle.mod.SlideProps
import typingsSlinky.spectacle.mod.alignType
import typingsSlinky.spectacle.mod.transitionType
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
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Slide] {
    @scala.inline
    def align(value: alignType): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def bgColor(value: String): this.type = set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def bgDarken(value: Double): this.type = set("bgDarken", value.asInstanceOf[js.Any])
    @scala.inline
    def bgImage(value: String): this.type = set("bgImage", value.asInstanceOf[js.Any])
    @scala.inline
    def bold(value: Boolean): this.type = set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def caps(value: Boolean): this.type = set("caps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyles(value: CSSProperties): this.type = set("contentStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def controlColor(value: String): this.type = set("controlColor", value.asInstanceOf[js.Any])
    @scala.inline
    def dispatch(value: () => Unit): this.type = set("dispatch", js.Any.fromFunction0(value))
    @scala.inline
    def hash(value: Double | String): this.type = set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def history(value: js.Any): this.type = set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def lastSlideIndex(value: Double): this.type = set("lastSlideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Double | String): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def notes(value: String): this.type = set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def onActive(value: /* slideIndex */ String | Double => Unit): this.type = set("onActive", js.Any.fromFunction1(value))
    @scala.inline
    def padding(value: Double | String): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def progressColor(value: String): this.type = set("progressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def slideIndex(value: Double): this.type = set("slideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def state(value: String): this.type = set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: String): this.type = set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def textFont(value: String): this.type = set("textFont", value.asInstanceOf[js.Any])
    @scala.inline
    def textSize(value: String): this.type = set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def transition(value: js.Array[transitionType]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionIn(value: js.Array[transitionType]): this.type = set("transitionIn", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionOut(value: js.Array[transitionType]): this.type = set("transitionOut", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

