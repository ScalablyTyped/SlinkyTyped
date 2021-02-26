package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.gridColumnMod.GridOnlyProp
import typingsSlinky.semanticUiReact.gridGridMod.GridReversedProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_GridRowProps_1468990785 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def columns(value: SemanticWIDTHS | equal): this.type = set("columns", value.asInstanceOf[js.Any])
  
  @scala.inline
  def divided(value: Boolean): this.type = set("divided", value.asInstanceOf[js.Any])
  
  @scala.inline
  def only(value: GridOnlyProp): this.type = set("only", value.asInstanceOf[js.Any])
  
  @scala.inline
  def reversed(value: GridReversedProp): this.type = set("reversed", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stretched(value: Boolean): this.type = set("stretched", value.asInstanceOf[js.Any])
  
  @scala.inline
  def textAlign(value: SemanticTEXTALIGNMENTS): this.type = set("textAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
