package typingsSlinky.winrtUwp.Windows.Media.Effects

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typingsSlinky.winrtUwp.Windows.Media.Editing.MediaOverlay
import typingsSlinky.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom overlay operation within the CompositeFrame method. */
@js.native
trait CompositeVideoFrameContext extends js.Object {
  /** Gets the background frame for an overlay operation. */
  var backgroundFrame: VideoFrame = js.native
  /** Gets the output frame for an overlay operation. */
  var outputFrame: VideoFrame = js.native
  /** Gets the list of Direct3D surfaces to be used in an overlay operation. */
  var surfacesToOverlay: IVectorView[IDirect3DSurface] = js.native
  /**
    * Gets a MediaOverlay object for the provided Direct3D surface.
    * @param surfaceToOverlay The Direct3D surface.
    * @return The created MediaOverlay object.
    */
  def getOverlayForSurface(surfaceToOverlay: IDirect3DSurface): MediaOverlay = js.native
}

object CompositeVideoFrameContext {
  @scala.inline
  def apply(
    backgroundFrame: VideoFrame,
    getOverlayForSurface: IDirect3DSurface => MediaOverlay,
    outputFrame: VideoFrame,
    surfacesToOverlay: IVectorView[IDirect3DSurface]
  ): CompositeVideoFrameContext = {
    val __obj = js.Dynamic.literal(backgroundFrame = backgroundFrame.asInstanceOf[js.Any], getOverlayForSurface = js.Any.fromFunction1(getOverlayForSurface), outputFrame = outputFrame.asInstanceOf[js.Any], surfacesToOverlay = surfacesToOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeVideoFrameContext]
  }
  @scala.inline
  implicit class CompositeVideoFrameContextOps[Self <: CompositeVideoFrameContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundFrame(value: VideoFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetOverlayForSurface(value: IDirect3DSurface => MediaOverlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlayForSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutputFrame(value: VideoFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurfacesToOverlay(value: IVectorView[IDirect3DSurface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfacesToOverlay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

