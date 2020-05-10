package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.OperationType.CreateAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccount_ extends BaseOperation[CreateAccount] {
  var destination: String = js.native
  var startingBalance: String = js.native
}

object CreateAccount_ {
  @scala.inline
  def apply(destination: String, startingBalance: String, `type`: CreateAccount): CreateAccount_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount_]
  }
  @scala.inline
  implicit class CreateAccount_Ops[Self <: CreateAccount_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartingBalance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingBalance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

