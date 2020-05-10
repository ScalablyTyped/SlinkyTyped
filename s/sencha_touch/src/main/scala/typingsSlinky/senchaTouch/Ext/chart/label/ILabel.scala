package typingsSlinky.senchaTouch.Ext.chart.label

import typingsSlinky.senchaTouch.Ext.draw.sprite.IText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILabel extends IText {
  /** [Config Option] (Object) */
  var fx: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of field
  		* @returns Object
  		*/
  var getField: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of fx
  		* @returns Object
  		*/
  var getFx: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_ILabel: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Sets the value of field
  		* @param field Object The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of fx
  		* @param fx Object The new value.
  		*/
  var setFx: js.UndefOr[js.Function1[/* fx */ js.UndefOr[js.Any], Unit]] = js.native
}

object ILabel {
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFx(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withGetField(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFx(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFx")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFx")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
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
    @scala.inline
    def withSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFx(value: /* fx */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFx")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFx")(js.undefined)
        ret
    }
  }
  
}

