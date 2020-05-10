package typingsSlinky.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `text` value of a row header that is applicable to this body cell. */
@js.native
trait RowHeaderTexts extends js.Object {
  /** The `text` value of a row header. */
  var text: js.UndefOr[String] = js.native
}

object RowHeaderTexts {
  @scala.inline
  def apply(): RowHeaderTexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowHeaderTexts]
  }
  @scala.inline
  implicit class RowHeaderTextsOps[Self <: RowHeaderTexts] (val x: Self) extends AnyVal {
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

