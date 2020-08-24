package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.Y
import typingsSlinky.victory.anon.`1`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.ColorScalePropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryPieProps
import typingsSlinky.victory.mod.VictorySliceProps
import typingsSlinky.victory.mod.VictoryStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryPie {
  @JSImport("victory", "VictoryPie")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryPie] {
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def colorScaleVarargs(value: String*): this.type = set("colorScale", js.Array(value :_*))
    @scala.inline
    def colorScale(value: ColorScalePropType): this.type = set("colorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def dataComponent(value: ReactElement): this.type = set("dataComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKeyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("eventKey", js.Any.fromFunction1(value))
    @scala.inline
    def eventKey(value: StringOrNumberOrCallback): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def eventsVarargs(
      value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback | (js.Array[Double | String])])*
    ): this.type = set("events", js.Array(value :_*))
    @scala.inline
    def events(
      value: js.Array[
          EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback | (js.Array[Double | String])]
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRadiusFunction1(value: /* props */ VictorySliceProps => Double): this.type = set("innerRadius", js.Any.fromFunction1(value))
    @scala.inline
    def innerRadius(value: Double | (js.Function1[/* props */ VictorySliceProps, Double])): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def labelRadius(value: Double): this.type = set("labelRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def labelsVarargs(value: String*): this.type = set("labels", js.Array(value :_*))
    @scala.inline
    def labelsFunction1(value: /* data */ js.Any => String): this.type = set("labels", js.Any.fromFunction1(value))
    @scala.inline
    def labels(value: js.Array[String] | (js.Function1[/* data */ js.Any, String])): this.type = set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDomain(value: Double | Y): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def minDomain(value: Double | Y): this.type = set("minDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `1`): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | `2`): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: VictoryStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def xVarargs(value: String*): this.type = set("x", js.Array(value :_*))
    @scala.inline
    def xFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("x", js.Any.fromFunction1(value))
    @scala.inline
    def x(value: DataGetterPropType): this.type = set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def yVarargs(value: String*): this.type = set("y", js.Array(value :_*))
    @scala.inline
    def yFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y", js.Any.fromFunction1(value))
    @scala.inline
    def y(value: DataGetterPropType): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryPieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryPie.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

