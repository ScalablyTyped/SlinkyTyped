package typingsSlinky.unzipper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CentralDirectory extends js.Object {
  var commentLength: Double = js.native
  var diskNumber: Double = js.native
  var diskStart: Double = js.native
  var files: js.Array[File] = js.native
  var numberOfRecords: Double = js.native
  var numberOfRecordsOnDisk: Double = js.native
  var offsetToStartOfCentralDirectory: Double = js.native
  var signature: Double = js.native
  var sizeOfCentralDirectory: Double = js.native
  def extract(opts: ParseOptions): js.Promise[Unit] = js.native
}

object CentralDirectory {
  @scala.inline
  def apply(
    commentLength: Double,
    diskNumber: Double,
    diskStart: Double,
    extract: ParseOptions => js.Promise[Unit],
    files: js.Array[File],
    numberOfRecords: Double,
    numberOfRecordsOnDisk: Double,
    offsetToStartOfCentralDirectory: Double,
    signature: Double,
    sizeOfCentralDirectory: Double
  ): CentralDirectory = {
    val __obj = js.Dynamic.literal(commentLength = commentLength.asInstanceOf[js.Any], diskNumber = diskNumber.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), files = files.asInstanceOf[js.Any], numberOfRecords = numberOfRecords.asInstanceOf[js.Any], numberOfRecordsOnDisk = numberOfRecordsOnDisk.asInstanceOf[js.Any], offsetToStartOfCentralDirectory = offsetToStartOfCentralDirectory.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], sizeOfCentralDirectory = sizeOfCentralDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CentralDirectory]
  }
  @scala.inline
  implicit class CentralDirectoryOps[Self <: CentralDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtract(value: ParseOptions => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFiles(value: js.Array[File]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRecords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRecordsOnDisk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfRecordsOnDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetToStartOfCentralDirectory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetToStartOfCentralDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeOfCentralDirectory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeOfCentralDirectory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

