package typingsSlinky.senchaTouch.Ext.mixin

import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIdentifiable extends IBase {
  /** [Method] Retrieves the id of this component
  		* @returns any id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
}

object IIdentifiable {
  @scala.inline
  def apply(): IIdentifiable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdentifiable]
  }
  @scala.inline
  implicit class IIdentifiableOps[Self <: IIdentifiable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetId(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
  }
  
}

