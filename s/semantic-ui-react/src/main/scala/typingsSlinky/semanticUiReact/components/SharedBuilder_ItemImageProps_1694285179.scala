package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsSlinky.semanticUiReact.genericMod.SemanticFLOATS
import typingsSlinky.semanticUiReact.genericMod.SemanticSIZES
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ItemImageProps_1694285179 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def avatar(value: Boolean): this.type = set("avatar", value.asInstanceOf[js.Any])
  
  @scala.inline
  def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
  
  @scala.inline
  def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
  
  @scala.inline
  def circular(value: Boolean): this.type = set("circular", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dimmerReactElement(value: ReactElement): this.type = set("dimmer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dimmerFunction3(
    value: (/* component */ ReactType[DimmerProps], DimmerProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("dimmer", js.Any.fromFunction3(value))
  
  @scala.inline
  def dimmer(value: SemanticShorthandItem[DimmerProps]): this.type = set("dimmer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def floated(value: SemanticFLOATS): this.type = set("floated", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def labelFunction3(
    value: (/* component */ ReactType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("label", js.Any.fromFunction3(value))
  
  @scala.inline
  def label(value: SemanticShorthandItem[LabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
  
  @scala.inline
  def size(value: SemanticSIZES): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def spaced(value: Boolean | left | right): this.type = set("spaced", value.asInstanceOf[js.Any])
  
  @scala.inline
  def ui(value: Boolean): this.type = set("ui", value.asInstanceOf[js.Any])
  
  @scala.inline
  def verticalAlign(value: SemanticVERTICALALIGNMENTS): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapped(value: Boolean): this.type = set("wrapped", value.asInstanceOf[js.Any])
}
