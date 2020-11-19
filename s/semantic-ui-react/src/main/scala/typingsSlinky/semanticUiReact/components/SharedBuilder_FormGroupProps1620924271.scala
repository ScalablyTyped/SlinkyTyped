package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FormGroupProps1620924271 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def grouped(value: Boolean): this.type = set("grouped", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
  
  @scala.inline
  def unstackable(value: Boolean): this.type = set("unstackable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def widths(value: SemanticWIDTHS | equal): this.type = set("widths", value.asInstanceOf[js.Any])
}
