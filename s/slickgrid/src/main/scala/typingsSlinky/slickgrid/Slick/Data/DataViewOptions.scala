package typingsSlinky.slickgrid.Slick.Data

import typingsSlinky.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataViewOptions[T /* <: SlickData */] extends js.Object {
  var groupItemMetadataProvider: js.UndefOr[GroupItemMetadataProvider[T]] = js.native
  var inlineFilters: js.UndefOr[Boolean] = js.native
}

object DataViewOptions {
  @scala.inline
  def apply[T](): DataViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewOptions[T]]
  }
  @scala.inline
  implicit class DataViewOptionsOps[Self[t] <: DataViewOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGroupItemMetadataProvider(value: GroupItemMetadataProvider[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItemMetadataProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupItemMetadataProvider: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItemMetadataProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineFilters(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineFilters: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineFilters")(js.undefined)
        ret
    }
  }
  
}

