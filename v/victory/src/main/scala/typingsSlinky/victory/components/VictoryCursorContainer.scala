package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.CursorData
import typingsSlinky.victory.mod.VictoryCursorContainerProps
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryCursorContainer {
  @JSImport("victory", "VictoryCursorContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryCursorContainer] {
    @scala.inline
    def cursorComponent(value: ReactElement): this.type = set("cursorComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorDimension(value: x | y): this.type = set("cursorDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorLabel(value: /* point */ CursorData => Unit): this.type = set("cursorLabel", js.Any.fromFunction1(value))
    @scala.inline
    def cursorLabelComponent(value: ReactElement): this.type = set("cursorLabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def cursorLabelOffset(value: Double | CursorData): this.type = set("cursorLabelOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCursorValue(value: Double | CursorData): this.type = set("defaultCursorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def onCursorChange(value: (/* value */ CursorData, /* props */ VictoryCursorContainerProps) => Unit): this.type = set("onCursorChange", js.Any.fromFunction2(value))
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryCursorContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryCursorContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

