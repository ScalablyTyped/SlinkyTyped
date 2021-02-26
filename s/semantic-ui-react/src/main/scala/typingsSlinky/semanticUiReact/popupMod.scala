package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.popupPopupMod.PopupComponent
import typingsSlinky.semanticUiReact.popupPopupMod.PopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[PopupProps, js.Object, js.Any] {
    def this(props: PopupProps) = this()
    def this(props: PopupProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Popup", JSImport.Default)
  @js.native
  val default: PopupComponent = js.native
  
  type _To = PopupComponent
  
  /* This means you don't have to write `default`, but can instead just say `popupMod.foo` */
  override def _to: PopupComponent = default
}
