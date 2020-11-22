package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.flagFlagMod.FlagProps
import typingsSlinky.semanticUiReact.genericMod.HtmlSpanProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DropdownItemProps_1338970085 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
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
    value: (/* component */ ReactElement, HtmlSpanProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("description", js.Any.fromFunction3(value))
  
  @scala.inline
  def description(value: SemanticShorthandItem[HtmlSpanProps]): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flagReactElement(value: ReactElement): this.type = set("flag", value.asInstanceOf[js.Any])
  
  @scala.inline
  def flagFunction3(
    value: (/* component */ ReactElement, FlagProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("flag", js.Any.fromFunction3(value))
  
  @scala.inline
  def flag(value: SemanticShorthandItem[FlagProps]): this.type = set("flag", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconFunction3(
    value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("icon", js.Any.fromFunction3(value))
  
  @scala.inline
  def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
  
  @scala.inline
  def imageFunction3(
    value: (/* component */ ReactElement, ImageProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("image", js.Any.fromFunction3(value))
  
  @scala.inline
  def image(value: SemanticShorthandItem[ImageProps]): this.type = set("image", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelFunction3(
    value: (/* component */ ReactElement, LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("label", js.Any.fromFunction3(value))
  
  @scala.inline
  def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ DropdownItemProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  @scala.inline
  def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
  
  @scala.inline
  def text(value: SemanticShorthandContent): this.type = set("text", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: Boolean | Double | String): this.type = set("value", value.asInstanceOf[js.Any])
}
