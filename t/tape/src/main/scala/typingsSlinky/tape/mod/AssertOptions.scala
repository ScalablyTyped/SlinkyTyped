package typingsSlinky.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available options for tape assertions.
  */
@js.native
trait AssertOptions extends js.Object {
   // Allows the assertion to fail.
  var message: js.UndefOr[String] = js.native
  var skip: js.UndefOr[Boolean | String] = js.native
   // Skip the assertion. Can also be a message explaining why the test is skipped.
  var todo: js.UndefOr[Boolean | String] = js.native
}

object AssertOptions {
  @scala.inline
  def apply(): AssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertOptions]
  }
  @scala.inline
  implicit class AssertOptionsOps[Self <: AssertOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withTodo(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todo")(js.undefined)
        ret
    }
  }
  
}

