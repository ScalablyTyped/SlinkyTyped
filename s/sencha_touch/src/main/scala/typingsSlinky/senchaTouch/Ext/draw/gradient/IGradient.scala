package typingsSlinky.senchaTouch.Ext.draw.gradient

import typingsSlinky.senchaTouch.Ext.draw.engine.ISvgContext
import typingsSlinky.senchaTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGradient extends IIdentifiable {
  /** [Config Option] (Array/Object) */
  var Defines: js.UndefOr[js.Any] = js.native
  /** [Method] Generates the gradient for the given context
  		* @param ctx Ext.draw.engine.SvgContext The context.
  		* @param bbox Object
  		* @returns Object
  		*/
  var generateGradient: js.UndefOr[
    js.Function2[/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IGradient: js.UndefOr[js.Function0[String]] = js.native
}

object IGradient {
  @scala.inline
  def apply(): IGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGradient]
  }
  @scala.inline
  implicit class IGradientOps[Self <: IGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Defines")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateGradient(value: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateGradient")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
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

