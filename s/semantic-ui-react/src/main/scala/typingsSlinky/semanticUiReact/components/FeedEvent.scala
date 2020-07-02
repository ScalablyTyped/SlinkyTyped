package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.feedContentMod.FeedContentProps
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedEventMod.FeedEventProps
import typingsSlinky.semanticUiReact.feedExtraMod.FeedExtraProps
import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import typingsSlinky.semanticUiReact.feedMetaMod.FeedMetaProps
import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedEvent {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedEvent", JSImport.Default)
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
    def contentFunction3(
      value: (/* component */ ReactType[FeedContentProps], FeedContentProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("content", js.Any.fromFunction3(value))
    @scala.inline
    def content(value: SemanticShorthandItem[FeedContentProps]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def dateReactElement(value: ReactElement): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def dateFunction3(
      value: (/* component */ ReactType[FeedDateProps], FeedDateProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("date", js.Any.fromFunction3(value))
    @scala.inline
    def date(value: SemanticShorthandItem[FeedDateProps]): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def extraImagesReactElement(value: ReactElement): this.type = set("extraImages", value.asInstanceOf[js.Any])
    @scala.inline
    def extraImagesFunction3(
      value: (/* component */ ReactType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("extraImages", js.Any.fromFunction3(value))
    @scala.inline
    def extraImages(value: SemanticShorthandItem[FeedExtraProps]): this.type = set("extraImages", value.asInstanceOf[js.Any])
    @scala.inline
    def extraTextReactElement(value: ReactElement): this.type = set("extraText", value.asInstanceOf[js.Any])
    @scala.inline
    def extraTextFunction3(
      value: (/* component */ ReactType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("extraText", js.Any.fromFunction3(value))
    @scala.inline
    def extraText(value: SemanticShorthandItem[FeedExtraProps]): this.type = set("extraText", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactType[FeedLabelProps], FeedLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[FeedLabelProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def imageReactElement(value: ReactElement): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def imageFunction3(
      value: (/* component */ ReactType[FeedLabelProps], FeedLabelProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("image", js.Any.fromFunction3(value))
    @scala.inline
    def image(value: SemanticShorthandItem[FeedLabelProps]): this.type = set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def metaReactElement(value: ReactElement): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def metaFunction3(
      value: (/* component */ ReactType[FeedMetaProps], FeedMetaProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("meta", js.Any.fromFunction3(value))
    @scala.inline
    def meta(value: SemanticShorthandItem[FeedMetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def summaryReactElement(value: ReactElement): this.type = set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def summaryFunction3(
      value: (/* component */ ReactType[FeedSummaryProps], FeedSummaryProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("summary", js.Any.fromFunction3(value))
    @scala.inline
    def summary(value: SemanticShorthandItem[FeedSummaryProps]): this.type = set("summary", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FeedEventProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedEvent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

