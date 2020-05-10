package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkletOptions extends js.Object {
  var credentials: js.UndefOr[org.scalajs.dom.experimental.RequestCredentials] = js.native
}

object WorkletOptions {
  @scala.inline
  def apply(): WorkletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkletOptions]
  }
  @scala.inline
  implicit class WorkletOptionsOps[Self <: WorkletOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: org.scalajs.dom.experimental.RequestCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
  }
  
}

