package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.anon.Bottom
import typingsSlinky.yandexMaps.yandexMapsStrings.left
import typingsSlinky.yandexMaps.yandexMapsStrings.none
import typingsSlinky.yandexMaps.yandexMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IManagerControlOptions extends js.Object {
  var float: js.UndefOr[none | left | right] = js.native
  var floatIndex: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Bottom] = js.native
}

object IManagerControlOptions {
  @scala.inline
  def apply(): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerControlOptions]
  }
  @scala.inline
  implicit class IManagerControlOptionsOps[Self <: IManagerControlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloat(value: none | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

