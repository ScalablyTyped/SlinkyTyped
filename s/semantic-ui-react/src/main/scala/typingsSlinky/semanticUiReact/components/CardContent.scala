package typingsSlinky.semanticUiReact.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.cardContentMod.CardContentProps
import typingsSlinky.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsSlinky.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsSlinky.semanticUiReact.cardMetaMod.CardMetaProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.center
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardContent {
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
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
      value: (/* component */ ReactComponentClass[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    @scala.inline
    def description(value: SemanticShorthandItem[CardDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def extra(value: Boolean): this.type = set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerFunction3(
      value: (/* component */ ReactComponentClass[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("header", js.Any.fromFunction3(value))
    @scala.inline
    def header(value: SemanticShorthandItem[CardHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def metaFunction3(
      value: (/* component */ ReactComponentClass[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def meta(value: SemanticShorthandItem[CardMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlign(value: center | left | right): this.type = set("textAlign", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CardContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CardContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

