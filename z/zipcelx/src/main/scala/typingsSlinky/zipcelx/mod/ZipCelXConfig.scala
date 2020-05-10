package typingsSlinky.zipcelx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipCelXConfig extends js.Object {
  /**
    * The file name of the exported file
    */
  var filename: String = js.native
  /**
    * The sheet to be exported as an .xlsx file
    */
  var sheet: ZipCelXSheet = js.native
}

object ZipCelXConfig {
  @scala.inline
  def apply(filename: String, sheet: ZipCelXSheet): ZipCelXConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXConfig]
  }
  @scala.inline
  implicit class ZipCelXConfigOps[Self <: ZipCelXConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet(value: ZipCelXSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

