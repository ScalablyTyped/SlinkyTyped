package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EBillingType extends StObject
@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
  
  @js.native
  sealed trait AutoGrant extends EBillingType
  /* 7 */ val AutoGrant: typingsSlinky.steamClient.mod.EBillingType.AutoGrant with Double = js.native
  
  @js.native
  sealed trait BillMonthly extends EBillingType
  /* 2 */ val BillMonthly: typingsSlinky.steamClient.mod.EBillingType.BillMonthly with Double = js.native
  
  @js.native
  sealed trait BillOnceOnly extends EBillingType
  /* 1 */ val BillOnceOnly: typingsSlinky.steamClient.mod.EBillingType.BillOnceOnly with Double = js.native
  
  @js.native
  sealed trait BillOnceOrCDKey extends EBillingType
  /* 10 */ val BillOnceOrCDKey: typingsSlinky.steamClient.mod.EBillingType.BillOnceOrCDKey with Double = js.native
  
  @js.native
  sealed trait CommercialLicense extends EBillingType
  /* 14 */ val CommercialLicense: typingsSlinky.steamClient.mod.EBillingType.CommercialLicense with Double = js.native
  
  @js.native
  sealed trait FreeCommercialLicense extends EBillingType
  /* 15 */ val FreeCommercialLicense: typingsSlinky.steamClient.mod.EBillingType.FreeCommercialLicense with Double = js.native
  
  @js.native
  sealed trait FreeOnDemand extends EBillingType
  /* 12 */ val FreeOnDemand: typingsSlinky.steamClient.mod.EBillingType.FreeOnDemand with Double = js.native
  
  @js.native
  sealed trait Gift extends EBillingType
  /* 6 */ val Gift: typingsSlinky.steamClient.mod.EBillingType.Gift with Double = js.native
  
  @js.native
  sealed trait GuestPass extends EBillingType
  /* 4 */ val GuestPass: typingsSlinky.steamClient.mod.EBillingType.GuestPass with Double = js.native
  
  @js.native
  sealed trait HardwarePromo extends EBillingType
  /* 5 */ val HardwarePromo: typingsSlinky.steamClient.mod.EBillingType.HardwarePromo with Double = js.native
  
  @js.native
  sealed trait NoCost extends EBillingType
  /* 0 */ val NoCost: typingsSlinky.steamClient.mod.EBillingType.NoCost with Double = js.native
  
  @js.native
  sealed trait NumBillingTypes extends EBillingType
  /* 16 */ val NumBillingTypes: typingsSlinky.steamClient.mod.EBillingType.NumBillingTypes with Double = js.native
  
  @js.native
  sealed trait OEMTicket extends EBillingType
  /* 8 */ val OEMTicket: typingsSlinky.steamClient.mod.EBillingType.OEMTicket with Double = js.native
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly extends EBillingType
  /* 3 */ val ProofOfPrepurchaseOnly: typingsSlinky.steamClient.mod.EBillingType.ProofOfPrepurchaseOnly with Double = js.native
  
  @js.native
  sealed trait RecurringOption extends EBillingType
  /* 9 */ val RecurringOption: typingsSlinky.steamClient.mod.EBillingType.RecurringOption with Double = js.native
  
  @js.native
  sealed trait Rental extends EBillingType
  /* 13 */ val Rental: typingsSlinky.steamClient.mod.EBillingType.Rental with Double = js.native
  
  @js.native
  sealed trait Repurchaseable extends EBillingType
  /* 11 */ val Repurchaseable: typingsSlinky.steamClient.mod.EBillingType.Repurchaseable with Double = js.native
}
