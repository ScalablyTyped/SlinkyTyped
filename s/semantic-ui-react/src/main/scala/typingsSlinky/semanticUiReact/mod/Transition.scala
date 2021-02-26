package typingsSlinky.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.transitionGroupMod.TransitionGroupProps
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionComponent
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Transition")
@js.native
class Transition protected ()
  extends Component[TransitionProps, js.Object, js.Any] {
  def this(props: TransitionProps) = this()
  def this(props: TransitionProps, context: js.Any) = this()
}
object Transition extends Shortcut {
  
  @JSImport("semantic-ui-react", "Transition")
  @js.native
  val ^ : TransitionComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Transition.Group")
  @js.native
  class Group protected ()
    extends Component[TransitionGroupProps, js.Object, js.Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: js.Any) = this()
  }
  
  type _To = TransitionComponent
  
  /* This means you don't have to write `^`, but can instead just say `Transition.foo` */
  override def _to: TransitionComponent = ^
}
