package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.labelLabelMod.LabelComponent
import typingsSlinky.semanticUiReact.labelLabelMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[LabelProps, js.Object, js.Any] {
    def this(props: LabelProps) = this()
    def this(props: LabelProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Default)
  @js.native
  val default: LabelComponent = js.native
  
  type _To = LabelComponent
  
  /* This means you don't have to write `default`, but can instead just say `labelMod.foo` */
  override def _to: LabelComponent = default
}
