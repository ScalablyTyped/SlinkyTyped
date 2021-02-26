package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.statisticGroupMod.StatisticGroupProps
import typingsSlinky.semanticUiReact.statisticLabelMod.StatisticLabelProps
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticProps
import typingsSlinky.semanticUiReact.statisticStatisticMod.StatisticSizeProp
import typingsSlinky.semanticUiReact.statisticValueMod.StatisticValueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Statistic {
  
  object Group {
    
    @JSImport("semantic-ui-react", "Statistic.Group")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Group.type): SharedBuilder_StatisticGroupProps_674403293 = new SharedBuilder_StatisticGroupProps_674403293(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticGroupProps): SharedBuilder_StatisticGroupProps_674403293 = new SharedBuilder_StatisticGroupProps_674403293(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Label {
    
    @JSImport("semantic-ui-react", "Statistic.Label")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Label.type): SharedBuilder_StatisticLabelProps_60047603 = new SharedBuilder_StatisticLabelProps_60047603(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticLabelProps): SharedBuilder_StatisticLabelProps_60047603 = new SharedBuilder_StatisticLabelProps_60047603(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Value {
    
    @JSImport("semantic-ui-react", "Statistic.Value")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Value.type): SharedBuilder_StatisticValueProps1818019187 = new SharedBuilder_StatisticValueProps1818019187(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StatisticValueProps): SharedBuilder_StatisticValueProps1818019187 = new SharedBuilder_StatisticValueProps1818019187(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Statistic")
  @js.native
  val component: js.Object = js.native
  
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
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: SemanticShorthandContent): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: StatisticSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: Boolean): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: SemanticShorthandContent): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueReactElement(value: ReactElement): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Statistic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatisticProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
