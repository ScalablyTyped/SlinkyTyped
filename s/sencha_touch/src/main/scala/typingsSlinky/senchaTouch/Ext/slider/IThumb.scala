package typingsSlinky.senchaTouch.Ext.slider

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThumb extends IComponent {
  /** [Config Option] (Object) */
  var draggable: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of draggable
  		* @returns Object
  		*/
  var getDraggable: js.UndefOr[js.Function0[_]] = js.native
}

object IThumb {
  @scala.inline
  def apply(): IThumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThumb]
  }
  @scala.inline
  implicit class IThumbOps[Self <: IThumb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDraggable(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDraggable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDraggable")(js.undefined)
        ret
    }
  }
  
}

