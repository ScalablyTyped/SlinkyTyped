package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected buffer or stream. */
@JSGlobal("Windows.Security.EnterpriseData.DataProtectionInfo")
@js.native
abstract class DataProtectionInfo ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo {
  /** The enterprise identity of the enterprise protected buffer or stream. */
  /* CompleteClass */
  override var identity: String = js.native
  /** The protection status of the enterprise protected buffer or stream. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus = js.native
}

