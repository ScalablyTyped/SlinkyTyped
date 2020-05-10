package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of PDF conversion settings. */
@js.native
trait PdfSettings extends js.Object {
  var heading: js.UndefOr[PdfHeadingDetection] = js.native
}

object PdfSettings {
  @scala.inline
  def apply(): PdfSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfSettings]
  }
  @scala.inline
  implicit class PdfSettingsOps[Self <: PdfSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeading(value: PdfHeadingDetection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
  }
  
}

