package typingsSlinky.wixDashStyleDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.wixDashStyleDashReact.baseComponentsMod.WixComponentProps
import typingsSlinky.wixDashStyleDashReact.buttonMod.ButtonProps
import typingsSlinky.wixDashStyleDashReact.loaderMod.LoaderProps
import typingsSlinky.wixDashStyleDashReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object wixDashStyleDashReactMod extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Loader ()
    extends Component[LoaderProps, js.Object, js.Any]
  
  @js.native
  class WixComponent[T /* <: WixComponentProps */] ()
    extends Component[T, js.Object, js.Any]
  
  val Text: ReactComponentClass[TextProps] = js.native
}

