package typingsSlinky.senchaTouch.Ext.layout

import typingsSlinky.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefault extends IAbstract {
  /** [Config Option] (Ext.fx.layout.Card) */
  var animation: js.UndefOr[typingsSlinky.senchaTouch.Ext.fx.layout.ICard] = js.native
  /** [Method] Returns the value of animation
  		* @returns Ext.fx.layout.Card
  		*/
  var getAnimation: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.fx.layout.ICard]] = js.native
  /** [Method]
  		* @param item Ext.Component
  		* @param isInner Boolean
  		* @param destroying Boolean
  		*/
  var onItemInnerStateChange: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IComponent], 
      /* isInner */ js.UndefOr[Boolean], 
      /* destroying */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the value of animation
  		* @param animation Ext.fx.layout.Card The new value.
  		*/
  var setAnimation: js.UndefOr[
    js.Function1[/* animation */ js.UndefOr[typingsSlinky.senchaTouch.Ext.fx.layout.ICard], Unit]
  ] = js.native
}

object IDefault {
  @scala.inline
  def apply(): IDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefault]
  }
  @scala.inline
  implicit class IDefaultOps[Self <: IDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: typingsSlinky.senchaTouch.Ext.fx.layout.ICard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAnimation(value: () => typingsSlinky.senchaTouch.Ext.fx.layout.ICard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnItemInnerStateChange(
      value: (/* item */ js.UndefOr[IComponent], /* isInner */ js.UndefOr[Boolean], /* destroying */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInnerStateChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnItemInnerStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemInnerStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAnimation(value: /* animation */ js.UndefOr[typingsSlinky.senchaTouch.Ext.fx.layout.ICard] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAnimation")(js.undefined)
        ret
    }
  }
  
}

