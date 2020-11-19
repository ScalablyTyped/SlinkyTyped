package typingsSlinky.wordpressCompose

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/compose/higher-order/with-safe-timeout", JSImport.Namespace)
@js.native
object withSafeTimeoutMod extends js.Object {
  
  // prettier-ignore
  def default[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[Omit[_, setTimeout]] = js.native
}
