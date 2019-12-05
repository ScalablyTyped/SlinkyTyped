package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EBillingType extends js.Object

@JSImport("steam-client", "EBillingType")
@js.native
object EBillingType extends js.Object {
  @js.native
  sealed trait AutoGrant extends EBillingType
  
  @js.native
  sealed trait BillMonthly extends EBillingType
  
  @js.native
  sealed trait BillOnceOnly extends EBillingType
  
  @js.native
  sealed trait BillOnceOrCDKey extends EBillingType
  
  @js.native
  sealed trait CommercialLicense extends EBillingType
  
  @js.native
  sealed trait FreeCommercialLicense extends EBillingType
  
  @js.native
  sealed trait FreeOnDemand extends EBillingType
  
  @js.native
  sealed trait Gift extends EBillingType
  
  @js.native
  sealed trait GuestPass extends EBillingType
  
  @js.native
  sealed trait HardwarePromo extends EBillingType
  
  @js.native
  sealed trait NoCost extends EBillingType
  
  @js.native
  sealed trait NumBillingTypes extends EBillingType
  
  @js.native
  sealed trait OEMTicket extends EBillingType
  
  @js.native
  sealed trait ProofOfPrepurchaseOnly extends EBillingType
  
  @js.native
  sealed trait RecurringOption extends EBillingType
  
  @js.native
  sealed trait Rental extends EBillingType
  
  @js.native
  sealed trait Repurchaseable extends EBillingType
  
  /* 7 */ val AutoGrant: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.AutoGrant with Double = js.native
  /* 2 */ val BillMonthly: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.BillMonthly with Double = js.native
  /* 1 */ val BillOnceOnly: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.BillOnceOnly with Double = js.native
  /* 10 */ val BillOnceOrCDKey: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.BillOnceOrCDKey with Double = js.native
  /* 14 */ val CommercialLicense: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.CommercialLicense with Double = js.native
  /* 15 */ val FreeCommercialLicense: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.FreeCommercialLicense with Double = js.native
  /* 12 */ val FreeOnDemand: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.FreeOnDemand with Double = js.native
  /* 6 */ val Gift: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.Gift with Double = js.native
  /* 4 */ val GuestPass: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.GuestPass with Double = js.native
  /* 5 */ val HardwarePromo: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.HardwarePromo with Double = js.native
  /* 0 */ val NoCost: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.NoCost with Double = js.native
  /* 16 */ val NumBillingTypes: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.NumBillingTypes with Double = js.native
  /* 8 */ val OEMTicket: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.OEMTicket with Double = js.native
  /* 3 */ val ProofOfPrepurchaseOnly: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.ProofOfPrepurchaseOnly with Double = js.native
  /* 9 */ val RecurringOption: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.RecurringOption with Double = js.native
  /* 13 */ val Rental: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.Rental with Double = js.native
  /* 11 */ val Repurchaseable: typingsSlinky.steamDashClient.steamDashClientMod.EBillingType.Repurchaseable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EBillingType with Double] = js.native
}

