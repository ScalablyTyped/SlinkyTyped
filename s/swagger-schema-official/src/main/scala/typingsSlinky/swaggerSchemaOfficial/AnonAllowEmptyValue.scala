package typingsSlinky.swaggerSchemaOfficial

import typingsSlinky.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowEmptyValue extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
  var in: query = js.native
}

object AnonAllowEmptyValue {
  @scala.inline
  def apply(in: query): AnonAllowEmptyValue = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowEmptyValue]
  }
  @scala.inline
  implicit class AnonAllowEmptyValueOps[Self <: AnonAllowEmptyValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowEmptyValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEmptyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEmptyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionFormat(value: ParameterCollectionFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionFormat")(js.undefined)
        ret
    }
  }
  
}

