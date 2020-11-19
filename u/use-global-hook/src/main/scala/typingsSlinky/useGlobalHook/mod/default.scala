package typingsSlinky.useGlobalHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-global-hook", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply[S, A](React: ReactInterface, inititalState: S, actions: js.Object): UseGlobal[S, A] = js.native
  def apply[S, A](
    React: ReactInterface,
    inititalState: S,
    actions: js.Object,
    initializers: InitializerFunction[S, A]
  ): UseGlobal[S, A] = js.native
}
