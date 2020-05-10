package typingsSlinky.snabbdom

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelayed extends js.Object {
  var delayed: js.UndefOr[Record[String, String]] = js.native
  var remove: js.UndefOr[Record[String, String]] = js.native
}

object AnonDelayed {
  @scala.inline
  def apply(): AnonDelayed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDelayed]
  }
  @scala.inline
  implicit class AnonDelayedOps[Self <: AnonDelayed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayed(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayed")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

