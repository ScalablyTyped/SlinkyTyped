package typingsSlinky.toTitleCaseGouch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  def toTitleCase(): java.lang.String = js.native
}

object String {
  @scala.inline
  def apply(toTitleCase: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(toTitleCase = js.Any.fromFunction0(toTitleCase))
    __obj.asInstanceOf[String]
  }
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToTitleCase(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toTitleCase")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

