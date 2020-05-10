package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined sparkpost.sparkpost.WebhookLinks & {  id  :string} */
@js.native
trait WebhookLinksidstring extends js.Object {
  var id: String = js.native
  var links: js.Array[AnonHref] = js.native
}

object WebhookLinksidstring {
  @scala.inline
  def apply(id: String, links: js.Array[AnonHref]): WebhookLinksidstring = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookLinksidstring]
  }
  @scala.inline
  implicit class WebhookLinksidstringOps[Self <: WebhookLinksidstring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[AnonHref]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

