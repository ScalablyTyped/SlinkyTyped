package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a texture used in the 3D model. */
@js.native
trait Printing3DModelTexture extends js.Object {
  /** Gets or sets the texture resource used by the texture. */
  var textureResource: Printing3DTextureResource = js.native
  /** Get or sets a value that indicates how tiling should occur in the U axis in order to fill the overall requested area. */
  var tileStyleU: Printing3DTextureEdgeBehavior = js.native
  /** Gets or sets a value that indicates how tiling should occur in the V axis in order to fill the overall requested area. */
  var tileStyleV: Printing3DTextureEdgeBehavior = js.native
}

object Printing3DModelTexture {
  @scala.inline
  def apply(
    textureResource: Printing3DTextureResource,
    tileStyleU: Printing3DTextureEdgeBehavior,
    tileStyleV: Printing3DTextureEdgeBehavior
  ): Printing3DModelTexture = {
    val __obj = js.Dynamic.literal(textureResource = textureResource.asInstanceOf[js.Any], tileStyleU = tileStyleU.asInstanceOf[js.Any], tileStyleV = tileStyleV.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DModelTexture]
  }
  @scala.inline
  implicit class Printing3DModelTextureOps[Self <: Printing3DModelTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTextureResource(value: Printing3DTextureResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textureResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileStyleU(value: Printing3DTextureEdgeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileStyleU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileStyleV(value: Printing3DTextureEdgeBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileStyleV")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

