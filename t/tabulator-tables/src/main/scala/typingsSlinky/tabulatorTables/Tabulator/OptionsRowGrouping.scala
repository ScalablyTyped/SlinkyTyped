package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.arrow
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsRowGrouping extends js.Object {
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, after grouping happens. */
  var dataGrouped: js.UndefOr[js.Function0[Unit]] = js.native
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens. */
  var dataGrouping: js.UndefOr[js.Function0[Unit]] = js.native
  /** String/function to select field to group rows by	 */
  var groupBy: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  /** The groupClick callback is triggered when a user clicks on a group header. */
  var groupClick: js.UndefOr[GroupEventCallback] = js.native
  /** show/hide column calculations when group is closed	 */
  var groupClosedShowCalcs: js.UndefOr[Boolean] = js.native
  /** The groupContext callback is triggered when a user right clicks on a group header.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var groupContext: js.UndefOr[GroupEventCallback] = js.native
  /** The groupDblClick callback is triggered when a user double clicks on a group header. */
  var groupDblClick: js.UndefOr[GroupEventCallback] = js.native
  /** The groupDblTap callback is triggered when a user taps on a group header on a touch display twice in under 300ms. */
  var groupDblTap: js.UndefOr[GroupEventCallback] = js.native
  /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option.	 */
  var groupHeader: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
  /** You can set the default open state of groups using the groupStartOpen property* * This can take one of three possible values:
    true - all groups start open (default value)
    false - all groups start closed
    function() - a callback to decide if a group should start open or closed
    Group Open Function
    If you want to decide on a group by group basis which should start open or closed then you can pass a function to the groupStartOpen property. This should return true if the group should start open or false if the group should start closed.
    */
  var groupStartOpen: js.UndefOr[
    Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ])
  ] = js.native
  /** The groupTap callback is triggered when a user taps on a group header on a touch display. */
  var groupTap: js.UndefOr[GroupEventCallback] = js.native
  /** The groupTapHold callback is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second */
  var groupTapHold: js.UndefOr[GroupEventCallback] = js.native
  /** By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behaviour you can use the groupToggleElement option to choose a different option:* * The option can take one of three values:
    arrow - togggle group on arrow element click
    header - toggle group on click anywhere on the group header element
    false - prevent clicking anywhere in the group toggling the group
    */
  var groupToggleElement: js.UndefOr[arrow | header | `false`] = js.native
  /** By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
    This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level	 */
  var groupValues: js.UndefOr[js.Array[js.Array[_]]] = js.native
  /** The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states. */
  var groupVisibilityChanged: js.UndefOr[js.Function2[/* group */ GroupComponent, /* visible */ Boolean, Unit]] = js.native
}

object OptionsRowGrouping {
  @scala.inline
  def apply(): OptionsRowGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRowGrouping]
  }
  @scala.inline
  implicit class OptionsRowGroupingOps[Self <: OptionsRowGrouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataGrouped(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withDataGrouping(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDataGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByFunction1(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupBy(value: String | (js.Function1[/* data */ js.Any, _])): Self = {
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
    def withGroupClick(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClick")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupClosedShowCalcs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClosedShowCalcs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupClosedShowCalcs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupClosedShowCalcs")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupContext(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContext")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupContext")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDblClick(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDblClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupDblTap(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDblTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupDblTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupDblTap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupHeaderFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupHeader")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGroupHeader(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = {
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
    def withGroupStartOpenFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupStartOpen")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGroupStartOpen(
      value: Boolean | (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          Boolean
        ])
    ): Self = {
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
    @scala.inline
    def withGroupTap(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupTapHold(value: (/* e */ js.Any, /* group */ GroupComponent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTapHold")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupTapHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupTapHold")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupToggleElement(value: arrow | header | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupToggleElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupToggleElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupToggleElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupValues(value: js.Array[js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupValues")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupVisibilityChanged(value: (/* group */ GroupComponent, /* visible */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupVisibilityChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupVisibilityChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupVisibilityChanged")(js.undefined)
        ret
    }
  }
  
}

