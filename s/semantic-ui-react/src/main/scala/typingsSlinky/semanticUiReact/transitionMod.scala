package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.transitionGroupMod.TransitionGroupProps
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionComponent
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TransitionProps, js.Object, js.Any] {
    def this(props: TransitionProps) = this()
    def this(props: TransitionProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Default)
    @js.native
    val ^ : TransitionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition", "default.Group")
    @js.native
    class Group protected ()
      extends Component[TransitionGroupProps, js.Object, js.Any] {
      def this(props: TransitionGroupProps) = this()
      def this(props: TransitionGroupProps, context: js.Any) = this()
    }
    
    type _To = TransitionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: TransitionComponent = ^
  }
}
