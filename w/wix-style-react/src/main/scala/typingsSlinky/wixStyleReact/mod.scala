package typingsSlinky.wixStyleReact

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.wixStyleReact.baseComponentsMod.WixComponentProps
import typingsSlinky.wixStyleReact.buttonMod.ButtonProps
import typingsSlinky.wixStyleReact.loaderMod.LoaderProps
import typingsSlinky.wixStyleReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Text: ReactComponentClass[TextProps] = js.native
  
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Loader ()
    extends Component[LoaderProps, js.Object, js.Any]
  
  @js.native
  class WixComponent[T /* <: WixComponentProps */] ()
    extends Component[T, js.Object, js.Any]
}
