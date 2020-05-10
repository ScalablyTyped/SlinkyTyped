package typingsSlinky.tablesorter.matchTypeSettingsMod

import typingsSlinky.tablesorter.matchTypeMod.MatchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchTypeSettings extends js.Object {
  /**
    * The match-type for `input`-controls.
    */
  var input: js.UndefOr[MatchType] = js.native
  /**
    * The match-type for `select`-controls.
    */
  var select: js.UndefOr[MatchType] = js.native
}

object MatchTypeSettings {
  @scala.inline
  def apply(): MatchTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchTypeSettings]
  }
  @scala.inline
  implicit class MatchTypeSettingsOps[Self <: MatchTypeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: MatchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: MatchType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
  }
  
}

