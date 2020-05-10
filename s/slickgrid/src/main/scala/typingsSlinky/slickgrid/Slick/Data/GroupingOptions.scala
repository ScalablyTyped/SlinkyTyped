package typingsSlinky.slickgrid.Slick.Data

import typingsSlinky.slickgrid.Slick.Data.Aggregators.Aggregator
import typingsSlinky.slickgrid.Slick.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupingOptions[T] extends js.Object {
  var aggregateChildGroups: js.UndefOr[Boolean] = js.native
  var aggregateCollapsed: js.UndefOr[Boolean] = js.native
  var aggregateEmpty: js.UndefOr[Boolean] = js.native
  	// todo
  var aggregators: js.UndefOr[js.Array[Aggregator[T]]] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var comparer: js.UndefOr[js.Function2[/* a */ Group[T], /* b */ Group[T], Double]] = js.native
  var displayTotalsRow: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], String]] = js.native
  var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], _]) | String] = js.native
  var predefinedValues: js.UndefOr[js.Array[_]] = js.native
}

object GroupingOptions {
  @scala.inline
  def apply[T](): GroupingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupingOptions[T]]
  }
  @scala.inline
  implicit class GroupingOptionsOps[Self[t] <: GroupingOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAggregateChildGroups(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateChildGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateChildGroups: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateChildGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateCollapsed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateCollapsed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateEmpty(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregateEmpty: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregateEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregators(value: js.Array[Aggregator[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregators: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregators")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withComparer(value: (/* a */ Group[T], /* b */ Group[T]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComparer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTotalsRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotalsRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTotalsRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTotalsRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* item */ js.UndefOr[T] => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetterFunction1(value: /* item */ js.UndefOr[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetter(value: (js.Function1[/* item */ js.UndefOr[T], _]) | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedValues(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedValues: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedValues")(js.undefined)
        ret
    }
  }
  
}

