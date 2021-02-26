package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.VictoryVoronoiContainerProps
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryVoronoiContainer {
  
  @JSImport("victory", "VictoryVoronoiContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryVoronoiContainer] {
    
    @scala.inline
    def activateData(value: Boolean): this.type = set("activateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activateLabels(value: Boolean): this.type = set("activateLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelComponent(value: ReactElement): this.type = set("labelComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labels(value: (/* point */ js.Any, /* index */ Double, /* points */ js.Array[_]) => String): this.type = set("labels", js.Any.fromFunction3(value))
    
    @scala.inline
    def onActivated(value: (/* points */ js.Array[_], VictoryVoronoiContainerProps) => Unit): this.type = set("onActivated", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDeactivated(value: (/* points */ js.Array[_], VictoryVoronoiContainerProps) => Unit): this.type = set("onDeactivated", js.Any.fromFunction2(value))
    
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def voronoiBlacklist(value: js.Array[String]): this.type = set("voronoiBlacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def voronoiBlacklistVarargs(value: String*): this.type = set("voronoiBlacklist", js.Array(value :_*))
    
    @scala.inline
    def voronoiDimension(value: x | y): this.type = set("voronoiDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def voronoiPadding(value: Double): this.type = set("voronoiPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryVoronoiContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryVoronoiContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
