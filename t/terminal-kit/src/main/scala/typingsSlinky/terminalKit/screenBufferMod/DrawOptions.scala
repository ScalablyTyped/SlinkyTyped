package typingsSlinky.terminalKit.screenBufferMod

import typingsSlinky.terminalKit.terminalKitStrings.x
import typingsSlinky.terminalKit.terminalKitStrings.y
import typingsSlinky.terminalKit.terminalMod.Terminal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var blending: js.UndefOr[Boolean] = js.native
  var delta: js.UndefOr[Boolean] = js.native
  var dst: js.UndefOr[Terminal | ScreenBuffer] = js.native
  var dstClipRect: js.UndefOr[typingsSlinky.terminalKit.rectMod.^] = js.native
  var srcClipRect: js.UndefOr[typingsSlinky.terminalKit.rectMod.^] = js.native
  var tile: js.UndefOr[Boolean] = js.native
  var wrap: js.UndefOr[Boolean | x | y] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blending")(js.undefined)
        ret
    }
    @scala.inline
    def withDelta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(js.undefined)
        ret
    }
    @scala.inline
    def withDst(value: Terminal | ScreenBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(js.undefined)
        ret
    }
    @scala.inline
    def withDstClipRect(value: typingsSlinky.terminalKit.rectMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstClipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstClipRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstClipRect")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcClipRect(value: typingsSlinky.terminalKit.rectMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcClipRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcClipRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcClipRect")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.undefined)
        ret
    }
    @scala.inline
    def withWrap(value: Boolean | typingsSlinky.terminalKit.terminalKitStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrap")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

