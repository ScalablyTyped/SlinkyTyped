package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarSdk.anon.Next
import typingsSlinky.stellarSdk.anon.Records
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: Records[T] = js.native
  var _links: Next = js.native
}

object ResponseCollection {
  @scala.inline
  def apply[T](_embedded: Records[T], _links: Next): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded.asInstanceOf[js.Any], _links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCollection[T]]
  }
  @scala.inline
  implicit class ResponseCollectionOps[Self[t] <: ResponseCollection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with_embedded(value: Records[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_embedded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_links(value: Next): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

