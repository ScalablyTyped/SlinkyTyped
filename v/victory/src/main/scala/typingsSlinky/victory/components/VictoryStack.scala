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
import typingsSlinky.victory.mod.ColorScalePropType
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.DomainPaddingPropType
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.EventPropTypeInterface
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.VictoryStackProps
import typingsSlinky.victory.mod.VictoryStyleInterface
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.data
import typingsSlinky.victory.victoryStrings.labels
import typingsSlinky.victory.victoryStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryStack {
  
  @JSImport("victory", "VictoryStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryStack] {
    
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def categories(value: CategoryPropType): this.type = set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def categoriesVarargs(value: String*): this.type = set("categories", js.Array(value :_*))
    
    @scala.inline
    def colorScale(value: ColorScalePropType): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorScaleVarargs(value: String*): this.type = set("colorScale", js.Array(value :_*))
    
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domain(value: DomainPropType): this.type = set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def domainPadding(value: DomainPaddingPropType): this.type = set("domainPadding", value.asInstanceOf[js.Any])
    
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
    def maxDomain(value: Double | `0`): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDomain(value: Double | `0`): this.type = set("minDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    
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
    def xOffset(value: Double): this.type = set("xOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryStack.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
