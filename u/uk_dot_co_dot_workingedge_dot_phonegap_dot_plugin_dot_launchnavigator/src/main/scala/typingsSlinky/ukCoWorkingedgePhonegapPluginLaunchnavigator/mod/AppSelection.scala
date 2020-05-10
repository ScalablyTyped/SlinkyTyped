package typingsSlinky.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSelection extends js.Object {
  var userChoice: UserChoice = js.native
  var userPrompted: UserPrompted = js.native
}

object AppSelection {
  @scala.inline
  def apply(userChoice: UserChoice, userPrompted: UserPrompted): AppSelection = {
    val __obj = js.Dynamic.literal(userChoice = userChoice.asInstanceOf[js.Any], userPrompted = userPrompted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSelection]
  }
  @scala.inline
  implicit class AppSelectionOps[Self <: AppSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserChoice(value: UserChoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userChoice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPrompted(value: UserPrompted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPrompted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

