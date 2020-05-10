package typingsSlinky.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkLoadColumnOpts extends ParameterOptions {
  //  Indicates whether the column accepts NULL values.
  var nullable: Boolean = js.native
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[String] = js.native
}

object BulkLoadColumnOpts {
  @scala.inline
  def apply(nullable: Boolean): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
  @scala.inline
  implicit class BulkLoadColumnOptsOps[Self <: BulkLoadColumnOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objName")(js.undefined)
        ret
    }
  }
  
}

