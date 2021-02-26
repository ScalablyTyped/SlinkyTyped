package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceHostStatus extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "ServiceHostStatus")
@js.native
object ServiceHostStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceHostStatus with Double] = js.native
  
  /**
    * The service host is currently disconnected and not accepting commands.
    */
  @js.native
  sealed trait Offline extends ServiceHostStatus
  /* 2 */ val Offline: typingsSlinky.vsoNodeApi.buildInterfacesMod.ServiceHostStatus.Offline with Double = js.native
  
  /**
    * The service host is currently connected and accepting commands.
    */
  @js.native
  sealed trait Online extends ServiceHostStatus
  /* 1 */ val Online: typingsSlinky.vsoNodeApi.buildInterfacesMod.ServiceHostStatus.Online with Double = js.native
}
