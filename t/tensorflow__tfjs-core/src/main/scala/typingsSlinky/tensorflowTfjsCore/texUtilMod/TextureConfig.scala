package typingsSlinky.tensorflowTfjsCore.texUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextureConfig extends js.Object {
  var defaultNumChannels: Double = js.native
  var downloadTextureFormat: Double = js.native
  var downloadUnpackNumChannels: Double = js.native
  var internalFormatFloat: Double = js.native
  var internalFormatHalfFloat: Double = js.native
  var internalFormatPackedFloat: Double = js.native
  var internalFormatPackedHalfFloat: Double = js.native
  var textureFormatFloat: Double = js.native
  var textureTypeFloat: Double = js.native
  var textureTypeHalfFloat: Double = js.native
}

object TextureConfig {
  @scala.inline
  def apply(
    defaultNumChannels: Double,
    downloadTextureFormat: Double,
    downloadUnpackNumChannels: Double,
    internalFormatFloat: Double,
    internalFormatHalfFloat: Double,
    internalFormatPackedFloat: Double,
    internalFormatPackedHalfFloat: Double,
    textureFormatFloat: Double,
    textureTypeFloat: Double,
    textureTypeHalfFloat: Double
  ): TextureConfig = {
    val __obj = js.Dynamic.literal(defaultNumChannels = defaultNumChannels.asInstanceOf[js.Any], downloadTextureFormat = downloadTextureFormat.asInstanceOf[js.Any], downloadUnpackNumChannels = downloadUnpackNumChannels.asInstanceOf[js.Any], internalFormatFloat = internalFormatFloat.asInstanceOf[js.Any], internalFormatHalfFloat = internalFormatHalfFloat.asInstanceOf[js.Any], internalFormatPackedFloat = internalFormatPackedFloat.asInstanceOf[js.Any], internalFormatPackedHalfFloat = internalFormatPackedHalfFloat.asInstanceOf[js.Any], textureFormatFloat = textureFormatFloat.asInstanceOf[js.Any], textureTypeFloat = textureTypeFloat.asInstanceOf[js.Any], textureTypeHalfFloat = textureTypeHalfFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureConfig]
  }
  @scala.inline
  implicit class TextureConfigOps[Self <: TextureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultNumChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNumChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadTextureFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTextureFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadUnpackNumChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUnpackNumChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalFormatFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalFormatFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalFormatHalfFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalFormatHalfFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalFormatPackedFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalFormatPackedFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalFormatPackedHalfFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalFormatPackedHalfFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureFormatFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureFormatFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureTypeFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureTypeFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureTypeHalfFloat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureTypeHalfFloat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

