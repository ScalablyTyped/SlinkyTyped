package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.feedEventMod.FeedEventProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FeedEvent {
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedEvent", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FeedEventProps): SharedBuilder_FeedEventProps1387652423 = new SharedBuilder_FeedEventProps1387652423(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FeedEvent.type): SharedBuilder_FeedEventProps1387652423 = new SharedBuilder_FeedEventProps1387652423(js.Array(this.component, js.Dictionary.empty))()
}

