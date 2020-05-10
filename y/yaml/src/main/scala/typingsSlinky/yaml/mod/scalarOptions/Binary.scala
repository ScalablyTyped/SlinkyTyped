package typingsSlinky.yaml.mod.scalarOptions

import typingsSlinky.yaml.typesMod.Scalar.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binary extends js.Object {
  /**
    * The type of string literal used to stringify `!!binary` values.
    *
    * Default: `'BLOCK_LITERAL'`
    */
  var defaultType: Type = js.native
  /**
    * Maximum line width for `!!binary`.
    *
    * Default: `76`
    */
  var lineWidth: Double = js.native
}

object Binary {
  @scala.inline
  def apply(defaultType: Type, lineWidth: Double): Binary = {
    val __obj = js.Dynamic.literal(defaultType = defaultType.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  implicit class BinaryOps[Self <: Binary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

