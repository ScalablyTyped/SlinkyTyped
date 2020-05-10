package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.contain
import typingsSlinky.sharp.sharpStrings.cover
import typingsSlinky.sharp.sharpStrings.fill
import typingsSlinky.sharp.sharpStrings.inside
import typingsSlinky.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FitEnum extends js.Object {
  var contain: typingsSlinky.sharp.sharpStrings.contain = js.native
  var cover: typingsSlinky.sharp.sharpStrings.cover = js.native
  var fill: typingsSlinky.sharp.sharpStrings.fill = js.native
  var inside: typingsSlinky.sharp.sharpStrings.inside = js.native
  var outside: typingsSlinky.sharp.sharpStrings.outside = js.native
}

object FitEnum {
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitEnum]
  }
  @scala.inline
  implicit class FitEnumOps[Self <: FitEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContain(value: contain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCover(value: cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: fill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInside(value: inside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutside(value: outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

