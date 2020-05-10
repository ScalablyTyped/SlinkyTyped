package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImg extends IComponent {
  /** [Config Option] (String) */
  var backgroundCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Returns the value of backgroundCls
  		* @returns String
  		*/
  var getBackgroundCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of imageCls
  		* @returns String
  		*/
  var getImageCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of mode
  		* @returns String
  		*/
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of src
  		* @returns String
  		*/
  var getSrc: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Hides this Component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("hide")
  var hide_IImg: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var imageCls: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of backgroundCls
  		* @param backgroundCls String The new value.
  		*/
  var setBackgroundCls: js.UndefOr[js.Function1[/* backgroundCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of imageCls
  		* @param imageCls String The new value.
  		*/
  var setImageCls: js.UndefOr[js.Function1[/* imageCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of mode
  		* @param mode String The new value.
  		*/
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of src
  		* @param src String The new value.
  		*/
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Shows this component optionally using an animation
  		* @returns Ext.Component
  		*/
  @JSName("show")
  var show_IImg: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.native
}

object IImg {
  @scala.inline
  def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  @scala.inline
  implicit class IImgOps[Self <: IImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBackgroundCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBackgroundCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackgroundCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetImageCls(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageCls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetImageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMode(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSrc(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSrc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCls(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBackgroundCls(value: /* backgroundCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBackgroundCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBackgroundCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetImageCls(value: /* imageCls */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageCls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetImageCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageCls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMode(value: /* mode */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSrc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSrc")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
  }
  
}

