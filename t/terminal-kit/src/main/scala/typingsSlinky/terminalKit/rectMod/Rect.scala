package typingsSlinky.terminalKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rect extends js.Object {
  val height: Double = js.native
  val isNull: Boolean = js.native
  val width: Double = js.native
  val xmax: Double = js.native
  val xmin: Double = js.native
  val ymax: Double = js.native
  val ymin: Double = js.native
  def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
  def set(obj: Region): Unit = js.native
}

object Rect {
  @scala.inline
  def apply(
    clip: (Rect, Double, Double, Boolean) => Unit,
    height: Double,
    isNull: Boolean,
    set: Region => Unit,
    width: Double,
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4(clip), height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClip(value: (Rect, Double, Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: Region => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

