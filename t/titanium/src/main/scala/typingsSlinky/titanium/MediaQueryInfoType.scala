package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A full query descriptor for a filtering predicate.
  */
@js.native
trait MediaQueryInfoType extends js.Object {
  /**
  	 * Whether or not the predicate is for an exact match.  The default is `true`.
  	 */
  var exact: js.UndefOr[Boolean] = js.native
  /**
  	 * The value for the given predicate. See the descriptions in <MediaQueryType> for information about which properties require which values.
  	 */
  var value: js.UndefOr[Double | java.lang.String | Boolean] = js.native
}

object MediaQueryInfoType {
  @scala.inline
  def apply(): MediaQueryInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryInfoType]
  }
  @scala.inline
  implicit class MediaQueryInfoTypeOps[Self <: MediaQueryInfoType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exact")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | java.lang.String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

