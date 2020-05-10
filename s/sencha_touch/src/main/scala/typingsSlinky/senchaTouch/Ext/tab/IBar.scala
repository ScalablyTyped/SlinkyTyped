package typingsSlinky.senchaTouch.Ext.tab

import typingsSlinky.senchaTouch.Ext.IToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBar extends IToolbar {
  /** [Config Option] (Number/String/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of activeTab
  		* @returns Number/String/Ext.Component
  		*/
  var getActiveTab: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of activeTab
  		* @param activeTab Number/String/Ext.Component The new value.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* activeTab */ js.UndefOr[js.Any], Unit]] = js.native
}

object IBar {
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTab(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTab")(js.undefined)
        ret
    }
    @scala.inline
    def withGetActiveTab(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTab")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTab")(js.undefined)
        ret
    }
    @scala.inline
    def withSetActiveTab(value: /* activeTab */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetActiveTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveTab")(js.undefined)
        ret
    }
  }
  
}

