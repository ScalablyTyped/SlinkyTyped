package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: js.Any = js.native
}

object Log {
  @scala.inline
  def apply(log: js.Any): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

