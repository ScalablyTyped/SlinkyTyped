package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceGroupOptions extends js.Object {
  var groupBy: js.UndefOr[Boolean] = js.native
  var groupHeader: js.UndefOr[Boolean] = js.native
  var groupStartOpen: js.UndefOr[Boolean] = js.native
}

object PersistenceGroupOptions {
  @scala.inline
  def apply(): PersistenceGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceGroupOptions]
  }
  @scala.inline
  implicit class PersistenceGroupOptionsOps[Self <: PersistenceGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupStartOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupStartOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupStartOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupStartOpen")(js.undefined)
        ret
    }
  }
  
}

