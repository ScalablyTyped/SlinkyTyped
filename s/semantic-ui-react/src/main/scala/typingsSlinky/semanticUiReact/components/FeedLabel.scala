package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedLabel {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedLabel", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedLabelProps): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedLabel.type): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, js.Dictionary.empty))()
}

