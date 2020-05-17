package typingsSlinky.yup.mod

import typingsSlinky.std.Record
import typingsSlinky.yup.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDescription extends SchemaFieldDescription {
  var fields: Record[String, SchemaFieldDescription] = js.native
  var label: String = js.native
  var meta: js.Object = js.native
  var tests: js.Array[Name] = js.native
  var `type`: String = js.native
}

object SchemaDescription {
  @scala.inline
  def apply(
    fields: Record[String, SchemaFieldDescription],
    label: String,
    meta: js.Object,
    tests: js.Array[Name],
    `type`: String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDescription]
  }
  @scala.inline
  implicit class SchemaDescriptionOps[Self <: SchemaDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: Record[String, SchemaFieldDescription]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withTests(value: js.Array[Name]): Self = {
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
  }
  
}

