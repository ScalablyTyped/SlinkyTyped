package typingsSlinky.semanticUiReact.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedSummary {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedSummary", JSImport.Default)
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
    def dateReactElement(value: ReactElement): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def dateFunction3(
      value: (/* component */ ReactComponentClass[FeedDateProps], FeedDateProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("date", js.Any.fromFunction3(value))
    @scala.inline
    def date(value: SemanticShorthandItem[FeedDateProps]): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def userReactElement(value: ReactElement): this.type = set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def userFunction3(
      value: (/* component */ ReactComponentClass[FeedUserProps], FeedUserProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("user", js.Any.fromFunction3(value))
    @scala.inline
    def user(value: SemanticShorthandItem[FeedUserProps]): this.type = set("user", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FeedSummaryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedSummary.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

