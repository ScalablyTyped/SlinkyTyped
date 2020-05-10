package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.Anon1
import typingsSlinky.victory.AnonLeft
import typingsSlinky.victory.AnonName
import typingsSlinky.victory.AnonXBoolean
import typingsSlinky.victory.AnonY
import typingsSlinky.victory.OmitBlockPropsleftright
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.CategoryPropType
import typingsSlinky.victory.mod.ColorScalePropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.OrientationTypes
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryLegendProps
import typingsSlinky.victory.mod.VictoryStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.horizontal
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryLegend {
  @JSImport("victory", "VictoryLegend")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryLegend] {
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def borderComponent(value: ReactElement): this.type = set("borderComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def borderPadding(value: PaddingProps): this.type = set("borderPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def categories(value: CategoryPropType): this.type = set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def centerTitle(value: Boolean): this.type = set("centerTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def colorScale(value: ColorScalePropType): this.type = set("colorScale", value.asInstanceOf[js.Any])
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def data(value: js.Array[AnonName]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def dataComponent(value: ReactElement): this.type = set("dataComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKeyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("eventKey", js.Any.fromFunction1(value))
    @scala.inline
    def eventKey(value: StringOrNumberOrCallback | js.Array[String]): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def externalEventMutations(value: js.Array[_]): this.type = set("externalEventMutations", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def gutter(value: Double | AnonLeft): this.type = set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsPerRow(value: Double): this.type = set("itemsPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def labelFunction1(value: /* data */ js.Any => String): this.type = set("label", js.Any.fromFunction1(value))
    @scala.inline
    def label(value: String | (js.Function1[/* data */ js.Any, String])): this.type = set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDomain(value: Double | AnonY): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def minDomain(value: Double | AnonY): this.type = set("minDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def rowGutter(value: Double | OmitBlockPropsleftright): this.type = set("rowGutter", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: ScalePropType | D3Scale | Anon1): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | AnonXBoolean): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: VictoryStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def symbolSpacer(value: Double): this.type = set("symbolSpacer", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | js.Array[String]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleComponent(value: ReactElement): this.type = set("titleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def titleOrientation(value: OrientationTypes): this.type = set("titleOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def y0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y0", js.Any.fromFunction1(value))
    @scala.inline
    def y0(value: DataGetterPropType): this.type = set("y0", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryLegend.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

