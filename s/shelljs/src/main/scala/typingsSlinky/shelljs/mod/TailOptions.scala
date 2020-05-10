package typingsSlinky.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TailOptions extends js.Object {
  /** Show the last <num> lines of files. */
  var `-n`: Double = js.native
}

object TailOptions {
  @scala.inline
  def apply(`-n`: Double): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailOptions]
  }
  @scala.inline
  implicit class TailOptionsOps[Self <: TailOptions] (val x: Self) extends AnyVal {
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

