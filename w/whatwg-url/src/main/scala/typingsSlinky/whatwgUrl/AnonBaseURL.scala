package typingsSlinky.whatwgUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseURL extends js.Object {
  var baseURL: js.UndefOr[String] = js.native
  var encodingOverride: js.UndefOr[String] = js.native
}

object AnonBaseURL {
  @scala.inline
  def apply(): AnonBaseURL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseURL]
  }
  @scala.inline
  implicit class AnonBaseURLOps[Self <: AnonBaseURL] (val x: Self) extends AnyVal {
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

