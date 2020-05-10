package typingsSlinky.yup.mod

import typingsSlinky.yup.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<yup.yup.SchemaDescription, std.Exclude<keyof yup.yup.SchemaDescription, 'fields'>> */
@js.native
trait SchemaFieldInnerTypeDescription extends SchemaFieldDescription {
  var innerType: js.UndefOr[SchemaFieldDescription] = js.native
  var label: String = js.native
  var meta: js.Object = js.native
  var tests: js.Array[AnonName] = js.native
  var `type`: String = js.native
}

object SchemaFieldInnerTypeDescription {
  @scala.inline
  def apply(label: String, meta: js.Object, tests: js.Array[AnonName], `type`: String): SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldInnerTypeDescription]
  }
  @scala.inline
  implicit class SchemaFieldInnerTypeDescriptionOps[Self <: SchemaFieldInnerTypeDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTests(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerType(value: SchemaFieldDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerType")(js.undefined)
        ret
    }
  }
  
}

