package typingsSlinky.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCellCssStylesChangedEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var hash: CellCssStylesHash = js.native
  var key: String = js.native
}

object OnCellCssStylesChangedEventArgs {
  @scala.inline
  def apply[T](grid: Grid[T], hash: CellCssStylesHash, key: String): OnCellCssStylesChangedEventArgs[T] = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCellCssStylesChangedEventArgs[T]]
  }
  @scala.inline
  implicit class OnCellCssStylesChangedEventArgsOps[Self[t] <: OnCellCssStylesChangedEventArgs[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHash(value: CellCssStylesHash): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

