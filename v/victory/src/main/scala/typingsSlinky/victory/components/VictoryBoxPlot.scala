package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.Y
import typingsSlinky.victory.anon.`1`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.CategoryPropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.DomainPaddingPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryBoxPlotProps
import typingsSlinky.victory.mod.VictoryBoxPlotStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryBoxPlot {
  @JSImport("victory", "VictoryBoxPlot")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBoxPlot] {
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def boxWidth(value: Double): this.type = set("boxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def categoriesVarargs(value: String*): this.type = set("categories", js.Array(value :_*))
    @scala.inline
    def categories(value: CategoryPropType): this.type = set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def dataComponent(value: ReactElement): this.type = set("dataComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def domainPadding(value: DomainPaddingPropType): this.type = set("domainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKeyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("eventKey", js.Any.fromFunction1(value))
    @scala.inline
    def eventKey(value: StringOrNumberOrCallback): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def eventsVarargs(value: (EventPropTypeInterface[String, StringOrNumberOrCallback])*): this.type = set("events", js.Array(value :_*))
    @scala.inline
    def events(value: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def labelOrientation(value: top | bottom | left | right): this.type = set("labelOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def labels(value: Boolean): this.type = set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def maxVarargs(value: String*): this.type = set("max", js.Array(value :_*))
    @scala.inline
    def maxFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("max", js.Any.fromFunction1(value))
    @scala.inline
    def max(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def maxComponent(value: ReactElement): this.type = set("maxComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDomain(value: Double | Y): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLabelComponent(value: ReactElement): this.type = set("maxLabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def medianVarargs(value: String*): this.type = set("median", js.Array(value :_*))
    @scala.inline
    def medianFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("median", js.Any.fromFunction1(value))
    @scala.inline
    def median(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("median", value.asInstanceOf[js.Any])
    @scala.inline
    def medianComponent(value: ReactElement): this.type = set("medianComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def medianLabelComponent(value: ReactElement): this.type = set("medianLabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def minVarargs(value: String*): this.type = set("min", js.Array(value :_*))
    @scala.inline
    def minFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("min", js.Any.fromFunction1(value))
    @scala.inline
    def min(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def minComponent(value: ReactElement): this.type = set("minComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def minDomain(value: Double | Y): this.type = set("minDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def minLabelComponent(value: ReactElement): this.type = set("minLabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def q1Varargs(value: String*): this.type = set("q1", js.Array(value :_*))
    @scala.inline
    def q1Function1(value: /* args */ CallbackArgs => String | Double): this.type = set("q1", js.Any.fromFunction1(value))
    @scala.inline
    def q1(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("q1", value.asInstanceOf[js.Any])
    @scala.inline
    def q1Component(value: ReactElement): this.type = set("q1Component", value.asInstanceOf[js.Any])
    @scala.inline
    def q1LabelComponent(value: ReactElement): this.type = set("q1LabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def q3Varargs(value: String*): this.type = set("q3", js.Array(value :_*))
    @scala.inline
    def q3Function1(value: /* args */ CallbackArgs => String | Double): this.type = set("q3", js.Any.fromFunction1(value))
    @scala.inline
    def q3(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("q3", value.asInstanceOf[js.Any])
    @scala.inline
    def q3Component(value: ReactElement): this.type = set("q3Component", value.asInstanceOf[js.Any])
    @scala.inline
    def q3LabelComponent(value: ReactElement): this.type = set("q3LabelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `1`): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | `2`): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: VictoryBoxPlotStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def whiskerWidth(value: Double): this.type = set("whiskerWidth", value.asInstanceOf[js.Any])
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
    @scala.inline
    def y0Varargs(value: String*): this.type = set("y0", js.Array(value :_*))
    @scala.inline
    def y0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y0", js.Any.fromFunction1(value))
    @scala.inline
    def y0(value: DataGetterPropType): this.type = set("y0", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryBoxPlotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryBoxPlot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

