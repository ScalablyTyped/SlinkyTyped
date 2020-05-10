package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.DeckProps
import typingsSlinky.spectacle.mod.Theme
import typingsSlinky.spectacle.mod.progressType
import typingsSlinky.spectacle.mod.transitionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Deck {
  @JSImport("spectacle", "Deck")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.spectacle.mod.Deck] {
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayDuration(value: Double): this.type = set("autoplayDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayLoop(value: Boolean): this.type = set("autoplayLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def autoplayOnStart(value: Boolean): this.type = set("autoplayOnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def contentHeight(value: String): this.type = set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def contentWidth(value: String): this.type = set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def disableKeyboardControls(value: Boolean): this.type = set("disableKeyboardControls", value.asInstanceOf[js.Any])
    @scala.inline
    def disableTouchControls(value: Boolean): this.type = set("disableTouchControls", value.asInstanceOf[js.Any])
    @scala.inline
    def globalStyles(value: Boolean): this.type = set("globalStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def history(value: js.Any): this.type = set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def onStateChange(value: (/* previousState */ js.UndefOr[String], /* nextState */ js.UndefOr[String]) => Unit): this.type = set("onStateChange", js.Any.fromFunction2(value))
    @scala.inline
    def progress(value: progressType): this.type = set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def showFullscreenControl(value: Boolean): this.type = set("showFullscreenControl", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def transition(value: js.Array[transitionType]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DeckProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Deck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

