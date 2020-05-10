package typingsSlinky.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingBotOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.native
  var api_secret: js.UndefOr[String] = js.native
}

object TestingBotOptions {
  @scala.inline
  def apply(): TestingBotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingBotOptions]
  }
  @scala.inline
  implicit class TestingBotOptionsOps[Self <: TestingBotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_key")(js.undefined)
        ret
    }
    @scala.inline
    def withApi_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_secret")(js.undefined)
        ret
    }
  }
  
}

