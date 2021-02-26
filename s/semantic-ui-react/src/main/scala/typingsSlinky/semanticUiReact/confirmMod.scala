package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.confirmConfirmMod.ConfirmProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object confirmMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ConfirmProps, js.Object, js.Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ConfirmProps] = js.native
  
  type _To = ReactComponentClass[ConfirmProps]
  
  /* This means you don't have to write `default`, but can instead just say `confirmMod.foo` */
  override def _to: ReactComponentClass[ConfirmProps] = default
}
