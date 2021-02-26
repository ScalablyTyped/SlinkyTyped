package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group[T /* <: SlickData */] extends NonDataRow {
  
  /***
    * Whether a group is collapsed.
    * @property collapsed
    * @type {Boolean}
    */
  var collapsed: Boolean = js.native
  
  /***
    * Number of rows in the group.
    * @property count
    * @type {Integer}
    */
  var count: Double = js.native
  
  /***
    * Compares two Group instances.
    * @method equals
    * @return {Boolean}
    * @param group {Group} Group instance to compare to.
    * todo: this is on the prototype (NonDataRow()) instance, not Group, maybe doesn't matter?
    */
  def equals(group: Group[T]): Boolean = js.native
  
  /**
    * A unique key used to identify the group.  This key can be used in calls to DataView
    * collapseGroup() or expandGroup().
    * @property groupingKey
    * @type {Object}
    */
  var groupingKey: js.Any = js.native
  
  /**
    * Sub-groups that are part of the group.
    * @property groups
    * @type {Array}
    */
  var groups: js.Array[Group[T]] = js.native
  
  /**
    * Grouping level, starting with 0.
    * @property level
    * @type {Number}
    */
  var level: Double = js.native
  
  /**
    * Rows that are part of the group.
    * @property rows
    * @type {Array}
    */
  var rows: js.Array[T] = js.native
  
  /***
    * Formatted display value of the group.
    * @property title
    * @type {String}
    */
  var title: String = js.native
  
  /***
    * GroupTotals, if any.
    * @property totals
    * @type {GroupTotals}
    */
  var totals: GroupTotals[T] = js.native
  
  /***
    * Grouping value.
    * @property value
    * @type {Object}
    */
  var value: js.Any = js.native
}
object Group {
  
  @scala.inline
  def apply[T /* <: SlickData */](
    collapsed: Boolean,
    count: Double,
    equals_ : Group[T] => Boolean,
    groupingKey: js.Any,
    groups: js.Array[Group[T]],
    level: Double,
    rows: js.Array[T],
    title: String,
    totals: GroupTotals[T],
    value: js.Any
  ): Group[T] = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], groupingKey = groupingKey.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Group[T]]
  }
  
  @scala.inline
  implicit class GroupMutableBuilder[Self <: Group[_], T /* <: SlickData */] (val x: Self with Group[T]) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: Group[T] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupingKey(value: js.Any): Self = StObject.set(x, "groupingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[Group[T]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Group[T]*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotals(value: GroupTotals[T]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
