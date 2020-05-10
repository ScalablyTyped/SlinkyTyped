package typingsSlinky.vis.mod

import typingsSlinky.vis.visStrings.Array
import typingsSlinky.vis.visStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSelectionOptions[T] extends js.Object {
  /**
    * An array with field names, or an object with current field name
    * and new field name that the field is returned as.
    * By default, all properties of the items are emitted.
    * When fields is defined, only the properties whose name is specified
    * in fields will be included in the returned items.
    */
  var fields: js.UndefOr[js.Array[String] | js.Any] = js.native
  /**
    * Items can be filtered on specific properties by providing a filter function.
    * A filter function is executed for each of the items in the DataSet,
    * and is called with the item as parameter.
    * The function must return a boolean.
    * All items for which the filter function returns true will be emitted.
    * See section Data Filtering.
    */
  var filter: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.native
  /**
    * Order the items by a field name or custom sort function.
    */
  var order: js.UndefOr[String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.native
  /**
    * Determine the type of output of the get function.
    * Allowed values are 'Array' | 'Object'.
    * The default returnType is an Array.
    * The Object type will return a JSON object with the ID's as keys.
    */
  var returnType: js.UndefOr[Array | Object] = js.native
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of an item are left unchanged.
    * When a field type is specified, this field in the items will be converted to the specified type.
    * This can be used for example to convert ISO strings containing a date to a JavaScript Date object,
    * or convert strings to numbers or vice versa. The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.native
}

object DataSelectionOptions {
  @scala.inline
  def apply[T](): DataSelectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectionOptions[T]]
  }
  @scala.inline
  implicit class DataSelectionOptionsOps[Self[t] <: DataSelectionOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFields(value: js.Array[String] | js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* item */ T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFunction2(value: (/* a */ T, /* b */ T) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOrder(value: String | (js.Function2[/* a */ T, /* b */ T, Double])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnType(value: Array | Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

