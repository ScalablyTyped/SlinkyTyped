package typingsSlinky.senchaTouch.Ext.chart.grid

import typingsSlinky.senchaTouch.Ext.draw.sprite.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadialGrid extends IPath {
  /** [Method] Render method
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IRadialGrid: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Update the path
  		* @param path Object
  		* @param attr Object
  		*/
  @JSName("updatePath")
  var updatePath_IRadialGrid: js.UndefOr[js.Function2[/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRadialGrid {
  @scala.inline
  def apply(): IRadialGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadialGrid]
  }
  @scala.inline
  implicit class IRadialGridOps[Self <: IRadialGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePath(value: (/* path */ js.UndefOr[js.Any], /* attr */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdatePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePath")(js.undefined)
        ret
    }
  }
  
}

