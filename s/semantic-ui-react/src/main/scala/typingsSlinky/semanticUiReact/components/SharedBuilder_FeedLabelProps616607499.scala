package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.HtmlImageProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_FeedLabelProps616607499 (val args: js.Array[js.Any])
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
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  @scala.inline
  def iconFunction3(
    value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("icon", js.Any.fromFunction3(value))
  @scala.inline
  def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
  @scala.inline
  def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
  @scala.inline
  def imageFunction3(
    value: (/* component */ ReactType[HtmlImageProps], HtmlImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("image", js.Any.fromFunction3(value))
  @scala.inline
  def image(value: SemanticShorthandItem[HtmlImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
}

