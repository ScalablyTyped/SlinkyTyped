package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDecorator extends IComponent {
  /** [Config Option] (Object) */
  var component: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of component
  		* @returns Object
  		*/
  var getComponent: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of component
  		* @param component Object The new value.
  		*/
  var setComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], Unit]] = js.native
}

object IDecorator {
  @scala.inline
  def apply(): IDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorator]
  }
  @scala.inline
  implicit class IDecoratorOps[Self <: IDecorator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withGetComponent(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetComponent(value: /* component */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComponent")(js.undefined)
        ret
    }
  }
  
}

