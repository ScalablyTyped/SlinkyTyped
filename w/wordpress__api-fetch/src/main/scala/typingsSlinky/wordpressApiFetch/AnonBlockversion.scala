package typingsSlinky.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockversion extends js.Object {
  var block_version: Double = js.native
}

object AnonBlockversion {
  @scala.inline
  def apply(block_version: Double): AnonBlockversion = {
    val __obj = js.Dynamic.literal(block_version = block_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockversion]
  }
  @scala.inline
  implicit class AnonBlockversionOps[Self <: AnonBlockversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block_version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

