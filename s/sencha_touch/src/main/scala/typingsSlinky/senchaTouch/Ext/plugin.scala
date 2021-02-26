package typingsSlinky.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugin {
  
  @js.native
  trait IBufferedList extends IBase {
    
    /** [Method] Returns the value of list
      * @returns Object
      */
    var getList: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of list
      * @param list Object The new value.
      */
    var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IBufferedList {
    
    @scala.inline
    def apply(): IBufferedList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBufferedList]
    }
    
    @scala.inline
    implicit class IBufferedListMutableBuilder[Self <: IBufferedList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetList(value: () => _): Self = StObject.set(x, "getList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListUndefined: Self = StObject.set(x, "getList", js.undefined)
      
      @scala.inline
      def setSetList(value: /* list */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetListUndefined: Self = StObject.set(x, "setList", js.undefined)
    }
  }
  
  @js.native
  trait IListPaging extends IComponent {
    
    /** [Config Option] (Boolean) */
    var autoPaging: js.UndefOr[Boolean] = js.native
    
    /** [Method] Returns the value of autoPaging
      * @returns Boolean
      */
    var getAutoPaging: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of loadMoreText
      * @returns String
      */
    var getLoadMoreText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of noMoreRecordsText
      * @returns String
      */
    var getNoMoreRecordsText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Config Option] (String) */
    var loadMoreText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var noMoreRecordsText: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Sets the value of autoPaging
      * @param autoPaging Boolean The new value.
      */
    var setAutoPaging: js.UndefOr[js.Function1[/* autoPaging */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of loadMoreText
      * @param loadMoreText String The new value.
      */
    var setLoadMoreText: js.UndefOr[js.Function1[/* loadMoreText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of noMoreRecordsText
      * @param noMoreRecordsText String The new value.
      */
    var setNoMoreRecordsText: js.UndefOr[js.Function1[/* noMoreRecordsText */ js.UndefOr[java.lang.String], Unit]] = js.native
  }
  object IListPaging {
    
    @scala.inline
    def apply(): IListPaging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IListPaging]
    }
    
    @scala.inline
    implicit class IListPagingMutableBuilder[Self <: IListPaging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPaging(value: Boolean): Self = StObject.set(x, "autoPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPagingUndefined: Self = StObject.set(x, "autoPaging", js.undefined)
      
      @scala.inline
      def setGetAutoPaging(value: () => Boolean): Self = StObject.set(x, "getAutoPaging", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoPagingUndefined: Self = StObject.set(x, "getAutoPaging", js.undefined)
      
      @scala.inline
      def setGetLoadMoreText(value: () => java.lang.String): Self = StObject.set(x, "getLoadMoreText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLoadMoreTextUndefined: Self = StObject.set(x, "getLoadMoreText", js.undefined)
      
      @scala.inline
      def setGetNoMoreRecordsText(value: () => java.lang.String): Self = StObject.set(x, "getNoMoreRecordsText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNoMoreRecordsTextUndefined: Self = StObject.set(x, "getNoMoreRecordsText", js.undefined)
      
      @scala.inline
      def setLoadMoreText(value: java.lang.String): Self = StObject.set(x, "loadMoreText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMoreTextUndefined: Self = StObject.set(x, "loadMoreText", js.undefined)
      
      @scala.inline
      def setNoMoreRecordsText(value: java.lang.String): Self = StObject.set(x, "noMoreRecordsText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoMoreRecordsTextUndefined: Self = StObject.set(x, "noMoreRecordsText", js.undefined)
      
      @scala.inline
      def setSetAutoPaging(value: /* autoPaging */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoPaging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAutoPagingUndefined: Self = StObject.set(x, "setAutoPaging", js.undefined)
      
      @scala.inline
      def setSetLoadMoreText(value: /* loadMoreText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLoadMoreText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLoadMoreTextUndefined: Self = StObject.set(x, "setLoadMoreText", js.undefined)
      
      @scala.inline
      def setSetNoMoreRecordsText(value: /* noMoreRecordsText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setNoMoreRecordsText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNoMoreRecordsTextUndefined: Self = StObject.set(x, "setNoMoreRecordsText", js.undefined)
    }
  }
  
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
    var getLastUpdatedDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of lastUpdatedText
      * @returns String
      */
    var getLastUpdatedText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of list
      * @returns Ext.dataview.List
      */
    var getList: js.UndefOr[js.Function0[typingsSlinky.senchaTouch.Ext.dataview.IList]] = js.native
    
    /** [Method] Returns the value of loadedText
      * @returns String
      */
    var getLoadedText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of loadingText
      * @returns String
      */
    var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of overpullSnapBackDuration
      * @returns Number
      */
    var getOverpullSnapBackDuration: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of pullText
      * @returns String
      */
    var getPullText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of pullTpl
      * @returns Ext.XTemplate/String/Array
      */
    var getPullTpl: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of releaseText
      * @returns String
      */
    var getReleaseText: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
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
    var lastUpdatedDateFormat: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var lastUpdatedText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Ext.dataview.List) */
    var list: js.UndefOr[typingsSlinky.senchaTouch.Ext.dataview.IList] = js.native
    
    /** [Config Option] (String) */
    var loadedText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var loadingText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Number) */
    var overpullSnapBackDuration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (String) */
    var pullRefreshText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var pullReleaseText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (String) */
    var pullText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Ext.XTemplate/String/Array) */
    var pullTpl: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var releaseText: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var scrollerAutoRefresh: js.UndefOr[Boolean] = js.native
    
    /** [Method] Sets the value of autoSnapBack
      * @param autoSnapBack Boolean The new value.
      */
    var setAutoSnapBack: js.UndefOr[js.Function1[/* autoSnapBack */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of lastUpdatedDateFormat
      * @param lastUpdatedDateFormat String The new value.
      */
    var setLastUpdatedDateFormat: js.UndefOr[js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of lastUpdatedText
      * @param lastUpdatedText String The new value.
      */
    var setLastUpdatedText: js.UndefOr[js.Function1[/* lastUpdatedText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of list
      * @param list Ext.dataview.List The new value.
      */
    var setList: js.UndefOr[
        js.Function1[/* list */ js.UndefOr[typingsSlinky.senchaTouch.Ext.dataview.IList], Unit]
      ] = js.native
    
    /** [Method] Sets the value of loadedText
      * @param loadedText String The new value.
      */
    var setLoadedText: js.UndefOr[js.Function1[/* loadedText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of loadingText
      * @param loadingText String The new value.
      */
    var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of overpullSnapBackDuration
      * @param overpullSnapBackDuration Number The new value.
      */
    var setOverpullSnapBackDuration: js.UndefOr[js.Function1[/* overpullSnapBackDuration */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Updates the PullRefreshText
      * @param text String
      */
    var setPullRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of pullText
      * @param pullText String The new value.
      */
    var setPullText: js.UndefOr[js.Function1[/* pullText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of pullTpl
      * @param pullTpl Ext.XTemplate/String/Array The new value.
      */
    var setPullTpl: js.UndefOr[js.Function1[/* pullTpl */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Updates the ReleaseRefreshText
      * @param text String
      */
    var setReleaseRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of releaseText
      * @param releaseText String The new value.
      */
    var setReleaseText: js.UndefOr[js.Function1[/* releaseText */ js.UndefOr[java.lang.String], Unit]] = js.native
    
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
    implicit class IPullRefreshMutableBuilder[Self <: IPullRefresh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSnapBack(value: Boolean): Self = StObject.set(x, "autoSnapBack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSnapBackUndefined: Self = StObject.set(x, "autoSnapBack", js.undefined)
      
      @scala.inline
      def setGetAutoSnapBack(value: () => Boolean): Self = StObject.set(x, "getAutoSnapBack", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoSnapBackUndefined: Self = StObject.set(x, "getAutoSnapBack", js.undefined)
      
      @scala.inline
      def setGetLastUpdatedDateFormat(value: () => java.lang.String): Self = StObject.set(x, "getLastUpdatedDateFormat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastUpdatedDateFormatUndefined: Self = StObject.set(x, "getLastUpdatedDateFormat", js.undefined)
      
      @scala.inline
      def setGetLastUpdatedText(value: () => java.lang.String): Self = StObject.set(x, "getLastUpdatedText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastUpdatedTextUndefined: Self = StObject.set(x, "getLastUpdatedText", js.undefined)
      
      @scala.inline
      def setGetList(value: () => typingsSlinky.senchaTouch.Ext.dataview.IList): Self = StObject.set(x, "getList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListUndefined: Self = StObject.set(x, "getList", js.undefined)
      
      @scala.inline
      def setGetLoadedText(value: () => java.lang.String): Self = StObject.set(x, "getLoadedText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLoadedTextUndefined: Self = StObject.set(x, "getLoadedText", js.undefined)
      
      @scala.inline
      def setGetLoadingText(value: () => java.lang.String): Self = StObject.set(x, "getLoadingText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLoadingTextUndefined: Self = StObject.set(x, "getLoadingText", js.undefined)
      
      @scala.inline
      def setGetOverpullSnapBackDuration(value: () => Double): Self = StObject.set(x, "getOverpullSnapBackDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOverpullSnapBackDurationUndefined: Self = StObject.set(x, "getOverpullSnapBackDuration", js.undefined)
      
      @scala.inline
      def setGetPullText(value: () => java.lang.String): Self = StObject.set(x, "getPullText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPullTextUndefined: Self = StObject.set(x, "getPullText", js.undefined)
      
      @scala.inline
      def setGetPullTpl(value: () => _): Self = StObject.set(x, "getPullTpl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPullTplUndefined: Self = StObject.set(x, "getPullTpl", js.undefined)
      
      @scala.inline
      def setGetReleaseText(value: () => java.lang.String): Self = StObject.set(x, "getReleaseText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetReleaseTextUndefined: Self = StObject.set(x, "getReleaseText", js.undefined)
      
      @scala.inline
      def setGetScrollerAutoRefresh(value: () => Boolean): Self = StObject.set(x, "getScrollerAutoRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollerAutoRefreshUndefined: Self = StObject.set(x, "getScrollerAutoRefresh", js.undefined)
      
      @scala.inline
      def setGetSnappingAnimationDuration(value: () => Double): Self = StObject.set(x, "getSnappingAnimationDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSnappingAnimationDurationUndefined: Self = StObject.set(x, "getSnappingAnimationDuration", js.undefined)
      
      @scala.inline
      def setGetTranslatable(value: () => Boolean): Self = StObject.set(x, "getTranslatable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      @scala.inline
      def setLastUpdatedDateFormat(value: java.lang.String): Self = StObject.set(x, "lastUpdatedDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedDateFormatUndefined: Self = StObject.set(x, "lastUpdatedDateFormat", js.undefined)
      
      @scala.inline
      def setLastUpdatedText(value: java.lang.String): Self = StObject.set(x, "lastUpdatedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUpdatedTextUndefined: Self = StObject.set(x, "lastUpdatedText", js.undefined)
      
      @scala.inline
      def setList(value: typingsSlinky.senchaTouch.Ext.dataview.IList): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoadedText(value: java.lang.String): Self = StObject.set(x, "loadedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedTextUndefined: Self = StObject.set(x, "loadedText", js.undefined)
      
      @scala.inline
      def setLoadingText(value: java.lang.String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      @scala.inline
      def setOverpullSnapBackDuration(value: Double): Self = StObject.set(x, "overpullSnapBackDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverpullSnapBackDurationUndefined: Self = StObject.set(x, "overpullSnapBackDuration", js.undefined)
      
      @scala.inline
      def setPullRefreshText(value: java.lang.String): Self = StObject.set(x, "pullRefreshText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRefreshTextUndefined: Self = StObject.set(x, "pullRefreshText", js.undefined)
      
      @scala.inline
      def setPullReleaseText(value: java.lang.String): Self = StObject.set(x, "pullReleaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullReleaseTextUndefined: Self = StObject.set(x, "pullReleaseText", js.undefined)
      
      @scala.inline
      def setPullText(value: java.lang.String): Self = StObject.set(x, "pullText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullTextUndefined: Self = StObject.set(x, "pullText", js.undefined)
      
      @scala.inline
      def setPullTpl(value: js.Any): Self = StObject.set(x, "pullTpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullTplUndefined: Self = StObject.set(x, "pullTpl", js.undefined)
      
      @scala.inline
      def setReleaseText(value: java.lang.String): Self = StObject.set(x, "releaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseTextUndefined: Self = StObject.set(x, "releaseText", js.undefined)
      
      @scala.inline
      def setScrollerAutoRefresh(value: Boolean): Self = StObject.set(x, "scrollerAutoRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollerAutoRefreshUndefined: Self = StObject.set(x, "scrollerAutoRefresh", js.undefined)
      
      @scala.inline
      def setSetAutoSnapBack(value: /* autoSnapBack */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoSnapBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAutoSnapBackUndefined: Self = StObject.set(x, "setAutoSnapBack", js.undefined)
      
      @scala.inline
      def setSetLastUpdatedDateFormat(value: /* lastUpdatedDateFormat */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLastUpdatedDateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLastUpdatedDateFormatUndefined: Self = StObject.set(x, "setLastUpdatedDateFormat", js.undefined)
      
      @scala.inline
      def setSetLastUpdatedText(value: /* lastUpdatedText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLastUpdatedText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLastUpdatedTextUndefined: Self = StObject.set(x, "setLastUpdatedText", js.undefined)
      
      @scala.inline
      def setSetList(value: /* list */ js.UndefOr[typingsSlinky.senchaTouch.Ext.dataview.IList] => Unit): Self = StObject.set(x, "setList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetListUndefined: Self = StObject.set(x, "setList", js.undefined)
      
      @scala.inline
      def setSetLoadedText(value: /* loadedText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLoadedText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLoadedTextUndefined: Self = StObject.set(x, "setLoadedText", js.undefined)
      
      @scala.inline
      def setSetLoadingText(value: /* loadingText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
      
      @scala.inline
      def setSetOverpullSnapBackDuration(value: /* overpullSnapBackDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setOverpullSnapBackDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOverpullSnapBackDurationUndefined: Self = StObject.set(x, "setOverpullSnapBackDuration", js.undefined)
      
      @scala.inline
      def setSetPullRefreshText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPullRefreshText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPullRefreshTextUndefined: Self = StObject.set(x, "setPullRefreshText", js.undefined)
      
      @scala.inline
      def setSetPullText(value: /* pullText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPullText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPullTextUndefined: Self = StObject.set(x, "setPullText", js.undefined)
      
      @scala.inline
      def setSetPullTpl(value: /* pullTpl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPullTpl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPullTplUndefined: Self = StObject.set(x, "setPullTpl", js.undefined)
      
      @scala.inline
      def setSetReleaseRefreshText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setReleaseRefreshText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReleaseRefreshTextUndefined: Self = StObject.set(x, "setReleaseRefreshText", js.undefined)
      
      @scala.inline
      def setSetReleaseText(value: /* releaseText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setReleaseText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReleaseTextUndefined: Self = StObject.set(x, "setReleaseText", js.undefined)
      
      @scala.inline
      def setSetScrollerAutoRefresh(value: /* scrollerAutoRefresh */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setScrollerAutoRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScrollerAutoRefreshUndefined: Self = StObject.set(x, "setScrollerAutoRefresh", js.undefined)
      
      @scala.inline
      def setSetSnappingAnimationDuration(value: /* snappingAnimationDuration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setSnappingAnimationDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSnappingAnimationDurationUndefined: Self = StObject.set(x, "setSnappingAnimationDuration", js.undefined)
      
      @scala.inline
      def setSetTranslatable(value: /* translatable */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
      
      @scala.inline
      def setSnapBack(value: /* force */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "snapBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSnapBackUndefined: Self = StObject.set(x, "snapBack", js.undefined)
      
      @scala.inline
      def setSnappingAnimationDuration(value: Double): Self = StObject.set(x, "snappingAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnappingAnimationDurationUndefined: Self = StObject.set(x, "snappingAnimationDuration", js.undefined)
    }
  }
  
  @js.native
  trait ISortableList extends IComponent {
    
    /** [Method] Returns the value of handleSelector
      * @returns String
      */
    var getHandleSelector: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of list
      * @returns Object
      */
    var getList: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of handleSelector
      * @param handleSelector String The new value.
      */
    var setHandleSelector: js.UndefOr[js.Function1[/* handleSelector */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of list
      * @param list Object The new value.
      */
    var setList: js.UndefOr[js.Function1[/* list */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object ISortableList {
    
    @scala.inline
    def apply(): ISortableList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISortableList]
    }
    
    @scala.inline
    implicit class ISortableListMutableBuilder[Self <: ISortableList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHandleSelector(value: () => java.lang.String): Self = StObject.set(x, "getHandleSelector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHandleSelectorUndefined: Self = StObject.set(x, "getHandleSelector", js.undefined)
      
      @scala.inline
      def setGetList(value: () => _): Self = StObject.set(x, "getList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetListUndefined: Self = StObject.set(x, "getList", js.undefined)
      
      @scala.inline
      def setSetHandleSelector(value: /* handleSelector */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHandleSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHandleSelectorUndefined: Self = StObject.set(x, "setHandleSelector", js.undefined)
      
      @scala.inline
      def setSetList(value: /* list */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetListUndefined: Self = StObject.set(x, "setList", js.undefined)
    }
  }
}
