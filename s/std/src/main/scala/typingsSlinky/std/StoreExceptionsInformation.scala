package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreExceptionsInformation extends ExceptionInformation {
  var detailURI: js.UndefOr[java.lang.String | Null] = js.native
  var explanationString: js.UndefOr[java.lang.String | Null] = js.native
  var siteName: js.UndefOr[java.lang.String | Null] = js.native
}

object StoreExceptionsInformation {
  @scala.inline
  def apply(): StoreExceptionsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreExceptionsInformation]
  }
  @scala.inline
  implicit class StoreExceptionsInformationOps[Self <: StoreExceptionsInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetailURI(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailURI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailURI")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailURINull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailURI")(null)
        ret
    }
    @scala.inline
    def withExplanationString(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanationString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplanationString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanationString")(js.undefined)
        ret
    }
    @scala.inline
    def withExplanationStringNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanationString")(null)
        ret
    }
    @scala.inline
    def withSiteName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteName")(null)
        ret
    }
  }
  
}

