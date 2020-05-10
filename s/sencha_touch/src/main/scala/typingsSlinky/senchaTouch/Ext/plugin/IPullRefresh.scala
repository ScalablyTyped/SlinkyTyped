package typingsSlinky.senchaTouch.Ext.plugin

import typingsSlinky.senchaTouch.Ext.IComponent
import typingsSlinky.senchaTouch.Ext.dataview.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPullRefresh extends IComponent {
  /** [Config Option] (Boolean) */
  var autoSnapBack: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoSnapBack
  		* @returns Boolean
  		*/
  var getAutoSnapBack: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of lastUpdatedDateFormat
  		* @returns String
  		*/
  var getLastUpdatedDateFormat: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of lastUpdatedText
  		* @returns String
  		*/
  var getLastUpdatedText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of list
  		* @returns Ext.dataview.List
  		*/
  var getList: js.UndefOr[js.Function0[IList]] = js.native
  /** [Method] Returns the value of loadedText
  		* @returns String
  		*/
  var getLoadedText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of overpullSnapBackDuration
  		* @returns Number
  		*/
  var getOverpullSnapBackDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of pullText
  		* @returns String
  		*/
  var getPullText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of pullTpl
  		* @returns Ext.XTemplate/String/Array
  		*/
  var getPullTpl: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of releaseText
  		* @returns String
  		*/
  var getReleaseText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of scrollerAutoRefresh
  		* @returns Boolean
  		*/
  var getScrollerAutoRefresh: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of snappingAnimationDuration
  		* @returns Number
  		*/
  var getSnappingAnimationDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of translatable
  		* @returns Boolean
  		*/
  var getTranslatable: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var lastUpdatedDateFormat: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var lastUpdatedText: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.dataview.List) */
  var list: js.UndefOr[IList] = js.native
  /** [Config Option] (String) */
  var loadedText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var overpullSnapBackDuration: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var pullRefreshText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var pullReleaseText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var pullText: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.XTemplate/String/Array) */
  var pullTpl: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var releaseText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var scrollerAutoRefresh: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of autoSnapBack
  		* @param autoSnapBack Boolean The new value.
  		*/
  var setAutoSnapBack: js.UndefOr[js.Function1[/* autoSnapBack */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of lastUpdatedDateFormat
  		* @param lastUpdatedDateFormat String The new value.
  		*/
  var setLastUpdatedDateFormat: js.UndefOr[js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of lastUpdatedText
  		* @param lastUpdatedText String The new value.
  		*/
  var setLastUpdatedText: js.UndefOr[js.Function1[/* lastUpdatedText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of list
  		* @param list Ext.dataview.List The new value.
  		*/
  var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[IList], Unit]] = js.native
  /** [Method] Sets the value of loadedText
  		* @param loadedText String The new value.
  		*/
  var setLoadedText: js.UndefOr[js.Function1[/* loadedText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of overpullSnapBackDuration
  		* @param overpullSnapBackDuration Number The new value.
  		*/
  var setOverpullSnapBackDuration: js.UndefOr[js.Function1[/* overpullSnapBackDuration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Updates the PullRefreshText
  		* @param text String
  		*/
  var setPullRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of pullText
  		* @param pullText String The new value.
  		*/
  var setPullText: js.UndefOr[js.Function1[/* pullText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of pullTpl
  		* @param pullTpl Ext.XTemplate/String/Array The new value.
  		*/
  var setPullTpl: js.UndefOr[js.Function1[/* pullTpl */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Updates the ReleaseRefreshText
  		* @param text String
  		*/
  var setReleaseRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of releaseText
  		* @param releaseText String The new value.
  		*/
  var setReleaseText: js.UndefOr[js.Function1[/* releaseText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of scrollerAutoRefresh
  		* @param scrollerAutoRefresh Boolean The new value.
  		*/
  var setScrollerAutoRefresh: js.UndefOr[js.Function1[/* scrollerAutoRefresh */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of snappingAnimationDuration
  		* @param snappingAnimationDuration Number The new value.
  		*/
  var setSnappingAnimationDuration: js.UndefOr[js.Function1[/* snappingAnimationDuration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of translatable
  		* @param translatable Boolean The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Snaps the List back to the top after a pullrefresh is complete
  		* @param force Boolean Force the snapback to occur regardless of state {optional}
  		*/
  var snapBack: js.UndefOr[js.Function1[/* force */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Number) */
  var snappingAnimationDuration: js.UndefOr[Double] = js.native
}

object IPullRefresh {
  @scala.inline
  def apply(): IPullRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPullRefresh]
  }
  @scala.inline
  implicit class IPullRefreshOps[Self <: IPullRefresh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSnapBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSnapBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSnapBack")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoSnapBack(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSnapBack")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoSnapBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoSnapBack")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLastUpdatedDateFormat(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdatedDateFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLastUpdatedDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdatedDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLastUpdatedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdatedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLastUpdatedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastUpdatedText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetList(value: () => IList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getList")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoadedText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadedText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoadedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadedText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoadingText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOverpullSnapBackDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverpullSnapBackDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOverpullSnapBackDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverpullSnapBackDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPullText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPullText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPullText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPullText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPullTpl(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPullTpl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPullTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPullTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReleaseText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReleaseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReleaseText")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScrollerAutoRefresh(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollerAutoRefresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScrollerAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScrollerAutoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSnappingAnimationDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnappingAnimationDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSnappingAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSnappingAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTranslatable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslatable")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedText")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: IList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withOverpullSnapBackDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overpullSnapBackDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverpullSnapBackDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overpullSnapBackDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRefreshText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRefreshText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRefreshText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullReleaseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullReleaseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullReleaseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullReleaseText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullText")(js.undefined)
        ret
    }
    @scala.inline
    def withPullTpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseText")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollerAutoRefresh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerAutoRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollerAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollerAutoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoSnapBack(value: /* autoSnapBack */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSnapBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoSnapBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoSnapBack")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLastUpdatedDateFormat(value: /* lastUpdatedDateFormat */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastUpdatedDateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLastUpdatedDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastUpdatedDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLastUpdatedText(value: /* lastUpdatedText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastUpdatedText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLastUpdatedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLastUpdatedText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetList(value: /* list */ js.UndefOr[IList] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setList")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadedText(value: /* loadedText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadedText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadedText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoadingText(value: /* loadingText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoadingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoadingText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOverpullSnapBackDuration(value: /* overpullSnapBackDuration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverpullSnapBackDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOverpullSnapBackDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOverpullSnapBackDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPullRefreshText(value: /* text */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullRefreshText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPullRefreshText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullRefreshText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPullText(value: /* pullText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPullText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPullTpl(value: /* pullTpl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullTpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPullTpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPullTpl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReleaseRefreshText(value: /* text */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReleaseRefreshText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReleaseRefreshText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReleaseRefreshText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReleaseText(value: /* releaseText */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReleaseText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReleaseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReleaseText")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollerAutoRefresh(value: /* scrollerAutoRefresh */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollerAutoRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScrollerAutoRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollerAutoRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSnappingAnimationDuration(value: /* snappingAnimationDuration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSnappingAnimationDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSnappingAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSnappingAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTranslatable(value: /* translatable */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTranslatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTranslatable")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapBack(value: /* force */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapBack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSnapBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapBack")(js.undefined)
        ret
    }
    @scala.inline
    def withSnappingAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappingAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnappingAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappingAnimationDuration")(js.undefined)
        ret
    }
  }
  
}

