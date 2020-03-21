package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.cardCardMod.CardComponent
import typingsSlinky.semanticUiReact.cardCardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[CardProps, ComponentState, js.Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[CardComponent]
  
}

