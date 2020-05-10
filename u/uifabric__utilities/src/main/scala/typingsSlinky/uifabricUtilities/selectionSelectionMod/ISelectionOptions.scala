package typingsSlinky.uifabricUtilities.selectionSelectionMod

import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionOptions[TItem] extends js.Object {
  var canSelectItem: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], Boolean]] = js.native
  /** Custom logic to generate item keys. Required if `TItem` does not have a `key` property. */
  var getKey: js.UndefOr[js.Function2[/* item */ TItem, /* index */ js.UndefOr[Double], String | Double]] = js.native
  var onSelectionChanged: js.UndefOr[js.Function0[Unit]] = js.native
  var selectionMode: js.UndefOr[SelectionMode] = js.native
}

object ISelectionOptions {
  @scala.inline
  def apply[TItem](): ISelectionOptions[TItem] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectionOptions[TItem]]
  }
  @scala.inline
  implicit class ISelectionOptionsOps[Self[titem] <: ISelectionOptions[titem], TItem] (val x: Self[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TItem] with Other]
    @scala.inline
    def withCanSelectItem(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCanSelectItem: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectItem")(js.undefined)
        ret
    }
    @scala.inline
    def withGetKey(value: (/* item */ TItem, /* index */ js.UndefOr[Double]) => String | Double): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: () => Unit): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
  }
  
}

