package typingsSlinky.winrtUwp.Windows.Security.EnterpriseData

import typingsSlinky.winrtUwp.Windows.Storage.StorageFile
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
@js.native
trait ProtectedFileCreateResult extends js.Object {
  /** The newly created enterprise protected file. */
  var file: StorageFile = js.native
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo = js.native
  /** The stream random access to the newly created enterprise protected file. */
  var stream: IRandomAccessStream = js.native
}

object ProtectedFileCreateResult {
  @scala.inline
  def apply(file: StorageFile, protectionInfo: FileProtectionInfo, stream: IRandomAccessStream): ProtectedFileCreateResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedFileCreateResult]
  }
  @scala.inline
  implicit class ProtectedFileCreateResultOps[Self <: ProtectedFileCreateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: StorageFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectionInfo(value: FileProtectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

