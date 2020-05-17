package typingsSlinky.winrtUwp.Windows.Globalization.Collation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
@js.native
trait CharacterGrouping extends js.Object {
  /** Gets the first item that appears in the grouping under this index. */
  var first: String = js.native
  /** Gets the label that is associated with this index. */
  var label: String = js.native
}

object CharacterGrouping {
  @scala.inline
  def apply(first: String, label: String): CharacterGrouping = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterGrouping]
  }
  @scala.inline
  implicit class CharacterGroupingOps[Self <: CharacterGrouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

