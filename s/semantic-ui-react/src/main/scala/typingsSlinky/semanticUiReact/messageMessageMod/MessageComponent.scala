package typingsSlinky.semanticUiReact.messageMessageMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.messageContentMod.MessageContentProps
import typingsSlinky.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typingsSlinky.semanticUiReact.messageItemMod.MessageItemProps
import typingsSlinky.semanticUiReact.messageListMod.MessageListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageComponent extends ComponentClass[MessageProps, ComponentState] {
  var Content: ReactComponentClass[MessageContentProps] = js.native
  var Header: ReactComponentClass[MessageHeaderProps] = js.native
  var Item: ReactComponentClass[MessageItemProps] = js.native
  var List: ReactComponentClass[MessageListProps] = js.native
}

