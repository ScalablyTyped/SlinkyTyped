package typingsSlinky.urijs.mod.global

import typingsSlinky.urijs.mod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def uri(): URI = js.native
}

object JQuery {
  @scala.inline
  def apply(uri: () => URI): JQuery = {
    val __obj = js.Dynamic.literal(uri = js.Any.fromFunction0(uri))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: () => URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

