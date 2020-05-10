package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.PartialTestMessageParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOptions[P /* <: Record[String, _] */, R] extends js.Object {
  /**
    * Mark the test as exclusive, meaning only one of the same can be active at once
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    * The validation error message
    */
  var message: js.UndefOr[TestOptionsMessage[P, R]] = js.native
  /**
    * Unique name identifying the test
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Values passed to message for interpolation
    */
  var params: js.UndefOr[P] = js.native
  /**
    * Test function, determines schema validity
    */
  def test(value: js.Any): Boolean | ValidationError | (js.Promise[Boolean | ValidationError]) = js.native
}

object TestOptions {
  @scala.inline
  def apply[P, R](test: js.Any => Boolean | ValidationError | (js.Promise[Boolean | ValidationError])): TestOptions[P, R] = {
    val __obj = js.Dynamic.literal(test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[TestOptions[P, R]]
  }
  @scala.inline
  implicit class TestOptionsOps[Self[p, r] <: TestOptions[p, r], P, R] (val x: Self[P, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, R]) with Other]
    @scala.inline
    def withTest(value: js.Any => Boolean | ValidationError | (js.Promise[Boolean | ValidationError])): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFunction1(value: /* params */ P with PartialTestMessageParams => R): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(value: TestOptionsMessage[P, R]): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: P): Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self[P, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
  }
  
}

