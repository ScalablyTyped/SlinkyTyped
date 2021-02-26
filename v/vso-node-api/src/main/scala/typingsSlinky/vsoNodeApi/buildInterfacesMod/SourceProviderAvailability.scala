package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceProviderAvailability extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "SourceProviderAvailability")
@js.native
object SourceProviderAvailability extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceProviderAvailability with Double] = js.native
  
  /**
    * The source provider is available in all environments.
    */
  @js.native
  sealed trait All extends SourceProviderAvailability
  /* 3 */ val All: typingsSlinky.vsoNodeApi.buildInterfacesMod.SourceProviderAvailability.All with Double = js.native
  
  /**
    * The source provider is available in the hosted environment.
    */
  @js.native
  sealed trait Hosted extends SourceProviderAvailability
  /* 1 */ val Hosted: typingsSlinky.vsoNodeApi.buildInterfacesMod.SourceProviderAvailability.Hosted with Double = js.native
  
  /**
    * The source provider is available in the on-premises environment.
    */
  @js.native
  sealed trait OnPremises extends SourceProviderAvailability
  /* 2 */ val OnPremises: typingsSlinky.vsoNodeApi.buildInterfacesMod.SourceProviderAvailability.OnPremises with Double = js.native
}
