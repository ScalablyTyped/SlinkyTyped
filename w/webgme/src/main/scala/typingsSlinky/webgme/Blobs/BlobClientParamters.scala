package typingsSlinky.webgme.Blobs

import typingsSlinky.webgme.Global.GmeLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlobClientParamters extends js.Object {
  var logger: GmeLogger = js.native
}

object BlobClientParamters {
  @scala.inline
  def apply(logger: GmeLogger): BlobClientParamters = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobClientParamters]
  }
  @scala.inline
  implicit class BlobClientParamtersOps[Self <: BlobClientParamters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogger(value: GmeLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

