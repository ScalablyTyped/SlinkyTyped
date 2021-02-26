package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.stepStepMod.StepComponent
import typingsSlinky.semanticUiReact.stepStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StepProps, js.Object, js.Any] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Default)
  @js.native
  val default: StepComponent = js.native
  
  type _To = StepComponent
  
  /* This means you don't have to write `default`, but can instead just say `stepMod.foo` */
  override def _to: StepComponent = default
}
