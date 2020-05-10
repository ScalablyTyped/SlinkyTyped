package typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import typingsSlinky.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SURFACE_DESC structure. Describes a IDirect3DSurface . */
@js.native
trait Direct3DSurfaceDescription extends js.Object {
  /** Pixel format of the surface. */
  var format: DirectXPixelFormat = js.native
  /** Height of the surface. */
  var height: Double = js.native
  /** Multi-sampling parameters for the surface. */
  var multisampleDescription: Direct3DMultisampleDescription = js.native
  /** Width of the surface. */
  var width: Double = js.native
}

object Direct3DSurfaceDescription {
  @scala.inline
  def apply(
    format: DirectXPixelFormat,
    height: Double,
    multisampleDescription: Direct3DMultisampleDescription,
    width: Double
  ): Direct3DSurfaceDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multisampleDescription = multisampleDescription.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direct3DSurfaceDescription]
  }
  @scala.inline
  implicit class Direct3DSurfaceDescriptionOps[Self <: Direct3DSurfaceDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: DirectXPixelFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultisampleDescription(value: Direct3DMultisampleDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multisampleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

