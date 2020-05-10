package typingsSlinky.xss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnIgnoreTag extends js.Object {
  def onIgnoreTag(tag: String, html: String, options: AnonIsClosing): String = js.native
  def remove(html: String): String = js.native
}

object AnonOnIgnoreTag {
  @scala.inline
  def apply(onIgnoreTag: (String, String, AnonIsClosing) => String, remove: String => String): AnonOnIgnoreTag = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[AnonOnIgnoreTag]
  }
  @scala.inline
  implicit class AnonOnIgnoreTagOps[Self <: AnonOnIgnoreTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnIgnoreTag(value: (String, String, AnonIsClosing) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnoreTag")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRemove(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

