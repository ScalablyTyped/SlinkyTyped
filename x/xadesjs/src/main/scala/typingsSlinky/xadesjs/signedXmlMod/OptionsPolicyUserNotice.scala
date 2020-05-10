package typingsSlinky.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPolicyUserNotice extends js.Object {
  var explicitText: js.UndefOr[String] = js.native
  var noticeRef: js.UndefOr[OptionsNoticeReference] = js.native
}

object OptionsPolicyUserNotice {
  @scala.inline
  def apply(): OptionsPolicyUserNotice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsPolicyUserNotice]
  }
  @scala.inline
  implicit class OptionsPolicyUserNoticeOps[Self <: OptionsPolicyUserNotice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicitText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitText")(js.undefined)
        ret
    }
    @scala.inline
    def withNoticeRef(value: OptionsNoticeReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noticeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoticeRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noticeRef")(js.undefined)
        ret
    }
  }
  
}

