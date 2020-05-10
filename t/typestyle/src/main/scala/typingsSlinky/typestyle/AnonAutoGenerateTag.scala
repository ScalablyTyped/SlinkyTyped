package typingsSlinky.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoGenerateTag extends js.Object {
  var autoGenerateTag: Boolean = js.native
}

object AnonAutoGenerateTag {
  @scala.inline
  def apply(autoGenerateTag: Boolean): AnonAutoGenerateTag = {
    val __obj = js.Dynamic.literal(autoGenerateTag = autoGenerateTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoGenerateTag]
  }
  @scala.inline
  implicit class AnonAutoGenerateTagOps[Self <: AnonAutoGenerateTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoGenerateTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGenerateTag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

