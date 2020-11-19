package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.victory.anon.`0`
import typingsSlinky.victory.anon.`2`
import typingsSlinky.victory.anon.`3`
import typingsSlinky.victory.mod.AnimatePropTypeInterface
import typingsSlinky.victory.mod.D3Scale
import typingsSlinky.victory.mod.FlyoutProps
import typingsSlinky.victory.mod.PaddingProps
import typingsSlinky.victory.mod.ScalePropType
import typingsSlinky.victory.mod.VictoryStyleObject
import typingsSlinky.victory.mod.VictoryThemeDefinition
import typingsSlinky.victory.victoryStrings.bottom
import typingsSlinky.victory.victoryStrings.left
import typingsSlinky.victory.victoryStrings.right
import typingsSlinky.victory.victoryStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flyout {
  
  @JSImport("victory", "Flyout")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.Flyout] {
    
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def animate(value: Boolean | AnimatePropTypeInterface): this.type = set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def center(value: `0`): this.type = set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerComponent(value: ReactElement): this.type = set("containerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datum(value: js.Object): this.type = set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dx(value: Double): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dy(value: Double): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: js.Object): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDomain(value: Double | `0`): this.type = set("maxDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDomain(value: Double | `0`): this.type = set("minDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def orientation(value: top | bottom | left | right): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def origin(value: js.Object): this.type = set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padding(value: PaddingProps): this.type = set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pathComponent(value: ReactElement): this.type = set("pathComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerLength(value: Double): this.type = set("pointerLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pointerWidth(value: Double): this.type = set("pointerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scale(value: ScalePropType | D3Scale | `2`): this.type = set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shapeRendering(value: String): this.type = set("shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def singleQuadrantDomainPadding(value: Boolean | `3`): this.type = set("singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def standalone(value: Boolean): this.type = set("standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: VictoryStyleObject): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transform(value: String): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FlyoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Flyout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
