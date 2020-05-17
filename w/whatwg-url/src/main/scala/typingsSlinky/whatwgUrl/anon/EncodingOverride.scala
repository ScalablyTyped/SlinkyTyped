package typingsSlinky.whatwgUrl.anon

import typingsSlinky.whatwgUrl.mod.StateOverride
import typingsSlinky.whatwgUrl.mod.URLRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingOverride extends js.Object {
  var baseURL: js.UndefOr[String] = js.native
  var encodingOverride: js.UndefOr[String] = js.native
  var stateOverride: js.UndefOr[StateOverride] = js.native
  var url: js.UndefOr[URLRecord] = js.native
}

object EncodingOverride {
  @scala.inline
  def apply(): EncodingOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingOverride]
  }
  @scala.inline
  implicit class EncodingOverrideOps[Self <: EncodingOverride] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withStateOverride(value: StateOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: URLRecord): Self = {
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

