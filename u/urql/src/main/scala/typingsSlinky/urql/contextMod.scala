package typingsSlinky.urql

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.ProviderProps
import typingsSlinky.urqlCore.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urql/dist/types/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  val Consumer: ReactComponentClass[ConsumerProps[Client]] = js.native
  
  val Context: typingsSlinky.react.mod.Context[Client] = js.native
  
  val Provider: ReactComponentClass[ProviderProps[Client]] = js.native
  
  def useClient(): Client = js.native
}
