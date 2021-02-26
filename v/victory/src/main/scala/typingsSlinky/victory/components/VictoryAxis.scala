package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.AxisLabel
import typingsSlinky.victory.anon.`0`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.anon.`3`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.VictoryAxisProps
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.axis
import typingsSlinky.victory.victoryStrings.axisLabel
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.grid
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.parent
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.tickLabels
import typingsSlinky.victory.victoryStrings.ticks
import typingsSlinky.victory.victoryStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryAxis {
  
  @JSImport("victory", "VictoryAxis")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryAxis] {
    
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisComponent(value: ReactElement): this.type = set("axisComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisLabelComponent(value: ReactElement): this.type = set("axisLabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def axisValue(value: Double | String | js.Object): this.type = set("axisValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def crossAxis(value: Boolean): this.type = set("crossAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dependentAxis(value: Boolean): this.type = set("dependentAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(
      value: js.Array[
          EventPropTypeInterface[axis | axisLabel | grid | ticks | tickLabels | parent, Double | String]
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsVarargs(
      value: (EventPropTypeInterface[axis | axisLabel | grid | ticks | tickLabels | parent, Double | String])*
    ): this.type = set("events", js.Array(value :_*))
    
    @scala.inline
    def fixLabelOverlap(value: Boolean): this.type = set("fixLabelOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gridComponent(value: ReactElement): this.type = set("gridComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invertAxis(value: Boolean): this.type = set("invertAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: js.Any): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDomain(value: Double | `0`): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDomain(value: Double | `0`): this.type = set("minDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: top | bottom | left | right): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `2`): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | `3`): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: AxisLabel): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickComponent(value: ReactElement): this.type = set("tickComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickCount(value: Double): this.type = set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickFormat(
      value: js.Array[_] | (js.Function3[/* tick */ js.Any, /* index */ Double, /* ticks */ js.Array[_], String | Double])
    ): this.type = set("tickFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickFormatFunction3(value: (/* tick */ js.Any, /* index */ Double, /* ticks */ js.Array[_]) => String | Double): this.type = set("tickFormat", js.Any.fromFunction3(value))
    
    @scala.inline
    def tickFormatVarargs(value: js.Any*): this.type = set("tickFormat", js.Array(value :_*))
    
    @scala.inline
    def tickLabelComponent(value: ReactElement): this.type = set("tickLabelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValues(value: js.Array[_]): this.type = set("tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tickValuesVarargs(value: js.Any*): this.type = set("tickValues", js.Array(value :_*))
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryAxis.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryAxisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
