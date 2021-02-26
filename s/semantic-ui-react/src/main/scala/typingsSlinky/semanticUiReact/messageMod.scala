package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.messageMessageMod.MessageComponent
import typingsSlinky.semanticUiReact.messageMessageMod.MessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MessageProps, js.Object, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `messageMod.foo` */
  override def _to: MessageComponent = default
}
