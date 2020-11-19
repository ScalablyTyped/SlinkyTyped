package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerComponent
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer", JSImport.Namespace)
@js.native
object dimmerMod extends js.Object {
  
  @js.native
  class default protected ()
    extends Component[DimmerProps, js.Object, js.Any] {
    def this(props: DimmerProps) = this()
    def this(props: DimmerProps, context: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[DimmerComponent] {
    
    @js.native
    class Inner ()
      extends typingsSlinky.semanticUiReact.dimmerInnerMod.default
  }
}
