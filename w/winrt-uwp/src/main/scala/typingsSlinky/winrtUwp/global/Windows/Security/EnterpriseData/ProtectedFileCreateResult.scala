package typingsSlinky.winrtUwp.global.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
@js.native
abstract class ProtectedFileCreateResult ()
  extends typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult {
  /** The newly created enterprise protected file. */
  /* CompleteClass */
  override var file: StorageFile = js.native
  /** Information about the enterprise protected file. */
  /* CompleteClass */
  override var protectionInfo: typingsSlinky.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo = js.native
  /** The stream random access to the newly created enterprise protected file. */
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
}

