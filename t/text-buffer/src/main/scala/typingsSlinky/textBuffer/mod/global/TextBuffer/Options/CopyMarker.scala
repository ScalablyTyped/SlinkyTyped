package typingsSlinky.textBuffer.mod.global.TextBuffer.Options

import typingsSlinky.textBuffer.textBufferStrings.inside
import typingsSlinky.textBuffer.textBufferStrings.never
import typingsSlinky.textBuffer.textBufferStrings.overlap
import typingsSlinky.textBuffer.textBufferStrings.surround
import typingsSlinky.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyMarker extends js.Object {
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  /**
    *  Custom properties to be associated with the marker.
    *  @deprecated
    */
  var properties: js.UndefOr[js.Object] = js.native
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[Boolean] = js.native
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[Boolean] = js.native
}

object CopyMarker {
  @scala.inline
  def apply(): CopyMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyMarker]
  }
  @scala.inline
  implicit class CopyMarkerOps[Self <: CopyMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidate(value: never | surround | overlap | inside | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidate")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withTailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tailed")(js.undefined)
        ret
    }
  }
  
}

