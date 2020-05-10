package typingsSlinky.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet
  extends /**
  * Indexing with a cell address string maps to a cell object
  * Special keys start with '!'
  */
/* cell */ StringDictionary[CellObject | SheetKeys | js.Any] {
  /** Page Margins */
  @JSName("!margins")
  var Exclamationmarkmargins: js.UndefOr[MarginInfo] = js.native
  /** Sheet Range */
  @JSName("!ref")
  var Exclamationmarkref: js.UndefOr[String] = js.native
  /** Sheet type */
  @JSName("!type")
  var Exclamationmarktype: js.UndefOr[SheetType] = js.native
}

object Sheet {
  @scala.inline
  def apply(): Sheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclamationmarkmargins(value: MarginInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkmargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!margins")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarkref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarkref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!ref")(js.undefined)
        ret
    }
    @scala.inline
    def withExclamationmarktype(value: SheetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclamationmarktype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("!type")(js.undefined)
        ret
    }
  }
  
}

