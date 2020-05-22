package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been exported to a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerExportResult")
@js.native
abstract class ProtectedContainerExportResult ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult {
  /** The container file that has been exported from an enterprise protected file. */
  /* CompleteClass */
  override var file: StorageFile = js.native
  /** The protection status after an enterprise protected file has been exported to a container file. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus = js.native
}

