package typingsSlinky.walk.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.StatsBase
import typingsSlinky.walk.walkStrings.FIFO
import typingsSlinky.walk.walkStrings.blockDevice
import typingsSlinky.walk.walkStrings.characterDevice
import typingsSlinky.walk.walkStrings.directory
import typingsSlinky.walk.walkStrings.file
import typingsSlinky.walk.walkStrings.socket
import typingsSlinky.walk.walkStrings.symbolicLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkStats extends StatsBase[Double] {
  var error: js.UndefOr[ErrnoException] = js.native
  var name: String = js.native
  var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket = js.native
}

object WalkStats {
  @scala.inline
  def apply(
    atime: js.Date,
    atimeMs: Double,
    birthtime: js.Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    ctime: js.Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: js.Date,
    mtimeMs: Double,
    name: String,
    nlink: Double,
    rdev: Double,
    size: Double,
    `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket,
    uid: Double
  ): WalkStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkStats]
  }
  @scala.inline
  implicit class WalkStatsOps[Self <: WalkStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: ErrnoException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

