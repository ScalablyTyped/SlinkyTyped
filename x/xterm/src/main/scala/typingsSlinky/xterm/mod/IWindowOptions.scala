package typingsSlinky.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWindowOptions extends js.Object {
  /**
    * Ps=10 ; 0  Undo full-screen mode.
    * Ps=10 ; 1  Change to full-screen.
    * Ps=10 ; 2  Toggle full-screen.  
    * No default implementation.
    */
  var fullscreenWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps=16  Report xterm character cell size in pixels. Result is "CSI 6 ; height ; width t".  
    * Has a default implementation.
    */
  var getCellSizePixels: js.UndefOr[Boolean] = js.native
  /**
    * Ps=20  Report xterm window's icon label. Result is "OSC L label ST".  
    * No default implementation.
    */
  var getIconTitle: js.UndefOr[Boolean] = js.native
  /**
    * Ps=19  Report the size of the screen in characters. Result is "CSI 9 ; height ; width t".  
    * No default implementation.
    */
  var getScreenSizeChars: js.UndefOr[Boolean] = js.native
  /**
    * Ps=15    Report size of the screen in pixels. Result is "CSI 5 ; height ; width t".  
    * No default implementation.
    */
  var getScreenSizePixels: js.UndefOr[Boolean] = js.native
  /**
    * Ps=13      Report xterm window position. Result is "CSI 3 ; x ; y t".
    * Ps=13 ; 2  Report xterm text-area position. Result is "CSI 3 ; x ; y t".  
    * No default implementation.
    */
  var getWinPosition: js.UndefOr[Boolean] = js.native
  /**
    * Ps=18  Report the size of the text area in characters. Result is "CSI 8 ; height ; width t".  
    * Has a default implementation.
    */
  var getWinSizeChars: js.UndefOr[Boolean] = js.native
  /**
    * Ps=14      Report xterm text area size in pixels. Result is "CSI 4 ; height ; width t".
    * Ps=14 ; 2  Report xterm window size in pixels. Result is "CSI  4 ; height ; width t".  
    * Has a default implementation.
    */
  var getWinSizePixels: js.UndefOr[Boolean] = js.native
  /** Ps=11   Report xterm window state.
    * If the xterm window is non-iconified, it returns "CSI 1 t".
    * If the xterm window is iconified, it returns "CSI 2 t".  
    * No default implementation.
    */
  var getWinState: js.UndefOr[Boolean] = js.native
  /**
    * Ps=21  Report xterm window's title. Result is "OSC l label ST".  
    * No default implementation.
    */
  var getWinTitle: js.UndefOr[Boolean] = js.native
  /**
    * Ps=6    Lower the xterm window to the bottom of the stacking order.  
    * No default implementation.
    */
  var lowerWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps=9 ; 0   Restore maximized window.
    * Ps=9 ; 1   Maximize window (i.e., resize to screen size).
    * Ps=9 ; 2   Maximize window vertically.
    * Ps=9 ; 3   Maximize window horizontally.  
    * No default implementation.
    */
  var maximizeWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps=2    Iconify window.  
    * No default implementation.
    */
  var minimizeWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps=23 ; 0  Restore xterm icon and window title from stack.
    * Ps=23 ; 1  Restore xterm icon title from stack.
    * Ps=23 ; 2  Restore xterm window title from stack.  
    * All variants have a default implementation.
    */
  var popTitle: js.UndefOr[Boolean] = js.native
  /**
    * Ps=22 ; 0  Save xterm icon and window title on stack.
    * Ps=22 ; 1  Save xterm icon title on stack.
    * Ps=22 ; 2  Save xterm window title on stack.  
    * All variants have a default implementation.
    */
  var pushTitle: js.UndefOr[Boolean] = js.native
  /**
    * Ps=5    Raise the window to the front of the stacking order.  
    * No default implementation.
    */
  var raiseWin: js.UndefOr[Boolean] = js.native
  /** Ps=7    Refresh the window. */
  var refreshWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps=1    De-iconify window.  
    * No default implementation.
    */
  var restoreWin: js.UndefOr[Boolean] = js.native
  /**
    * Ps>=24  Resize to Ps lines (DECSLPP).  
    * DECSLPP is not implemented. This settings is also used to
    * enable / disable DECCOLM (earlier variant of DECSLPP).
    */
  var setWinLines: js.UndefOr[Boolean] = js.native
  /**
    * Ps=3 ; x ; y
    * Move window to [x, y].  
    * No default implementation.
    */
  var setWinPosition: js.UndefOr[Boolean] = js.native
  /**
    * Ps = 8 ; height ; width
    * Resize the text area to given height and width in characters.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters use the display's height or width.  
    * No default implementation.
    */
  var setWinSizeChars: js.UndefOr[Boolean] = js.native
  /**
    * Ps = 4 ; height ; width
    * Resize the window to given `height` and `width` in pixels.
    * Omitted parameters should reuse the current height or width.
    * Zero parameters should use the display's height or width.  
    * No default implementation.
    */
  var setWinSizePixels: js.UndefOr[Boolean] = js.native
}

object IWindowOptions {
  @scala.inline
  def apply(): IWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWindowOptions]
  }
  @scala.inline
  implicit class IWindowOptionsOps[Self <: IWindowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullscreenWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreenWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreenWin")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellSizePixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellSizePixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCellSizePixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellSizePixels")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIconTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetIconTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIconTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScreenSizeChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenSizeChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetScreenSizeChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenSizeChars")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScreenSizePixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenSizePixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetScreenSizePixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScreenSizePixels")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWinPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWinPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWinSizeChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinSizeChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWinSizeChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinSizeChars")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWinSizePixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinSizePixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWinSizePixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinSizePixels")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWinState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWinState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWinTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWinTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWinTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerWin")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximizeWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximizeWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeWin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimizeWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimizeWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeWin")(js.undefined)
        ret
    }
    @scala.inline
    def withPopTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPushTitle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withRaiseWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaiseWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raiseWin")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshWin")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreWin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreWin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreWin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreWin")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWinLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWinLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWinPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWinPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWinSizeChars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinSizeChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWinSizeChars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinSizeChars")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWinSizePixels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinSizePixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWinSizePixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWinSizePixels")(js.undefined)
        ret
    }
  }
  
}

