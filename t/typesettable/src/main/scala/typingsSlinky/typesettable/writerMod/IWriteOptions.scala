package typingsSlinky.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriteOptions extends js.Object {
  /**
    * An optional cardinal-direction rotation for the whole text block.
    *
    * Supported rotations are -90, 0, 180, and 90.
    *
    * @default 0
    */
  var textRotation: js.UndefOr[Double] = js.native
  /**
    * An optional shear angle. Shearing allows the rotation and re-alignment of
    * individual lines as opposed to the whole text block.
    *
    * Supported shears are between -80 and 80 degrees.
    *
    * @default 0
    */
  var textShear: js.UndefOr[Double] = js.native
  /**
    * The x-alignment of text.
    *
    * @default "left"
    */
  var xAlign: js.UndefOr[IXAlign] = js.native
  /**
    * The y-alignment of text.
    *
    * @default "top"
    */
  var yAlign: js.UndefOr[IYAlign] = js.native
}

object IWriteOptions {
  @scala.inline
  def apply(): IWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteOptions]
  }
  @scala.inline
  implicit class IWriteOptionsOps[Self <: IWriteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withTextShear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextShear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textShear")(js.undefined)
        ret
    }
    @scala.inline
    def withXAlign(value: IXAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withYAlign(value: IYAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAlign")(js.undefined)
        ret
    }
  }
  
}

