package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.semanticUiReact.searchSearchMod.SearchComponent
import typingsSlinky.semanticUiReact.searchSearchMod.SearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[SearchProps, ComponentState, js.Any] {
    def this(props: SearchProps) = this()
    def this(props: SearchProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[SearchComponent]
  
}

