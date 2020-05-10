package typingsSlinky.strophejsPluginRoster.mod.stropheAugmentingMod.Strophe

import typingsSlinky.strophejsPluginRoster.mod.StropheRosterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var roster: StropheRosterPlugin = js.native
}

object Connection {
  @scala.inline
  def apply(roster: StropheRosterPlugin): Connection = {
    val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoster(value: StropheRosterPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roster")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

