package typingsSlinky.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishAdvancedOptions extends AdvancedOptions {
  var eligible_authid: js.UndefOr[String | js.Array[String]] = js.native
  var eligible_authrole: js.UndefOr[String | js.Array[String]] = js.native
  var exclude_authid: js.UndefOr[String | js.Array[String]] = js.native
  var exclude_authrole: js.UndefOr[String | js.Array[String]] = js.native
}

object PublishAdvancedOptions {
  @scala.inline
  def apply(): PublishAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishAdvancedOptions]
  }
  @scala.inline
  implicit class PublishAdvancedOptionsOps[Self <: PublishAdvancedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEligible_authid(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible_authid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authid")(js.undefined)
        ret
    }
    @scala.inline
    def withEligible_authrole(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligible_authrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligible_authrole")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_authid(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_authid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authid")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude_authrole(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authrole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude_authrole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude_authrole")(js.undefined)
        ret
    }
  }
  
}

