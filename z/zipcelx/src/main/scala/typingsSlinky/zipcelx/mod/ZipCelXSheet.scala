package typingsSlinky.zipcelx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipCelXSheet extends js.Object {
  /**
    * The sheet's DataSet
    */
  var data: ZipCelXDataSet = js.native
}

object ZipCelXSheet {
  @scala.inline
  def apply(data: ZipCelXDataSet): ZipCelXSheet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXSheet]
  }
  @scala.inline
  implicit class ZipCelXSheetOps[Self <: ZipCelXSheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ZipCelXDataSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

