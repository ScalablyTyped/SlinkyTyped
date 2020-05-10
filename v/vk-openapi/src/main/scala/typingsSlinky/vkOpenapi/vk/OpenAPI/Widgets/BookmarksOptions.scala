package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`18`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`20`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`22`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`24`
import typingsSlinky.vkOpenapi.vkOpenapiNumbers.`30`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarksOptions extends js.Object {
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.native
  var url: js.UndefOr[String] = js.native
}

object BookmarksOptions {
  @scala.inline
  def apply(): BookmarksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksOptions]
  }
  @scala.inline
  implicit class BookmarksOptionsOps[Self <: BookmarksOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: `18` | `20` | `22` | `24` | `30`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

