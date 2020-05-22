package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarSdk.anon.Next
import typingsSlinky.stellarSdk.anon.Records
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseCollection[T /* <: BaseResponse[scala.Nothing] */] extends js.Object {
  var _embedded: Records[T]
  var _links: Next
}

object ResponseCollection {
  @scala.inline
  def apply[T](_embedded: Records[T], _links: Next): ResponseCollection[T] = {
    val __obj = js.Dynamic.literal(_embedded = _embedded.asInstanceOf[js.Any], _links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCollection[T]]
  }
}

