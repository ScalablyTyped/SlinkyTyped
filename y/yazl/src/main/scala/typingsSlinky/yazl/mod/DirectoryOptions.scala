package typingsSlinky.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryOptions extends js.Object {
  var mode: Double
  var mtime: js.Date
}

object DirectoryOptions {
  @scala.inline
  def apply(mode: Double, mtime: js.Date): DirectoryOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryOptions]
  }
}

