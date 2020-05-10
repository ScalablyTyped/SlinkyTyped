package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComponent extends IContainer {
  /** [Config Option] (Boolean) */
  var autoSize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var fitSurface: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoSize
  		* @returns Boolean
  		*/
  var getAutoSize: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IComponent: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of fitSurface
  		* @returns Boolean
  		*/
  var getFitSurface: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of gradients
  		* @returns Object[]
  		*/
  var getGradients: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of resizeHandler
  		* @returns Function
  		*/
  var getResizeHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sprites
  		* @returns Object
  		*/
  var getSprites: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param id String
  		* @returns Ext.draw.Surface
  		*/
  var getSurface: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], ISurface]] = js.native
  /** [Method] Returns the value of viewBox
  		* @returns Boolean
  		*/
  var getViewBox: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Object[]) */
  var gradients: js.UndefOr[Array] = js.native
  /** [Method] Place water mark after resize  */
  var onPlaceWatermark: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Render all the surfaces in the component  */
  var renderFrame: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var resizeHandler: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of autoSize
  		* @param autoSize Boolean The new value.
  		*/
  var setAutoSize: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IComponent: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of fitSurface
  		* @param fitSurface Boolean The new value.
  		*/
  var setFitSurface: js.UndefOr[js.Function1[/* fitSurface */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of gradients
  		* @param gradients Object[] The new value.
  		*/
  var setGradients: js.UndefOr[js.Function1[/* gradients */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of resizeHandler
  		* @param resizeHandler Function The new value.
  		*/
  var setResizeHandler: js.UndefOr[js.Function1[/* resizeHandler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of sprites
  		* @param sprites Object The new value.
  		*/
  var setSprites: js.UndefOr[js.Function1[/* sprites */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of viewBox
  		* @param viewBox Boolean The new value.
  		*/
  var setViewBox: js.UndefOr[js.Function1[/* viewBox */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var viewBox: js.UndefOr[Boolean] = js.native
}

object IComponent {
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFitSurface(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitSurface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFitSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSize(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackground(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCls(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFitSurface(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFitSurface")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFitSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFitSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGradients(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGradients")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGradients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGradients")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResizeHandler(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResizeHandler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetResizeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResizeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSprites(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprites")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSprites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprites")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSurface(value: /* id */ js.UndefOr[String] => ISurface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewBox(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGradients(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaceWatermark(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaceWatermark")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPlaceWatermark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaceWatermark")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFrame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSize(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackground(value: /* background */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFitSurface(value: /* fitSurface */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFitSurface")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetFitSurface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFitSurface")(js.undefined)
        ret
    }
    @scala.inline
    def withSetGradients(value: /* gradients */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGradients")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetGradients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setGradients")(js.undefined)
        ret
    }
    @scala.inline
    def withSetResizeHandler(value: /* resizeHandler */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResizeHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetResizeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResizeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSprites(value: /* sprites */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSprites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprites")(js.undefined)
        ret
    }
    @scala.inline
    def withSetViewBox(value: /* viewBox */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewBox")(js.undefined)
        ret
    }
    @scala.inline
    def withViewBox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewBox")(js.undefined)
        ret
    }
  }
  
}

