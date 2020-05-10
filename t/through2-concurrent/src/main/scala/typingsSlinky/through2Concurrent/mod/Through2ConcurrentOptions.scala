package typingsSlinky.through2Concurrent.mod

import typingsSlinky.node.streamMod.DuplexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Through2ConcurrentOptions extends DuplexOptions {
  var maxConcurrency: js.UndefOr[Double] = js.native
}

object Through2ConcurrentOptions {
  @scala.inline
  def apply(): Through2ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Through2ConcurrentOptions]
  }
  @scala.inline
  implicit class Through2ConcurrentOptionsOps[Self <: Through2ConcurrentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConcurrency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
  }
  
}

