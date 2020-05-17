package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.PickVictoryStyleInterface
import typingsSlinky.victory.anon.XBoolean
import typingsSlinky.victory.anon.Y
import typingsSlinky.victory.anon.`1`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DomainPaddingPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryChartProps
import typingsSlinky.victory.mod.VictoryThemeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryChart {
  @JSImport("victory", "VictoryChart")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryChart] {
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def domainPadding(value: DomainPaddingPropType): this.type = set("domainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def eventKeyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("eventKey", js.Any.fromFunction1(value))
    @scala.inline
    def eventKey(value: StringOrNumberOrCallback): this.type = set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: js.Array[EventPropTypeInterface[String, StringOrNumberOrCallback]]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDomain(value: Double | Y): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def minDomain(value: Double | Y): this.type = set("minDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `1`): this.type = set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | XBoolean): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: PickVictoryStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryChartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryChart.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

