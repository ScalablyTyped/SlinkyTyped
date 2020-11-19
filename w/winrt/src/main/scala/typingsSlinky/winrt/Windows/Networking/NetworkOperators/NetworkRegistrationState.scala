package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkRegistrationState extends js.Object
@JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
@js.native
object NetworkRegistrationState extends js.Object {
  
  @js.native
  sealed trait denied extends NetworkRegistrationState
  
  @js.native
  sealed trait deregistered extends NetworkRegistrationState
  
  @js.native
  sealed trait home extends NetworkRegistrationState
  
  @js.native
  sealed trait none extends NetworkRegistrationState
  
  @js.native
  sealed trait partner extends NetworkRegistrationState
  
  @js.native
  sealed trait roaming extends NetworkRegistrationState
  
  @js.native
  sealed trait searching extends NetworkRegistrationState
}
