package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.visibilityVisibilityMod.VisibilityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[VisibilityProps, js.Object, js.Any] {
    def this(props: VisibilityProps) = this()
    def this(props: VisibilityProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  val default: ReactComponentClass[VisibilityProps] = js.native
  
  type _To = ReactComponentClass[VisibilityProps]
  
  /* This means you don't have to write `default`, but can instead just say `visibilityMod.foo` */
  override def _to: ReactComponentClass[VisibilityProps] = default
}
