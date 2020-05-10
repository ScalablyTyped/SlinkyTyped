package typingsSlinky.streamFork.mod

import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForkOptions extends WritableOptions {
  /**
    * ignoreErrors is a flag. When its value is truthy, a Fork instance never fails on write() silently ignoring downstream errors.
    * Otherwise, the first encountered downstream error is reported upstream as its own error. The default: false.
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}

object ForkOptions {
  @scala.inline
  def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  @scala.inline
  implicit class ForkOptionsOps[Self <: ForkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
  }
  
}

