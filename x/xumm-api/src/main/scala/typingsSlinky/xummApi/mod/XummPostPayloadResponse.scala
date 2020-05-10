package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.AnonAlways
import typingsSlinky.xummApi.AnonQrmatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPostPayloadResponse extends js.Object {
  var next: AnonAlways = js.native
  var pushed: Boolean = js.native
  var refs: AnonQrmatrix = js.native
  var uuid: String = js.native
}

object XummPostPayloadResponse {
  @scala.inline
  def apply(next: AnonAlways, pushed: Boolean, refs: AnonQrmatrix, uuid: String): XummPostPayloadResponse = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pushed = pushed.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPostPayloadResponse]
  }
  @scala.inline
  implicit class XummPostPayloadResponseOps[Self <: XummPostPayloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: AnonAlways): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: AnonQrmatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

