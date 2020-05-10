package typingsSlinky.ssh2SftpClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStats extends js.Object {
  var accessTime: Double = js.native
  var gid: Double = js.native
  var isBlockDevice: Boolean = js.native
  var isCharacterDevice: Boolean = js.native
  var isDirectory: Boolean = js.native
  var isFIFO: Boolean = js.native
  var isFile: Boolean = js.native
  var isSocket: Boolean = js.native
  var isSymbolicLink: Boolean = js.native
  var mode: Double = js.native
  var modifyTime: Double = js.native
  var size: Double = js.native
  var uid: Double = js.native
}

object FileStats {
  @scala.inline
  def apply(
    accessTime: Double,
    gid: Double,
    isBlockDevice: Boolean,
    isCharacterDevice: Boolean,
    isDirectory: Boolean,
    isFIFO: Boolean,
    isFile: Boolean,
    isSocket: Boolean,
    isSymbolicLink: Boolean,
    mode: Double,
    modifyTime: Double,
    size: Double,
    uid: Double
  ): FileStats = {
    val __obj = js.Dynamic.literal(accessTime = accessTime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], isBlockDevice = isBlockDevice.asInstanceOf[js.Any], isCharacterDevice = isCharacterDevice.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFIFO = isFIFO.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isSocket = isSocket.asInstanceOf[js.Any], isSymbolicLink = isSymbolicLink.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], modifyTime = modifyTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileStats]
  }
  @scala.inline
  implicit class FileStatsOps[Self <: FileStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlockDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCharacterDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCharacterDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFIFO(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFIFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSocket(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSymbolicLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSymbolicLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifyTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

