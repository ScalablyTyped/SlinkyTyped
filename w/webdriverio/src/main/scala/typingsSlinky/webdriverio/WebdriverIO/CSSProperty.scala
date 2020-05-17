package typingsSlinky.webdriverio.WebdriverIO

import typingsSlinky.webdriverio.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperty extends js.Object {
  var parsed: js.UndefOr[Alpha] = js.native
  var property: String = js.native
  var value: js.Any = js.native
}

object CSSProperty {
  @scala.inline
  def apply(property: String, value: js.Any): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  @scala.inline
  implicit class CSSPropertyOps[Self <: CSSProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsed(value: Alpha): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(js.undefined)
        ret
    }
  }
  
}

