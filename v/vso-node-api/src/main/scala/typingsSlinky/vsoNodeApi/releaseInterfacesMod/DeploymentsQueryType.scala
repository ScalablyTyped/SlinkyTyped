package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentsQueryType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentsQueryType")
@js.native
object DeploymentsQueryType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentsQueryType with Double] = js.native
  
  @js.native
  sealed trait FailingSince extends DeploymentsQueryType
  /* 2 */ val FailingSince: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentsQueryType.FailingSince with Double = js.native
  
  @js.native
  sealed trait Regular extends DeploymentsQueryType
  /* 1 */ val Regular: typingsSlinky.vsoNodeApi.releaseInterfacesMod.DeploymentsQueryType.Regular with Double = js.native
}
