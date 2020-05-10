package typingsSlinky.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadOptions extends js.Object {
  /** Show the first <num> lines of the files. */
  var `-n`: Double = js.native
}

object HeadOptions {
  @scala.inline
  def apply(`-n`: Double): HeadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadOptions]
  }
  @scala.inline
  implicit class HeadOptionsOps[Self <: HeadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with-n`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-n")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

