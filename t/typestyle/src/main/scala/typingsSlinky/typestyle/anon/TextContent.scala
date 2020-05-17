package typingsSlinky.typestyle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContent extends js.Object {
  var textContent: String | Null = js.native
}

object TextContent {
  @scala.inline
  def apply(): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContent]
  }
  @scala.inline
  implicit class TextContentOps[Self <: TextContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContent")(null)
        ret
    }
  }
  
}

