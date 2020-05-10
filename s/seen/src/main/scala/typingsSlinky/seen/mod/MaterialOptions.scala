package typingsSlinky.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaterialOptions extends js.Object {
  var color: js.UndefOr[Color] = js.native
  var metallic: js.UndefOr[Boolean] = js.native
  var shader: js.UndefOr[Shader] = js.native
  var specularColor: js.UndefOr[Color] = js.native
  var specularExponent: js.UndefOr[Double] = js.native
}

object MaterialOptions {
  @scala.inline
  def apply(): MaterialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterialOptions]
  }
  @scala.inline
  implicit class MaterialOptionsOps[Self <: MaterialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withMetallic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetallic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metallic")(js.undefined)
        ret
    }
    @scala.inline
    def withShader(value: Shader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shader")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecularColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecularColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecularExponent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecularExponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularExponent")(js.undefined)
        ret
    }
  }
  
}

