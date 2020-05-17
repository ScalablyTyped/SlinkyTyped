package typingsSlinky.tooltipster.anon

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedLineage extends js.Object {
  /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
  var fixedLineage: Boolean = js.native
  var offset: Bottom = js.native
  var size: Height = js.native
  /** if the origin is a map area, this will hold the associated image element */
  var usemapImage: HTMLImageElement | Null = js.native
  var windowOffset: Bottom = js.native
}

object FixedLineage {
  @scala.inline
  def apply(fixedLineage: Boolean, offset: Bottom, size: Height, windowOffset: Bottom): FixedLineage = {
    val __obj = js.Dynamic.literal(fixedLineage = fixedLineage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], windowOffset = windowOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedLineage]
  }
  @scala.inline
  implicit class FixedLineageOps[Self <: FixedLineage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedLineage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLineage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowOffset(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsemapImage(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemapImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsemapImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usemapImage")(null)
        ret
    }
  }
  
}

