package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedExtraMod.FeedExtraProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedExtra {
  @JSImport("semantic-ui-react", "FeedExtra")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedExtraProps): SharedBuilder_FeedExtraProps_1691549295 = new SharedBuilder_FeedExtraProps_1691549295(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedExtra.type): SharedBuilder_FeedExtraProps_1691549295 = new SharedBuilder_FeedExtraProps_1691549295(js.Array(this.component, js.Dictionary.empty))()
}

