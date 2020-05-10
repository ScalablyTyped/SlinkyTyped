package typingsSlinky.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsNoticeReference extends js.Object {
  var noticeNumbers: js.Array[Double] = js.native
  var organization: String = js.native
}

object OptionsNoticeReference {
  @scala.inline
  def apply(noticeNumbers: js.Array[Double], organization: String): OptionsNoticeReference = {
    val __obj = js.Dynamic.literal(noticeNumbers = noticeNumbers.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNoticeReference]
  }
  @scala.inline
  implicit class OptionsNoticeReferenceOps[Self <: OptionsNoticeReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoticeNumbers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noticeNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

