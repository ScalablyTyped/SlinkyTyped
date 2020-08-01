package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedLikeMod.FeedLikeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedLike {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedLike", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedLikeProps): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedLike.type): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, js.Dictionary.empty))()
}

