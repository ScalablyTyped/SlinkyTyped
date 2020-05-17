package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseSensitive extends js.Object {
  var caseSensitive: scala.Double = js.native
  var none: scala.Double = js.native
  var objectTooLarge: scala.Double = js.native
  var unknown: scala.Double = js.native
}

object CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: scala.Double,
    none: scala.Double,
    objectTooLarge: scala.Double,
    unknown: scala.Double
  ): CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], objectTooLarge = objectTooLarge.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectTooLarge(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectTooLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

