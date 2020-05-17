package typingsSlinky.xss.mod.global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICSSFilter extends js.Object {
  def process(value: String): String = js.native
}

object ICSSFilter {
  @scala.inline
  def apply(process: String => String): ICSSFilter = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[ICSSFilter]
  }
  @scala.inline
  implicit class ICSSFilterOps[Self <: ICSSFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcess(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

