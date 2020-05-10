package typingsSlinky.sequelize

import typingsSlinky.sequelize.mod.Model
import typingsSlinky.sequelize.mod.TransactionLockLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLevel extends js.Object {
  var level: TransactionLockLevel = js.native
  var of: Model[_, _, _] = js.native
}

object AnonLevel {
  @scala.inline
  def apply(level: TransactionLockLevel, of: Model[_, _, _]): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
  @scala.inline
  implicit class AnonLevelOps[Self <: AnonLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: TransactionLockLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOf(value: Model[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("of")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

