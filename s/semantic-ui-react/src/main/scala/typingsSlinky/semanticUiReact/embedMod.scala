package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.embedEmbedMod.EmbedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[EmbedProps, js.Object, js.Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmbedProps] = js.native
  
  type _To = ReactComponentClass[EmbedProps]
  
  /* This means you don't have to write `default`, but can instead just say `embedMod.foo` */
  override def _to: ReactComponentClass[EmbedProps] = default
}
