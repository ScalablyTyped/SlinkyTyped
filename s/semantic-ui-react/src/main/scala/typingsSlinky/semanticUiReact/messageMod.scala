package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.messageMessageMod.MessageComponent
import typingsSlinky.semanticUiReact.messageMessageMod.MessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[MessageProps, ComponentState, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[MessageComponent]
  
}

