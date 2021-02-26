package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.mod.DomainPropType
import typingsSlinky.victory.mod.VictoryBrushContainerProps
import typingsSlinky.victory.victoryStrings.all
import typingsSlinky.victory.victoryStrings.disable
import typingsSlinky.victory.victoryStrings.none
import typingsSlinky.victory.victoryStrings.x
import typingsSlinky.victory.victoryStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryBrushContainer {
  
  @JSImport("victory", "VictoryBrushContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryBrushContainer] {
    
    @scala.inline
    def allowDrag(value: Boolean): this.type = set("allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowResize(value: Boolean): this.type = set("allowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushComponent(value: ReactElement): this.type = set("brushComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushDimension(value: x | y): this.type = set("brushDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushDomain(value: DomainPropType): this.type = set("brushDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def brushStyle(value: CSSProperties): this.type = set("brushStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultBrushArea(value: all | none | disable): this.type = set("defaultBrushArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleComponent(value: ReactElement): this.type = set("handleComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def handleStyle(value: CSSProperties): this.type = set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBrushDomainChange(value: (/* domain */ DomainPropType, VictoryBrushContainerProps) => Unit): this.type = set("onBrushDomainChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryBrushContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryBrushContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
