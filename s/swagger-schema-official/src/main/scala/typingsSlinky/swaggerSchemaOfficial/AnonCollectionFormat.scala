package typingsSlinky.swaggerSchemaOfficial

import typingsSlinky.swaggerSchemaOfficial.mod.ParameterCollectionFormat
import typingsSlinky.swaggerSchemaOfficial.mod.ParameterType
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.file
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCollectionFormat extends js.Object {
  var allowEmptyValue: js.UndefOr[Boolean] = js.native
  var collectionFormat: js.UndefOr[ParameterCollectionFormat] = js.native
  var in: formData = js.native
  var `type`: ParameterType | file = js.native
}

object AnonCollectionFormat {
  @scala.inline
  def apply(in: formData, `type`: ParameterType | file): AnonCollectionFormat = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionFormat]
  }
  @scala.inline
  implicit class AnonCollectionFormatOps[Self <: AnonCollectionFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: formData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ParameterType | file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

