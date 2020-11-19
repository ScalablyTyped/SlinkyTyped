package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.listDescriptionMod.ListDescriptionProps
import typingsSlinky.semanticUiReact.listHeaderMod.ListHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ListContentProps_1399011485 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def descriptionFunction3(
    value: (/* component */ ReactType[ListDescriptionProps], ListDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("description", js.Any.fromFunction3(value))
  
  @scala.inline
  def description(value: SemanticShorthandItem[ListDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerFunction3(
    value: (/* component */ ReactType[ListHeaderProps], ListHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("header", js.Any.fromFunction3(value))
  
  @scala.inline
  def header(value: SemanticShorthandItem[ListHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
