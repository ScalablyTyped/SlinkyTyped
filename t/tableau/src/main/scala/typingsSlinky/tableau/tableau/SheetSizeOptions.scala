package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetSizeOptions extends js.Object {
  /** Contains an enumeration value of one of the following: AUTOMATIC, EXACTLY, RANGE, ATLEAST, and ATMOST. */
  var behavior: SheetSizeBehaviour = js.native
  /** This is only defined when behavior is EXACTLY, RANGE or ATMOST. */
  var maxSize: Double = js.native
  /** This is only defined when behavior is EXACTLY, RANGE, or ATLEAST. */
  var minSize: Double = js.native
}

object SheetSizeOptions {
  @scala.inline
  def apply(behavior: SheetSizeBehaviour, maxSize: Double, minSize: Double): SheetSizeOptions = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetSizeOptions]
  }
  @scala.inline
  implicit class SheetSizeOptionsOps[Self <: SheetSizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehavior(value: SheetSizeBehaviour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

