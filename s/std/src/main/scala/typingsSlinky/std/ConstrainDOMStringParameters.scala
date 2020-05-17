package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstrainDOMStringParameters extends ConstrainDOMString {
  var exact: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var ideal: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
}

object ConstrainDOMStringParameters {
  @scala.inline
  def apply(): ConstrainDOMStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDOMStringParameters]
  }
  @scala.inline
  implicit class ConstrainDOMStringParametersOps[Self <: ConstrainDOMStringParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExact(value: java.lang.String | js.Array[java.lang.String]): Self = {
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
    def withIdeal(value: java.lang.String | js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdeal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ideal")(js.undefined)
        ret
    }
  }
  
}

