package typingsSlinky.yup

import typingsSlinky.yup.mod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIs extends js.Object {
  var is: WhenOptionsBuilderObjectIs = js.native
  var otherwise: js.Any = js.native
  var `then`: js.Any = js.native
}

object AnonIs {
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any): AnonIs = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIs]
  }
  @scala.inline
  implicit class AnonIsOps[Self <: AnonIs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOtherwise(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFunction1(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIs(value: WhenOptionsBuilderObjectIs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(null)
        ret
    }
  }
  
}

