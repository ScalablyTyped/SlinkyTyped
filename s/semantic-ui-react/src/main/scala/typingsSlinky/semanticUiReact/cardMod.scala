package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.cardCardMod.CardComponent
import typingsSlinky.semanticUiReact.cardCardMod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CardProps, js.Object, js.Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Default)
  @js.native
  val default: CardComponent = js.native
  
  type _To = CardComponent
  
  /* This means you don't have to write `default`, but can instead just say `cardMod.foo` */
  override def _to: CardComponent = default
}
