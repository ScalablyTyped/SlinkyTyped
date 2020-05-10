package typingsSlinky.zingchart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUniform extends js.Object {
  /**
    * The text of the scale label, can use tokens for day, hour, minute, year etc to add in such information, ONLY if "type"="date" has
    * been specified in this transform object. If values for both "text" and "all" have been specified, the value in "text" will be used
    * . 'Month of %M' | '%d' | ...
    */
  var text: js.UndefOr[String] = js.native
  /**
    * To convert Unix timestamps into dates. Use this attribute with the all attribute. 'date'
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * To set the time-series scale to linear (uniform) or non-linear. true | false | 1 | 0
    */
  var uniform: js.UndefOr[Boolean] = js.native
}

object AnonUniform {
  @scala.inline
  def apply(): AnonUniform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUniform]
  }
  @scala.inline
  implicit class AnonUniformOps[Self <: AnonUniform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniform")(js.undefined)
        ret
    }
  }
  
}

