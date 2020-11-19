package typingsSlinky.victory.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.anon.XNumber
import typingsSlinky.victory.mod.CallbackArgs
import typingsSlinky.victory.mod.StringOrNumberOrCallback
import typingsSlinky.victory.mod.TextAnchorType
import typingsSlinky.victory.mod.VerticalAnchorType
import typingsSlinky.victory.mod.VictoryLabelProps
import typingsSlinky.victory.victoryStrings.parallel
import typingsSlinky.victory.victoryStrings.perpendicular
import typingsSlinky.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryLabel {
  
  @JSImport("victory", "VictoryLabel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryLabel] {
    
    @scala.inline
    def angle(value: String | Double): this.type = set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def capHeightFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("capHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def capHeight(value: StringOrNumberOrCallback): this.type = set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def children(value: StringOrNumberOrCallback): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datum(value: js.Object): this.type = set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dxFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dx", js.Any.fromFunction1(value))
    
    @scala.inline
    def dx(value: StringOrNumberOrCallback): this.type = set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dyFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("dy", js.Any.fromFunction1(value))
    
    @scala.inline
    def dy(value: StringOrNumberOrCallback): this.type = set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPlacement(value: parallel | perpendicular | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lineHeightFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("lineHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def lineHeight(value: StringOrNumberOrCallback): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def origin(value: XNumber): this.type = set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderInPortal(value: Boolean): this.type = set("renderInPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleVarargs(value: CSSProperties*): this.type = set("style", js.Array(value :_*))
    
    @scala.inline
    def style(value: CSSProperties | js.Array[CSSProperties]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textVarargs(value: String*): this.type = set("text", js.Array(value :_*))
    
    @scala.inline
    def textFunction1(value: /* args */ CallbackArgs => String | Double): this.type = set("text", js.Any.fromFunction1(value))
    
    @scala.inline
    def text(value: js.Array[String] | StringOrNumberOrCallback): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAnchorFunction0(value: () => TextAnchorType): this.type = set("textAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def textAnchor(value: TextAnchorType | js.Function0[TextAnchorType]): this.type = set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transformFunction0(value: () => String | js.Object): this.type = set("transform", js.Any.fromFunction0(value))
    
    @scala.inline
    def transform(value: String | js.Object | (js.Function0[String | js.Object])): this.type = set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAnchorFunction0(value: () => VerticalAnchorType): this.type = set("verticalAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def verticalAnchor(value: VerticalAnchorType | js.Function0[VerticalAnchorType]): this.type = set("verticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryLabelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: VictoryLabel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
