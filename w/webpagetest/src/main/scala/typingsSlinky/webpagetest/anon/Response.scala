package typingsSlinky.webpagetest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var response: typingsSlinky.webpagetest.mod.Response[Location]
}

object Response {
  @scala.inline
  def apply(response: typingsSlinky.webpagetest.mod.Response[Location]): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

