package typingsSlinky.tablesorter.testableOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestableOptions extends js.Object {
  /**
    * A value indicating whether tests should be skipped.
    */
  var skipTest: js.UndefOr[Boolean] = js.native
}

object TestableOptions {
  @scala.inline
  def apply(): TestableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestableOptions]
  }
  @scala.inline
  implicit class TestableOptionsOps[Self <: TestableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkipTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipTest")(js.undefined)
        ret
    }
  }
  
}

