package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.gridColumnMod.GridColumnProps
import typingsSlinky.semanticUiReact.gridGridMod.GridProps
import typingsSlinky.semanticUiReact.gridGridMod.GridReversedProp
import typingsSlinky.semanticUiReact.gridRowMod.GridRowProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import typingsSlinky.semanticUiReact.semanticUiReactStrings.horizontally
import typingsSlinky.semanticUiReact.semanticUiReactStrings.internally
import typingsSlinky.semanticUiReact.semanticUiReactStrings.vertically
import typingsSlinky.semanticUiReact.semanticUiReactStrings.very
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  object Column {
    
    @JSImport("semantic-ui-react", "Grid.Column")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Column.type): SharedBuilder_GridColumnProps_612419309 = new SharedBuilder_GridColumnProps_612419309(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GridColumnProps): SharedBuilder_GridColumnProps_612419309 = new SharedBuilder_GridColumnProps_612419309(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Row {
    
    @JSImport("semantic-ui-react", "Grid.Row")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Row.type): SharedBuilder_GridRowProps_1468990785 = new SharedBuilder_GridRowProps_1468990785(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GridRowProps): SharedBuilder_GridRowProps_1468990785 = new SharedBuilder_GridRowProps_1468990785(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def celled(value: Boolean | internally): this.type = set("celled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columns(value: SemanticWIDTHS | equal): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: Boolean): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def divided(value: Boolean | vertically): this.type = set("divided", value.asInstanceOf[js.Any])
    
    @scala.inline
    def doubling(value: Boolean): this.type = set("doubling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def padded(value: Boolean | horizontally | vertically): this.type = set("padded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def relaxed(value: Boolean | very): this.type = set("relaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reversed(value: GridReversedProp): this.type = set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stretched(value: Boolean): this.type = set("stretched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
