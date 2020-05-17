package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 2D texture material used in the 3D model. */
@js.native
trait Printing3DTexture2CoordMaterial extends js.Object {
  /** Gets or sets the texture used in the 2D texture material. */
  var texture: Printing3DModelTexture = js.native
  /** Gets or sets the U-coordinate within the texture, horizontally right from the origin in the upper left of the texture. */
  var u: Double = js.native
  /** Gets or sets the V-coordinate within the texture, vertically down from the origin in the upper left of the texture. */
  var v: Double = js.native
}

object Printing3DTexture2CoordMaterial {
  @scala.inline
  def apply(texture: Printing3DModelTexture, u: Double, v: Double): Printing3DTexture2CoordMaterial = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DTexture2CoordMaterial]
  }
  @scala.inline
  implicit class Printing3DTexture2CoordMaterialOps[Self <: Printing3DTexture2CoordMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTexture(value: Printing3DModelTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withU(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("u")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

