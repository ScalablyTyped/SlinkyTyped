package typingsSlinky.tarFs.mod

import typingsSlinky.tarFs.tarFsStrings.directory
import typingsSlinky.tarFs.tarFsStrings.file
import typingsSlinky.tarFs.tarFsStrings.link
import typingsSlinky.tarFs.tarFsStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var gid: Double
  var mode: Double
  var mtime: js.Date
  var name: String
  var size: Double
  var `type`: file | directory | link | symlink
  var uid: Double
}

object Headers {
  @scala.inline
  def apply(
    gid: Double,
    mode: Double,
    mtime: js.Date,
    name: String,
    size: Double,
    `type`: file | directory | link | symlink,
    uid: Double
  ): Headers = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

