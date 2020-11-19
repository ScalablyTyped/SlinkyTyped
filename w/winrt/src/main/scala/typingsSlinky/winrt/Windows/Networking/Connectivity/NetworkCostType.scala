package typingsSlinky.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkCostType extends js.Object
@JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
@js.native
object NetworkCostType extends js.Object {
  
  @js.native
  sealed trait fixed extends NetworkCostType
  
  @js.native
  sealed trait unknown extends NetworkCostType
  
  @js.native
  sealed trait unrestricted extends NetworkCostType
  
  @js.native
  sealed trait variable extends NetworkCostType
}
