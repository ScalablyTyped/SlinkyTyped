package typingsSlinky.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available opts options for the tape function.
  */
@js.native
trait TestOptions extends js.Object {
  var skip: js.UndefOr[Boolean] = js.native
   // true/false. Test will be allowed to fail.
  var timeout: js.UndefOr[Double] = js.native
   // true/false. See test.skip.
  var todo: js.UndefOr[Boolean] = js.native
}

object TestOptions {
  @scala.inline
  def apply(): TestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOptions]
  }
  @scala.inline
  implicit class TestOptionsOps[Self <: TestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkip(value: Boolean): Self = {
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
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTodo(value: Boolean): Self = {
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

