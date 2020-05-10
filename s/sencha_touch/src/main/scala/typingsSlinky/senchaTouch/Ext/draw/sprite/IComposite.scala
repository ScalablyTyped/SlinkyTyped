package typingsSlinky.senchaTouch.Ext.draw.sprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComposite extends ISprite {
  /** [Method] Adds a sprite to the composite
  		* @param sprite Object
  		*/
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Renders all sprites contained in the composite to the surface
  		* @param surface Object
  		* @param ctx Object
  		* @param region Object
  		*/
  @JSName("render")
  var render_IComposite: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IComposite {
  @scala.inline
  def apply(): IComposite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComposite]
  }
  @scala.inline
  implicit class ICompositeOps[Self <: IComposite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: /* sprite */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

