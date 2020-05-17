package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyscalekeyScale extends js.Object {
  /**
    * Sets the key-scale value "scale-k" | "scale-v" | ...
    */
  var `key-scalekeyScale`: js.UndefOr[String] = js.native
  /**
    * Sets the value-scale value "scale-x" | "scale-y" | ...
    */
  var `val-scalevalScale`: js.UndefOr[String] = js.native
}

object KeyscalekeyScale {
  @scala.inline
  def apply(): KeyscalekeyScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyscalekeyScale]
  }
  @scala.inline
  implicit class KeyscalekeyScaleOps[Self <: KeyscalekeyScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withKey-scalekeyScale`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key-scalekeyScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutKey-scalekeyScale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key-scalekeyScale")(js.undefined)
        ret
    }
    @scala.inline
    def `withVal-scalevalScale`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val-scalevalScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutVal-scalevalScale`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val-scalevalScale")(js.undefined)
        ret
    }
  }
  
}

