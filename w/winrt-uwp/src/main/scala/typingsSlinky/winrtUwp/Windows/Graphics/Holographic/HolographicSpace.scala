package typingsSlinky.winrtUwp.Windows.Graphics.Holographic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolographicSpace extends js.Object {
   /* unmapped type */ var addEventListener: js.Any = js.native
   /* unmapped type */ var createNextFrame: js.Any = js.native
   /* unmapped type */ var oncameraadded: js.Any = js.native
   /* unmapped type */ var oncameraremoved: js.Any = js.native
   /* unmapped type */ var primaryAdapterId: js.Any = js.native
   /* unmapped type */ var removeEventListener: js.Any = js.native
   /* unmapped type */ var setDirect3D11Device: js.Any = js.native
}

object HolographicSpace {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    createNextFrame: js.Any,
    oncameraadded: js.Any,
    oncameraremoved: js.Any,
    primaryAdapterId: js.Any,
    removeEventListener: js.Any,
    setDirect3D11Device: js.Any
  ): HolographicSpace = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], createNextFrame = createNextFrame.asInstanceOf[js.Any], oncameraadded = oncameraadded.asInstanceOf[js.Any], oncameraremoved = oncameraremoved.asInstanceOf[js.Any], primaryAdapterId = primaryAdapterId.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any], setDirect3D11Device = setDirect3D11Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolographicSpace]
  }
  @scala.inline
  implicit class HolographicSpaceOps[Self <: HolographicSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateNextFrame(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNextFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncameraadded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncameraadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOncameraremoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncameraremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryAdapterId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryAdapterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDirect3D11Device(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirect3D11Device")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

