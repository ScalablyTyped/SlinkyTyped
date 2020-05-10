package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.`0`
import typingsSlinky.uniApp.uniAppStrings.`1`
import typingsSlinky.uniApp.uniAppStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiniProgramShareOptions extends js.Object {
  /**
    * 微信小程序原始id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * 点击链接进入的页面
    */
  var path: js.UndefOr[String] = js.native
  /**
    * 微信小程序版本类型，默认为0。
    * - 0: 正式版
    * - 1: 测试版
    * - 2: 体验版
    */
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
  /**
    * 兼容低版本的网页链接
    */
  var webUrl: js.UndefOr[String] = js.native
}

object MiniProgramShareOptions {
  @scala.inline
  def apply(): MiniProgramShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiniProgramShareOptions]
  }
  @scala.inline
  implicit class MiniProgramShareOptionsOps[Self <: MiniProgramShareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

