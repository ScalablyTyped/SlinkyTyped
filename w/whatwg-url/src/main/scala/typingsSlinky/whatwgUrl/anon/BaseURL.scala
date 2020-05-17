package typingsSlinky.whatwgUrl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseURL extends js.Object {
  var baseURL: js.UndefOr[String] = js.native
  var encodingOverride: js.UndefOr[String] = js.native
}

object BaseURL {
  @scala.inline
  def apply(): BaseURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseURL]
  }
  @scala.inline
  implicit class BaseURLOps[Self <: BaseURL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodingOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodingOverride")(js.undefined)
        ret
    }
  }
  
}

