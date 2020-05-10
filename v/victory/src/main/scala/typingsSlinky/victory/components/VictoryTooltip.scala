package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.NumberOrCallback
import typingsSlinky.victory.mod.OrientationTypes
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryNumberCallback
import typingsSlinky.victory.mod.VictoryStyleObject
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.mod.VictoryTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryTooltip {
  @JSImport("victory", "VictoryTooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryTooltip] {
    @scala.inline
    def activateData(value: Boolean): this.type = set("activateData", value.asInstanceOf[js.Any])
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def angle(value: String | Double): this.type = set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def cornerRadiusFunction1(value: /* args */ CallbackArgs => Double): this.type = set("cornerRadius", js.Any.fromFunction1(value))
    @scala.inline
    def cornerRadius(value: NumberOrCallback): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def datum(value: js.Object): this.type = set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def dxFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dx", js.Any.fromFunction1(value))
    @scala.inline
    def dx(value: StringOrNumberOrCallback): this.type = set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def dyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dy", js.Any.fromFunction1(value))
    @scala.inline
    def dy(value: StringOrNumberOrCallback): this.type = set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def flyoutComponent(value: ReactElement): this.type = set("flyoutComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def flyoutHeightFunction1(value: /* args */ CallbackArgs => Double): this.type = set("flyoutHeight", js.Any.fromFunction1(value))
    @scala.inline
    def flyoutHeight(value: NumberOrCallback): this.type = set("flyoutHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def flyoutStyle(value: VictoryStyleObject): this.type = set("flyoutStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def flyoutWidthFunction1(value: /* args */ CallbackArgs => Double): this.type = set("flyoutWidth", js.Any.fromFunction1(value))
    @scala.inline
    def flyoutWidth(value: NumberOrCallback): this.type = set("flyoutWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double | String): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def orientationFunction1(value: /* args */ CallbackArgs => Double): this.type = set("orientation", js.Any.fromFunction1(value))
    @scala.inline
    def orientation(value: OrientationTypes | VictoryNumberCallback): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerLengthFunction1(value: /* args */ CallbackArgs => Double): this.type = set("pointerLength", js.Any.fromFunction1(value))
    @scala.inline
    def pointerLength(value: NumberOrCallback): this.type = set("pointerLength", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerWidthFunction1(value: /* args */ CallbackArgs => Double): this.type = set("pointerWidth", js.Any.fromFunction1(value))
    @scala.inline
    def pointerWidth(value: NumberOrCallback): this.type = set("pointerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def renderInPortal(value: Boolean): this.type = set("renderInPortal", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def textFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("text", js.Any.fromFunction1(value))
    @scala.inline
    def text(value: StringOrNumberOrCallback | (js.Array[Double | String])): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

