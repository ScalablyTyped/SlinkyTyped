package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.anon.Cancelled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummDeletePayloadResponse extends js.Object {
  var custom_meta: XummCustomMeta = js.native
  var meta: XummPayloadMeta = js.native
  var result: Cancelled = js.native
}

object XummDeletePayloadResponse {
  @scala.inline
  def apply(custom_meta: XummCustomMeta, meta: XummPayloadMeta, result: Cancelled): XummDeletePayloadResponse = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummDeletePayloadResponse]
  }
  @scala.inline
  implicit class XummDeletePayloadResponseOps[Self <: XummDeletePayloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_meta(value: XummCustomMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: XummPayloadMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Cancelled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

