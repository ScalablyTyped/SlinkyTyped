package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.feedEventMod.FeedEventProps
import typingsSlinky.semanticUiReact.feedFeedMod.FeedProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Feed {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed", JSImport.Default)
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
    def events(value: SemanticShorthandCollection[FeedEventProps]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: small | large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FeedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Feed.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

