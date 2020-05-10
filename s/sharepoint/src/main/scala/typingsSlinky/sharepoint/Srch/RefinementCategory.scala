package typingsSlinky.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.sharepointStrings.AND
import typingsSlinky.sharepoint.sharepointStrings.OR
import typingsSlinky.sharepoint.sharepointStrings.and_
import typingsSlinky.sharepoint.sharepointStrings.or_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefinementCategory extends js.Object {
  /** Use KQL */
  var k: Boolean = js.native
  /**  token to display value map */
  var m: StringDictionary[String] | Null = js.native
  /** Refiner Name (Mapped property) */
  var n: String = js.native
  var o: String | and_ | or_ | AND | OR = js.native
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String] = js.native
}

object RefinementCategory {
  @scala.inline
  def apply(k: Boolean, n: String, o: String | and_ | or_ | AND | OR, t: js.Array[String]): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementCategory]
  }
  @scala.inline
  implicit class RefinementCategoryOps[Self <: RefinementCategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withK(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withO(value: String | and_ | or_ | AND | OR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(null)
        ret
    }
  }
  
}

