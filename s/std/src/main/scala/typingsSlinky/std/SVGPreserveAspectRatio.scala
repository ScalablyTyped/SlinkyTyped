package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the preserveAspectRatio attribute, which is available for some of SVG's elements. */
@js.native
trait SVGPreserveAspectRatio extends js.Object {
  val SVG_MEETORSLICE_MEET: Double = js.native
  val SVG_MEETORSLICE_SLICE: Double = js.native
  val SVG_MEETORSLICE_UNKNOWN: Double = js.native
  val SVG_PRESERVEASPECTRATIO_NONE: Double = js.native
  val SVG_PRESERVEASPECTRATIO_UNKNOWN: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMID: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMID: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMAX: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMID: Double = js.native
  val SVG_PRESERVEASPECTRATIO_XMINYMIN: Double = js.native
  var align: Double = js.native
  var meetOrSlice: Double = js.native
}

object SVGPreserveAspectRatio {
  @scala.inline
  def apply(
    SVG_MEETORSLICE_MEET: Double,
    SVG_MEETORSLICE_SLICE: Double,
    SVG_MEETORSLICE_UNKNOWN: Double,
    SVG_PRESERVEASPECTRATIO_NONE: Double,
    SVG_PRESERVEASPECTRATIO_UNKNOWN: Double,
    SVG_PRESERVEASPECTRATIO_XMAXYMAX: Double,
    SVG_PRESERVEASPECTRATIO_XMAXYMID: Double,
    SVG_PRESERVEASPECTRATIO_XMAXYMIN: Double,
    SVG_PRESERVEASPECTRATIO_XMIDYMAX: Double,
    SVG_PRESERVEASPECTRATIO_XMIDYMID: Double,
    SVG_PRESERVEASPECTRATIO_XMIDYMIN: Double,
    SVG_PRESERVEASPECTRATIO_XMINYMAX: Double,
    SVG_PRESERVEASPECTRATIO_XMINYMID: Double,
    SVG_PRESERVEASPECTRATIO_XMINYMIN: Double,
    align: Double,
    meetOrSlice: Double
  ): SVGPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(SVG_MEETORSLICE_MEET = SVG_MEETORSLICE_MEET.asInstanceOf[js.Any], SVG_MEETORSLICE_SLICE = SVG_MEETORSLICE_SLICE.asInstanceOf[js.Any], SVG_MEETORSLICE_UNKNOWN = SVG_MEETORSLICE_UNKNOWN.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_NONE = SVG_PRESERVEASPECTRATIO_NONE.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_UNKNOWN = SVG_PRESERVEASPECTRATIO_UNKNOWN.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMAXYMAX = SVG_PRESERVEASPECTRATIO_XMAXYMAX.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMAXYMID = SVG_PRESERVEASPECTRATIO_XMAXYMID.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMAXYMIN = SVG_PRESERVEASPECTRATIO_XMAXYMIN.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMIDYMAX = SVG_PRESERVEASPECTRATIO_XMIDYMAX.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMIDYMID = SVG_PRESERVEASPECTRATIO_XMIDYMID.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMIDYMIN = SVG_PRESERVEASPECTRATIO_XMIDYMIN.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMINYMAX = SVG_PRESERVEASPECTRATIO_XMINYMAX.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMINYMID = SVG_PRESERVEASPECTRATIO_XMINYMID.asInstanceOf[js.Any], SVG_PRESERVEASPECTRATIO_XMINYMIN = SVG_PRESERVEASPECTRATIO_XMINYMIN.asInstanceOf[js.Any], align = align.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPreserveAspectRatio]
  }
  @scala.inline
  implicit class SVGPreserveAspectRatioOps[Self <: org.scalajs.dom.raw.SVGPreserveAspectRatio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSVG_MEETORSLICE_MEET(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_MEETORSLICE_MEET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_MEETORSLICE_SLICE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_MEETORSLICE_SLICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_MEETORSLICE_UNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_MEETORSLICE_UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_NONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_UNKNOWN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMAXYMAX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMAXYMAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMAXYMID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMAXYMID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMAXYMIN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMAXYMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMIDYMAX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMIDYMAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMIDYMID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMIDYMID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMIDYMIN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMIDYMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMINYMAX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMINYMAX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMINYMID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMINYMID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSVG_PRESERVEASPECTRATIO_XMINYMIN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SVG_PRESERVEASPECTRATIO_XMINYMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetOrSlice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetOrSlice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

