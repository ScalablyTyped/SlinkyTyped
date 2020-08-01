package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedSummaryMod.FeedSummaryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedSummary {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedSummary", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedSummaryProps): SharedBuilder_FeedSummaryProps_1963097148 = new SharedBuilder_FeedSummaryProps_1963097148(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedSummary.type): SharedBuilder_FeedSummaryProps_1963097148 = new SharedBuilder_FeedSummaryProps_1963097148(js.Array(this.component, js.Dictionary.empty))()
}

