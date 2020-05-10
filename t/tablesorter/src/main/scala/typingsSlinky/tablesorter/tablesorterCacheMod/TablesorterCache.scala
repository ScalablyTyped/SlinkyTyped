package typingsSlinky.tablesorter.tablesorterCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablesorterCache extends js.Object {
  /**
    * The maximal values of the columns.
    */
  var colMax: js.Array[_] = js.native
  /**
    * The normalized data.
    */
  var normalized: js.Array[_] = js.native
}

object TablesorterCache {
  @scala.inline
  def apply(colMax: js.Array[_], normalized: js.Array[_]): TablesorterCache = {
    val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterCache]
  }
  @scala.inline
  implicit class TablesorterCacheOps[Self <: TablesorterCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColMax(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalized(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

