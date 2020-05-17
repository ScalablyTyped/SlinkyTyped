package typingsSlinky.tinySliderReact.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.tinySliderReact.mod.TinySliderInfo
import typingsSlinky.tinySliderReact.mod.TinySliderProps
import typingsSlinky.tinySliderReact.mod.TinySliderSettings
import typingsSlinky.tinySliderReact.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TinySliderReact {
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onClick(value: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Unit): this.type = set("onClick", js.Any.fromFunction3(value))
    @scala.inline
    def onIndexChanged(value: /* info */ TinySliderInfo => Unit): this.type = set("onIndexChanged", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchEnd(value: /* info */ TinySliderInfo => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchMove(value: /* info */ TinySliderInfo => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
    @scala.inline
    def onTouchStart(value: /* info */ TinySliderInfo => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionEnd(value: /* info */ TinySliderInfo => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onTransitionStart(value: /* info */ TinySliderInfo => Unit): this.type = set("onTransitionStart", js.Any.fromFunction1(value))
    @scala.inline
    def settings(value: TinySliderSettings): this.type = set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TinySliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TinySliderReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

