package typingsSlinky.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestData extends js.Object {
  var build: js.UndefOr[String] = js.native
  var groups: js.UndefOr[String] = js.native
  var `test[extra]`: js.UndefOr[String] = js.native
  var `test[name]`: js.UndefOr[String] = js.native
  var `test[status_message]`: js.UndefOr[String] = js.native
  var `test[success]`: js.UndefOr[TestSuccess] = js.native
}

object TestData {
  @scala.inline
  def apply(): TestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestData]
  }
  @scala.inline
  implicit class TestDataOps[Self <: TestData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def `withTest[extra]`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[extra]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[extra]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[extra]")(js.undefined)
        ret
    }
    @scala.inline
    def `withTest[name]`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[name]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[name]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[name]")(js.undefined)
        ret
    }
    @scala.inline
    def `withTest[status_message]`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[status_message]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[status_message]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[status_message]")(js.undefined)
        ret
    }
    @scala.inline
    def `withTest[success]`(value: TestSuccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[success]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[success]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[success]")(js.undefined)
        ret
    }
  }
  
}

