package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedDate {
  
  @JSImport("semantic-ui-react", "FeedDate")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedDateProps): SharedBuilder_FeedDateProps_1121330675 = new SharedBuilder_FeedDateProps_1121330675(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FeedDate.type): SharedBuilder_FeedDateProps_1121330675 = new SharedBuilder_FeedDateProps_1121330675(js.Array(this.component, js.Dictionary.empty))()
}
