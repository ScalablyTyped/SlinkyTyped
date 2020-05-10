package typingsSlinky.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestLabData extends js.Object {
  var `test[cron]`: js.UndefOr[String] = js.native
  var `test[enabled]`: js.UndefOr[Boolean] = js.native
  var `test[name]`: js.UndefOr[String] = js.native
  var `test[url]`: js.UndefOr[String] = js.native
}

object TestLabData {
  @scala.inline
  def apply(): TestLabData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestLabData]
  }
  @scala.inline
  implicit class TestLabDataOps[Self <: TestLabData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withTest[cron]`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[cron]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[cron]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[cron]")(js.undefined)
        ret
    }
    @scala.inline
    def `withTest[enabled]`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[enabled]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[enabled]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[enabled]")(js.undefined)
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
    def `withTest[url]`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[url]")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTest[url]`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test[url]")(js.undefined)
        ret
    }
  }
  
}

