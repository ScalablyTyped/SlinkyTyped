package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedLabelMod.FeedLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedLabel {
  
  @JSImport("semantic-ui-react", "FeedLabel")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FeedLabel.type): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FeedLabelProps): SharedBuilder_FeedLabelProps616607499 = new SharedBuilder_FeedLabelProps616607499(js.Array(this.component, p.asInstanceOf[js.Any]))
}
