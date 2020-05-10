package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `text` value of a column header that is applicable to the current cell. */
@js.native
trait ColumnHeaderTexts extends js.Object {
  /** The `text` value of a column header. */
  var text: js.UndefOr[String] = js.native
}

object ColumnHeaderTexts {
  @scala.inline
  def apply(): ColumnHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnHeaderTexts]
  }
  @scala.inline
  implicit class ColumnHeaderTextsOps[Self <: ColumnHeaderTexts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

