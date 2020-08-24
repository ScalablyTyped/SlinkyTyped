package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.CursorData
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.VictoryZoomContainerProps
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.disable
import typingsSlinky.victory.victoryStrings.none
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryZoomContainer {
  @JSImport("victory", "VictoryZoomContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryZoomContainer] {
    @scala.inline
    def allowPan(value: Boolean): this.type = set("allowPan", value.asInstanceOf[js.Any])
    @scala.inline
    def allowZoom(value: Boolean): this.type = set("allowZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def brushStyle(value: CSSProperties): this.type = set("brushStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def clipContainerComponent(value: ReactElement): this.type = set("clipContainerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultBrushArea(value: all | none | disable): this.type = set("defaultBrushArea", value.asInstanceOf[js.Any])
    @scala.inline
    def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def downsample(value: Double | Boolean): this.type = set("downsample", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def minimumZoom(value: CursorData): this.type = set("minimumZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def onZoomDomainChange(value: (/* domain */ DomainPropType, VictoryZoomContainerProps) => Unit): this.type = set("onZoomDomainChange", js.Any.fromFunction2(value))
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomDimension(value: x | y): this.type = set("zoomDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def zoomDomain(value: DomainPropType): this.type = set("zoomDomain", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryZoomContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryZoomContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

