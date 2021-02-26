package typingsSlinky.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.dimmerDimmableMod.DimmerDimmableProps
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerComponent
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsSlinky.semanticUiReact.dimmerInnerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Dimmer")
@js.native
class Dimmer protected ()
  extends Component[DimmerProps, js.Object, js.Any] {
  def this(props: DimmerProps) = this()
  def this(props: DimmerProps, context: js.Any) = this()
}
object Dimmer extends Shortcut {
  
  @JSImport("semantic-ui-react", "Dimmer")
  @js.native
  val ^ : DimmerComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dimmer.Dimmable")
  @js.native
  class Dimmable protected ()
    extends Component[DimmerDimmableProps, js.Object, js.Any] {
    def this(props: DimmerDimmableProps) = this()
    def this(props: DimmerDimmableProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dimmer.Inner")
  @js.native
  class Inner () extends default
  
  type _To = DimmerComponent
  
  /* This means you don't have to write `^`, but can instead just say `Dimmer.foo` */
  override def _to: DimmerComponent = ^
}
