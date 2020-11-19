package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedLikeMod.FeedLikeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedLike {
  
  @JSImport("semantic-ui-react", "FeedLike")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedLikeProps): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FeedLike.type): SharedBuilder_FeedLikeProps1306299417 = new SharedBuilder_FeedLikeProps1306299417(js.Array(this.component, js.Dictionary.empty))()
}
