package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedUser {
  @JSImport("semantic-ui-react", "FeedUser")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedUserProps): SharedBuilder_FeedUserProps_1451204653 = new SharedBuilder_FeedUserProps_1451204653(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedUser.type): SharedBuilder_FeedUserProps_1451204653 = new SharedBuilder_FeedUserProps_1451204653(js.Array(this.component, js.Dictionary.empty))()
}

