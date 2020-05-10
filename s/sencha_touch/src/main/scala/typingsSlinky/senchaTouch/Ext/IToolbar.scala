package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToolbar extends IContainer {
  /** [Method] Returns the value of layout
  		* @returns Object/String
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns an Ext Title component
  		* @returns Ext.Title
  		*/
  var getTitle: js.UndefOr[js.Function0[ITitle]] = js.native
  /** [Method] Hides the title if it exists  */
  var hideTitle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  @JSName("minHeight")
  var minHeight_IToolbar: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of minHeight
  		* @param minHeight String The new value.
  		*/
  @JSName("setMinHeight")
  var setMinHeight_IToolbar: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Use this to update the title configuration
  		* @param title String/Ext.Title You can either pass a String, or a config/instance of Ext.Title.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Shows the title if it exists  */
  var showTitle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/Ext.Title) */
  var title: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var titleCls: js.UndefOr[Boolean] = js.native
}

object IToolbar {
  @scala.inline
  def apply(): IToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToolbar]
  }
  @scala.inline
  implicit class IToolbarOps[Self <: IToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLayout(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTitle(value: () => ITitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTitle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHideTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMinHeight(value: /* minHeight */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTitle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShowTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCls")(js.undefined)
        ret
    }
  }
  
}

