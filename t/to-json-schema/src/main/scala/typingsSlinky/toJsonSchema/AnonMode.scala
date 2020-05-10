package typingsSlinky.toJsonSchema

import typingsSlinky.toJsonSchema.toJsonSchemaStrings.all
import typingsSlinky.toJsonSchema.toJsonSchemaStrings.first
import typingsSlinky.toJsonSchema.toJsonSchemaStrings.tuple
import typingsSlinky.toJsonSchema.toJsonSchemaStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMode extends js.Object {
  /**
    * * `all` option causes parser to go through all array items, finding
    *   the most compatible yet most descriptive schema possible. If
    *   multiple types are found, the type is omitted so it can be
    *   validated.
    * * `first` option takes only first item in the array into account. If
    *   performance is a concern, you may consider this option.
    * * `uniform` option requires all items in array to have same structure
    *   (to convert to the same schema). If not, error is thrown.
    * * `tuple` option generates a
    *   [tuple array](https://json-schema.org/understanding-json-schema/reference/array.html#tuple-validation)
    *   (array of objects) from arrays.
    *
    * @default 'all'
    */
  var mode: js.UndefOr[all | first | uniform | tuple] = js.native
}

object AnonMode {
  @scala.inline
  def apply(): AnonMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMode]
  }
  @scala.inline
  implicit class AnonModeOps[Self <: AnonMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: all | first | uniform | tuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

