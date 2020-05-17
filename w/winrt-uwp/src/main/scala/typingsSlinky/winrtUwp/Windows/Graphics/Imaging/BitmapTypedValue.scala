package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A value along with an enumeration specifying its data type. */
@js.native
trait BitmapTypedValue extends js.Object {
  /** Gets the PropertyType of the stored value. */
  var `type`: PropertyType = js.native
  /** Gets the stored value. */
  var value: js.Any = js.native
}

object BitmapTypedValue {
  @scala.inline
  def apply(`type`: PropertyType, value: js.Any): BitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTypedValue]
  }
  @scala.inline
  implicit class BitmapTypedValueOps[Self <: BitmapTypedValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: PropertyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

