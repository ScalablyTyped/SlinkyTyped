package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.cubic
import typingsSlinky.sharp.sharpStrings.lanczos2
import typingsSlinky.sharp.sharpStrings.lanczos3
import typingsSlinky.sharp.sharpStrings.mitchell
import typingsSlinky.sharp.sharpStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelEnum extends js.Object {
  var cubic: typingsSlinky.sharp.sharpStrings.cubic = js.native
  var lanczos2: typingsSlinky.sharp.sharpStrings.lanczos2 = js.native
  var lanczos3: typingsSlinky.sharp.sharpStrings.lanczos3 = js.native
  var mitchell: typingsSlinky.sharp.sharpStrings.mitchell = js.native
  var nearest: typingsSlinky.sharp.sharpStrings.nearest = js.native
}

object KernelEnum {
  @scala.inline
  def apply(cubic: cubic, lanczos2: lanczos2, lanczos3: lanczos3, mitchell: mitchell, nearest: nearest): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic.asInstanceOf[js.Any], lanczos2 = lanczos2.asInstanceOf[js.Any], lanczos3 = lanczos3.asInstanceOf[js.Any], mitchell = mitchell.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelEnum]
  }
  @scala.inline
  implicit class KernelEnumOps[Self <: KernelEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCubic(value: cubic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanczos2(value: lanczos2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanczos2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanczos3(value: lanczos3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanczos3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMitchell(value: mitchell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mitchell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNearest(value: nearest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

