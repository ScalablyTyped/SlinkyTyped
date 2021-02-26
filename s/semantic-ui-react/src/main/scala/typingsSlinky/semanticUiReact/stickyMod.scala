package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.stickyStickyMod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[StickyProps, js.Object, js.Any] {
    def this(props: StickyProps) = this()
    def this(props: StickyProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Sticky", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StickyProps] = js.native
  
  type _To = ReactComponentClass[StickyProps]
  
  /* This means you don't have to write `default`, but can instead just say `stickyMod.foo` */
  override def _to: ReactComponentClass[StickyProps] = default
}
