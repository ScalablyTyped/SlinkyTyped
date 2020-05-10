package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PdfHeadingDetection. */
@js.native
trait PdfHeadingDetection extends js.Object {
  var fonts: js.UndefOr[js.Array[FontSetting]] = js.native
}

object PdfHeadingDetection {
  @scala.inline
  def apply(): PdfHeadingDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PdfHeadingDetection]
  }
  @scala.inline
  implicit class PdfHeadingDetectionOps[Self <: PdfHeadingDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFonts(value: js.Array[FontSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
  }
  
}

