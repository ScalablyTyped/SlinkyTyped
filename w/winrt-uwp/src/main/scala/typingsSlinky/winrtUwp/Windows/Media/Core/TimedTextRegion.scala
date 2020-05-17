package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes properties for customizing the appearance of the rendering area of a TimedTextCue . */
@js.native
trait TimedTextRegion extends js.Object {
  /** Gets or sets the background color of the TimedTextRegion . */
  var background: Color = js.native
  /** Gets or sets the display alignment of the TimedTextRegion . */
  var displayAlignment: TimedTextDisplayAlignment = js.native
  /** Gets or sets the extent of the TimedTextRegion , which is the rendered size of the region either in pixels or in percentage of available space. */
  var extent: TimedTextSize = js.native
  /** Gets or sets a value indicating whether text overflowing the region is clipped. */
  var isOverflowClipped: Boolean = js.native
  /** Gets or sets a value that indicates the height of each line of content. */
  var lineHeight: TimedTextDouble = js.native
  /** Gets or sets a string representing the name of the TimedTextRegion . */
  var name: String = js.native
  /** Gets or sets a value that indicates the thickness of padding space between the boundaries of the content area and the content displayed by a TimedTextRegion . */
  var padding: TimedTextPadding = js.native
  /** Gets or sets the position of the TimedTextRegion , relative to the top left corner of the video frame. */
  var position: TimedTextPoint = js.native
  /** Gets a value indicating the method in which lines of text scroll through the region. */
  var scrollMode: TimedTextScrollMode = js.native
  /** Gets or sets a value indicating whether text wraps when it reaches the edge of the TimedTextRegion . */
  var textWrapping: TimedTextWrapping = js.native
  /** Gets or sets a value indicating the direction that text flows within the TimedTextRegion . */
  var writingMode: TimedTextWritingMode = js.native
  /** Gets or sets the Z-order of the TimedTextRegion , relative to other active regions on the screen, in case they overlap. */
  var zindex: Double = js.native
}

object TimedTextRegion {
  @scala.inline
  def apply(
    background: Color,
    displayAlignment: TimedTextDisplayAlignment,
    extent: TimedTextSize,
    isOverflowClipped: Boolean,
    lineHeight: TimedTextDouble,
    name: String,
    padding: TimedTextPadding,
    position: TimedTextPoint,
    scrollMode: TimedTextScrollMode,
    textWrapping: TimedTextWrapping,
    writingMode: TimedTextWritingMode,
    zindex: Double
  ): TimedTextRegion = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], displayAlignment = displayAlignment.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], isOverflowClipped = isOverflowClipped.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scrollMode = scrollMode.asInstanceOf[js.Any], textWrapping = textWrapping.asInstanceOf[js.Any], writingMode = writingMode.asInstanceOf[js.Any], zindex = zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextRegion]
  }
  @scala.inline
  implicit class TimedTextRegionOps[Self <: TimedTextRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAlignment(value: TimedTextDisplayAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtent(value: TimedTextSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOverflowClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverflowClipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: TimedTextDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: TimedTextPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: TimedTextPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollMode(value: TimedTextScrollMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextWrapping(value: TimedTextWrapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWrapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritingMode(value: TimedTextWritingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZindex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zindex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

