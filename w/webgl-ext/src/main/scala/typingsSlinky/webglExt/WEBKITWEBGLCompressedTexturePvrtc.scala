package typingsSlinky.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WEBKITWEBGLCompressedTexturePvrtc extends js.Object {
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double = js.native
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double = js.native
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double = js.native
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double = js.native
}

object WEBKITWEBGLCompressedTexturePvrtc {
  @scala.inline
  def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
  ): WEBKITWEBGLCompressedTexturePvrtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBKITWEBGLCompressedTexturePvrtc]
  }
  @scala.inline
  implicit class WEBKITWEBGLCompressedTexturePvrtcOps[Self <: WEBKITWEBGLCompressedTexturePvrtc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_RGBA_PVRTC_2BPPV1_IMG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_RGBA_PVRTC_4BPPV1_IMG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_RGB_PVRTC_2BPPV1_IMG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPRESSED_RGB_PVRTC_4BPPV1_IMG")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

