package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.`0`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.anon.`3`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.CategoryPropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.ScatterSymbolType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryScatterProps
import typingsSlinky.victory.mod.VictoryStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryScatter {
  
  @JSImport("victory", "VictoryScatter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryScatter] {
    
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bubbleProperty(value: String): this.type = set("bubbleProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def categories(value: CategoryPropType): this.type = set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def categoriesVarargs(value: String*): this.type = set("categories", js.Array(value :_*))
    
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataComponent(value: ReactElement): this.type = set("dataComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventKey(value: StringOrNumberOrCallback): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventKeyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def events(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): this.type = set("events", js.Array(value :_*))
    
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labels(value: js.Array[String] | (js.Function1[/* data */ js.Any, String])): this.type = set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelsFunction1(value: /* data */ js.Any => String): this.type = set("labels", js.Any.fromFunction1(value))
    
    @scala.inline
    def labelsVarargs(value: String*): this.type = set("labels", js.Array(value :_*))
    
    @scala.inline
    def maxBubbleSize(value: Double): this.type = set("maxBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDomain(value: Double | `0`): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDomain(value: Double | `0`): this.type = set("minDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def samples(value: Double): this.type = set("samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `2`): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | `3`): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: Double | (js.Function1[/* data */ js.Any, Double])): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sizeFunction1(value: /* data */ js.Any => Double): this.type = set("size", js.Any.fromFunction1(value))
    
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: VictoryStyleInterface): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def symbol(value: ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])): this.type = set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def symbolFunction1(value: /* data */ js.Any => ScatterSymbolType): this.type = set("symbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: DataGetterPropType): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def xFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("x", js.Any.fromFunction1(value))
    
    @scala.inline
    def xVarargs(value: String*): this.type = set("x", js.Array(value :_*))
    
    @scala.inline
    def y(value: DataGetterPropType): this.type = set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y0(value: DataGetterPropType): this.type = set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y0", js.Any.fromFunction1(value))
    
    @scala.inline
    def y0Varargs(value: String*): this.type = set("y0", js.Array(value :_*))
    
    @scala.inline
    def yFunction1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y", js.Any.fromFunction1(value))
    
    @scala.inline
    def yVarargs(value: String*): this.type = set("y", js.Array(value :_*))
  }
  
  implicit def make(companion: VictoryScatter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryScatterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
