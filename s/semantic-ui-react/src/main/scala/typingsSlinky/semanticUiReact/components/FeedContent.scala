package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedContentMod.FeedContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedContent {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedContent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedContentProps): SharedBuilder_FeedContentProps380343706 = new SharedBuilder_FeedContentProps380343706(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedContent.type): SharedBuilder_FeedContentProps380343706 = new SharedBuilder_FeedContentProps380343706(js.Array(this.component, js.Dictionary.empty))()
}

