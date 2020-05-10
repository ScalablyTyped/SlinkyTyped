package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRLayer extends js.Object {
  var leftBounds: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array | Null] = js.native
  var rightBounds: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array | Null] = js.native
  var source: js.UndefOr[org.scalajs.dom.raw.HTMLCanvasElement | Null] = js.native
}

object VRLayer {
  @scala.inline
  def apply(): VRLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRLayer]
  }
  @scala.inline
  implicit class VRLayerOps[Self <: VRLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftBoundsFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeftBounds(value: js.Array[Double] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftBoundsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftBounds")(null)
        ret
    }
    @scala.inline
    def withRightBoundsFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRightBounds(value: js.Array[Double] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withRightBoundsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightBounds")(null)
        ret
    }
    @scala.inline
    def withSource(value: org.scalajs.dom.raw.HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(null)
        ret
    }
  }
  
}

