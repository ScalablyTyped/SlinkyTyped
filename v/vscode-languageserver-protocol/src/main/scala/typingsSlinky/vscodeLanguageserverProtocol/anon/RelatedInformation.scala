package typingsSlinky.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedInformation extends js.Object {
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.native
}

object RelatedInformation {
  @scala.inline
  def apply(): RelatedInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedInformation]
  }
  @scala.inline
  implicit class RelatedInformationOps[Self <: RelatedInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedInformation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedInformation")(js.undefined)
        ret
    }
  }
  
}

