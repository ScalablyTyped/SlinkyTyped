package typingsSlinky.wordpressApiFetch.mod.Schema

import typingsSlinky.std.Record
import typingsSlinky.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResponse extends js.Object {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var _links: Record[String, js.Array[Dictk]] = js.native
}

object BaseResponse {
  @scala.inline
  def apply(_links: Record[String, js.Array[Dictk]]): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  @scala.inline
  implicit class BaseResponseOps[Self <: BaseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: Record[String, js.Array[Dictk]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_embedded(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_embedded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(js.undefined)
        ret
    }
  }
  
}

