package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the enterprise identity protection state of a buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
@js.native
object DataProtectionStatus extends js.Object {
  /* 5 */ val accessSuspended: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended with Double = js.native
  /* 4 */ val licenseExpired: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired with Double = js.native
  /* 1 */ val `protected`: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected` with Double = js.native
  /* 0 */ val protectedToOtherIdentity: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity with Double = js.native
  /* 2 */ val revoked: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked with Double = js.native
  /* 3 */ val unprotected: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus with Double
  ] = js.native
}

