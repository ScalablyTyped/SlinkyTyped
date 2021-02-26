package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typingsSlinky.semanticUiReact.itemExtraMod.ItemExtraProps
import typingsSlinky.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typingsSlinky.semanticUiReact.itemMetaMod.ItemMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ItemContentProps1553622066[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def description(value: SemanticShorthandItem[ItemDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def descriptionFunction3(
    value: (/* component */ ReactElement, ItemDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("description", js.Any.fromFunction3(value))
  
  @scala.inline
  def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extra(value: SemanticShorthandItem[ItemExtraProps]): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def extraFunction3(
    value: (/* component */ ReactElement, ItemExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("extra", js.Any.fromFunction3(value))
  
  @scala.inline
  def extraReactElement(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
  
  @scala.inline
  def header(value: SemanticShorthandItem[ItemHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def headerFunction3(
    value: (/* component */ ReactElement, ItemHeaderProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("header", js.Any.fromFunction3(value))
  
  @scala.inline
  def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def meta(value: SemanticShorthandItem[ItemMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  
  @scala.inline
  def metaFunction3(
    value: (/* component */ ReactElement, ItemMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("meta", js.Any.fromFunction3(value))
  
  @scala.inline
  def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
}
