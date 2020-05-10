package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field. */
@js.native
trait Field extends js.Object {
  /** The name of the field. */
  var field_name: js.UndefOr[String] = js.native
  /** The type of the field. */
  var field_type: js.UndefOr[String] = js.native
}

object Field {
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_name")(js.undefined)
        ret
    }
    @scala.inline
    def withField_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_type")(js.undefined)
        ret
    }
  }
  
}

