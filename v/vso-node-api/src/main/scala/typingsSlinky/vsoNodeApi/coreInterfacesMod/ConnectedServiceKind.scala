package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectedServiceKind extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ConnectedServiceKind")
@js.native
object ConnectedServiceKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectedServiceKind with Double] = js.native
  
  /**
    * Azure Subscription
    */
  @js.native
  sealed trait AzureSubscription extends ConnectedServiceKind
  /* 1 */ val AzureSubscription: typingsSlinky.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.AzureSubscription with Double = js.native
  
  /**
    * Chef Connection
    */
  @js.native
  sealed trait Chef extends ConnectedServiceKind
  /* 2 */ val Chef: typingsSlinky.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Chef with Double = js.native
  
  /**
    * Custom or unknown service
    */
  @js.native
  sealed trait Custom extends ConnectedServiceKind
  /* 0 */ val Custom: typingsSlinky.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Custom with Double = js.native
  
  /**
    * Generic Connection
    */
  @js.native
  sealed trait Generic extends ConnectedServiceKind
  /* 3 */ val Generic: typingsSlinky.vsoNodeApi.coreInterfacesMod.ConnectedServiceKind.Generic with Double = js.native
}
