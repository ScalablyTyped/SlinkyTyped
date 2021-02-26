package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.progressProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ProgressProps, js.Object, js.Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ProgressProps] = js.native
  
  type _To = ReactComponentClass[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `progressMod.foo` */
  override def _to: ReactComponentClass[ProgressProps] = default
}
