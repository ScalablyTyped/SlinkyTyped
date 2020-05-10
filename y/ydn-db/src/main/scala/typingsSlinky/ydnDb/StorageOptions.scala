package typingsSlinky.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageOptions extends js.Object {
  var autoSchema: js.UndefOr[Boolean] = js.native
  var isSerial: js.UndefOr[Boolean] = js.native
  var mechanisms: js.UndefOr[js.Array[String]] = js.native
  var requestType: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
}

object StorageOptions {
  @scala.inline
  def apply(): StorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptions]
  }
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSchema(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSerial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSerial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSerial")(js.undefined)
        ret
    }
    @scala.inline
    def withMechanisms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanisms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMechanisms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanisms")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

