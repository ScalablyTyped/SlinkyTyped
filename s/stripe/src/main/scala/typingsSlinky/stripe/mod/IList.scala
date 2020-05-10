package typingsSlinky.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IList[T] extends js.Object {
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T] = js.native
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: Boolean = js.native
  /**
    * Value is 'list'
    */
  var `object`: String = js.native
  /**
    * The total number of items available. This value is not included by default,
    * but you can request it by specifying ?include[]=total_count
    */
  var total_count: js.UndefOr[Double] = js.native
  /**
    * The URL for accessing this list.
    */
  var url: String = js.native
}

object IList {
  @scala.inline
  def apply[T](data: js.Array[T], has_more: Boolean, `object`: String, url: String): IList[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IList[T]]
  }
  @scala.inline
  implicit class IListOps[Self[t] <: IList[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_count: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(js.undefined)
        ret
    }
  }
  
}

