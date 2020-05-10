package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extension of <Dimension> where Android returns additional absolute X/Y values/properties for <Titanium.UI.View.rect>
  */
@js.native
trait DimensionWithAbsolutes extends Dimension {
  /**
  	 * The x-axis coordinate of the position relative to the main window.
  	 */
  var absoluteX: js.UndefOr[Double] = js.native
  /**
  	 * The y-axis coordinate of the position relative to the main window.
  	 */
  var absoluteY: js.UndefOr[Double] = js.native
}

object DimensionWithAbsolutes {
  @scala.inline
  def apply(): DimensionWithAbsolutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionWithAbsolutes]
  }
  @scala.inline
  implicit class DimensionWithAbsolutesOps[Self <: DimensionWithAbsolutes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteX")(js.undefined)
        ret
    }
    @scala.inline
    def withAbsoluteY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsoluteY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteY")(js.undefined)
        ret
    }
  }
  
}

