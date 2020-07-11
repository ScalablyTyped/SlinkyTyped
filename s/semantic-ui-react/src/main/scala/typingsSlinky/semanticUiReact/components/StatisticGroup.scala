package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticProps
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticSizeProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatisticGroup {
  @JSImport("semantic-ui-react/dist/commonjs/views/Statistic/StatisticGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def itemsVarargs(value: SemanticShorthandItem[StatisticProps]*): this.type = set("items", js.Array(value :_*))
    @scala.inline
    def items(value: SemanticShorthandCollection[StatisticProps]): this.type = set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: StatisticSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def widths(value: SemanticWIDTHS): this.type = set("widths", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatisticGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StatisticGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

