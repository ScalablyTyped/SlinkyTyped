package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identification of a specific type. */
@js.native
trait TypeLabelComparison extends js.Object {
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.native
}

object TypeLabelComparison {
  @scala.inline
  def apply(): TypeLabelComparison = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabelComparison]
  }
  @scala.inline
  implicit class TypeLabelComparisonOps[Self <: TypeLabelComparison] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

