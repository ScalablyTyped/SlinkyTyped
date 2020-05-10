package typingsSlinky.umzug.mod

import typingsSlinky.umzug.umzugNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownToOptions extends js.Object {
  /**
    * It is also possible to pass the name of a migration in order to
    * just run the migrations from the current state to the passed
    * migration name. down allows to pass 0 to revert everything.
    */
  var to: String | `0` = js.native
}

object DownToOptions {
  @scala.inline
  def apply(to: String | `0`): DownToOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownToOptions]
  }
  @scala.inline
  implicit class DownToOptionsOps[Self <: DownToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: String | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

