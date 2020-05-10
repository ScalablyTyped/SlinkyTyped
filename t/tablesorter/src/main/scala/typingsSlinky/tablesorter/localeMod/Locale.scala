package typingsSlinky.tablesorter.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  /**
    * The text to show for applying ascending sorting.
    */
  var nextAsc: String = js.native
  /**
    * The text to show for applying descending sorting.
    */
  var nextDesc: String = js.native
  /**
    * The text to show for disabling sorting.
    */
  var nextNone: String = js.native
  /**
    * The text to show for ascending sorting.
    */
  var sortAsc: String = js.native
  /**
    * The text to show for descending sorting.
    */
  var sortDesc: String = js.native
  /**
    * The text to show for disabled sorting.
    */
  var sortDisabled: String = js.native
  /**
    * The text to show for non-sorted columns.
    */
  var sortNone: String = js.native
}

object Locale {
  @scala.inline
  def apply(
    nextAsc: String,
    nextDesc: String,
    nextNone: String,
    sortAsc: String,
    sortDesc: String,
    sortDisabled: String,
    sortNone: String
  ): Locale = {
    val __obj = js.Dynamic.literal(nextAsc = nextAsc.asInstanceOf[js.Any], nextDesc = nextDesc.asInstanceOf[js.Any], nextNone = nextNone.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any], sortDesc = sortDesc.asInstanceOf[js.Any], sortDisabled = sortDisabled.asInstanceOf[js.Any], sortNone = sortNone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortNone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

