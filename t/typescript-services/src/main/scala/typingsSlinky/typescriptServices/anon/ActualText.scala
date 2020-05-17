package typingsSlinky.typescriptServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActualText extends js.Object {
  var actualText: String = js.native
  var memberName: String = js.native
}

object ActualText {
  @scala.inline
  def apply(actualText: String, memberName: String): ActualText = {
    val __obj = js.Dynamic.literal(actualText = actualText.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActualText]
  }
  @scala.inline
  implicit class ActualTextOps[Self <: ActualText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

