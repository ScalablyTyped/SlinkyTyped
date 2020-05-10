package typingsSlinky.shopifyPrime.optionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOptions extends js.Object {
  /**
    * A comma-separated list of fields that will be returned instead of the whole object.
    */
  var fields: js.UndefOr[String] = js.native
}

object FieldOptions {
  @scala.inline
  def apply(): FieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldOptions]
  }
  @scala.inline
  implicit class FieldOptionsOps[Self <: FieldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
  }
  
}

