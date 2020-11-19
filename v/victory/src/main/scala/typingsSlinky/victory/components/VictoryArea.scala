package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.`0`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.anon.`3`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.CategoryPropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DataGetterPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.InterpolationPropType
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.VictoryAreaProps
import typingsSlinky.victory.mod.VictoryStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryArea {
  
  @JSImport("victory", "VictoryArea")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryArea] {
    
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    
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
    def eventsVarargs(value: (EventPropTypeInterface[data | labels | parent, all])*): this.type = set("events", js.Array(value :_*))
    
    @scala.inline
    def events(value: js.Array[EventPropTypeInterface[data | labels | parent, all]]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def interpolation(value: InterpolationPropType): this.type = set("interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFunction1(value: /* data */ js.Any => String): this.type = set("label", js.Any.fromFunction1(value))
    
    @scala.inline
    def label(value: String | (js.Function1[/* data */ js.Any, String])): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelsVarargs(value: (Double | String)*): this.type = set("labels", js.Array(value :_*))
    
    @scala.inline
    def labels(value: (js.Array[Double | String]) | js.Function): this.type = set("labels", value.asInstanceOf[js.Any])
    
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
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def y0Varargs(value: String*): this.type = set("y0", js.Array(value :_*))
    
    @scala.inline
    def y0Function1(value: /* data */ js.Any => Double | String | js.Array[String]): this.type = set("y0", js.Any.fromFunction1(value))
    
    @scala.inline
    def y0(value: DataGetterPropType): this.type = set("y0", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryAreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: VictoryArea.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
