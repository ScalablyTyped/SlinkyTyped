package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identification of a specific type. */
@js.native
trait TypeLabel extends js.Object {
  /** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
  var label: js.UndefOr[Label] = js.native
  /** One or more hash values that you can send to IBM to provide feedback or receive support. */
  var provenance_ids: js.UndefOr[js.Array[String]] = js.native
}

object TypeLabel {
  @scala.inline
  def apply(): TypeLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeLabel]
  }
  @scala.inline
  implicit class TypeLabelOps[Self <: TypeLabel] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withProvenance_ids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenance_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenance_ids")(js.undefined)
        ret
    }
  }
  
}

