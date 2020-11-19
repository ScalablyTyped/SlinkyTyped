package typingsSlinky.wordpressCompose

import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.wordpressComposeStrings.instanceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/compose/higher-order/with-instance-id", JSImport.Namespace)
@js.native
object withInstanceIdMod extends js.Object {
  
  // prettier-ignore
  def default[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, instanceId]] = js.native
}
