package typingsSlinky.yazl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yazl.yazl.DirectoryOptions> */
trait PartialDirectoryOptions extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[js.Date] = js.undefined
}

object PartialDirectoryOptions {
  @scala.inline
  def apply(mode: js.UndefOr[Double] = js.undefined, mtime: js.Date = null): PartialDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mode)) __obj.updateDynamic("mode")(mode.get.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDirectoryOptions]
  }
}

