package typingsSlinky.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  var update: typingsSlinky.vegaTypings.onEventsMod.Update = js.native
}

object Update {
  @scala.inline
  def apply(update: typingsSlinky.vegaTypings.onEventsMod.Update): Update = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdate(value: typingsSlinky.vegaTypings.onEventsMod.Update): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

