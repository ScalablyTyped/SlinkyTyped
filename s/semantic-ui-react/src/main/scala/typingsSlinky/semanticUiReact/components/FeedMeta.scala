package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedMetaMod.FeedMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeedMeta {
  
  @JSImport("semantic-ui-react", "FeedMeta")
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedMetaProps): SharedBuilder_FeedMetaProps1680283281 = new SharedBuilder_FeedMetaProps1680283281(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FeedMeta.type): SharedBuilder_FeedMetaProps1680283281 = new SharedBuilder_FeedMetaProps1680283281(js.Array(this.component, js.Dictionary.empty))()
}
