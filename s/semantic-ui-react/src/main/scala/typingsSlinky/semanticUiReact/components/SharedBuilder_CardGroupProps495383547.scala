package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.cardCardMod.CardProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.semanticUiReactStrings.center
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_CardGroupProps495383547 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  @scala.inline
  def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  @scala.inline
  def doubling(value: Boolean): this.type = set("doubling", value.asInstanceOf[js.Any])
  @scala.inline
  def itemsVarargs(value: SemanticShorthandItem[CardProps]*): this.type = set("items", js.Array(value :_*))
  @scala.inline
  def items(value: SemanticShorthandCollection[CardProps]): this.type = set("items", value.asInstanceOf[js.Any])
  @scala.inline
  def itemsPerRow(value: SemanticWIDTHS): this.type = set("itemsPerRow", value.asInstanceOf[js.Any])
  @scala.inline
  def stackable(value: Boolean): this.type = set("stackable", value.asInstanceOf[js.Any])
  @scala.inline
  def textAlign(value: center | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
}

