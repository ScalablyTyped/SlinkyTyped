package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColourspaceEnum extends js.Object {
  var `b-w`: String = js.native
  var bw: String = js.native
  var cmyk: String = js.native
  var multiband: String = js.native
  var srgb: String = js.native
}

object ColourspaceEnum {
  @scala.inline
  def apply(`b-w`: String, bw: String, cmyk: String, multiband: String, srgb: String): ColourspaceEnum = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any], cmyk = cmyk.asInstanceOf[js.Any], multiband = multiband.asInstanceOf[js.Any], srgb = srgb.asInstanceOf[js.Any])
    __obj.updateDynamic("b-w")(`b-w`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColourspaceEnum]
  }
  @scala.inline
  implicit class ColourspaceEnumOps[Self <: ColourspaceEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withB-w`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b-w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBw(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmyk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmyk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiband(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiband")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrgb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srgb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

