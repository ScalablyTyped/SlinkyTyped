package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `id` value of a row header that is applicable to this body cell. */
@js.native
trait RowHeaderIds extends js.Object {
  /** The `id` values of a row header. */
  var id: js.UndefOr[String] = js.native
}

object RowHeaderIds {
  @scala.inline
  def apply(): RowHeaderIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderIds]
  }
  @scala.inline
  implicit class RowHeaderIdsOps[Self <: RowHeaderIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

