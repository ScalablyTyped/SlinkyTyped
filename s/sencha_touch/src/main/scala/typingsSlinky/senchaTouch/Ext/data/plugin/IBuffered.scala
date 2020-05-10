package typingsSlinky.senchaTouch.Ext.data.plugin

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuffered extends IEvented {
  /** [Method] Returns the value of bufferedCollection
  		* @returns Object
  		*/
  var getBufferedCollection: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of leadingBufferZone
  		* @returns Number
  		*/
  var getLeadingBufferZone: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Returns the value of purgePageCount
  		* @returns Number
  		*/
  var getPurgePageCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of store
  		* @returns Object
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of trailingBufferZone
  		* @returns Number
  		*/
  var getTrailingBufferZone: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of viewSize
  		* @returns Number
  		*/
  var getViewSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of bufferedCollection
  		* @param bufferedCollection Object The new value.
  		*/
  var setBufferedCollection: js.UndefOr[js.Function1[/* bufferedCollection */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of leadingBufferZone
  		* @param leadingBufferZone Number The new value.
  		*/
  var setLeadingBufferZone: js.UndefOr[js.Function1[/* leadingBufferZone */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of purgePageCount
  		* @param purgePageCount Number The new value.
  		*/
  var setPurgePageCount: js.UndefOr[js.Function1[/* purgePageCount */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of store
  		* @param store Object The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of trailingBufferZone
  		* @param trailingBufferZone Number The new value.
  		*/
  var setTrailingBufferZone: js.UndefOr[js.Function1[/* trailingBufferZone */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of viewSize
  		* @param viewSize Number The new value.
  		*/
  var setViewSize: js.UndefOr[js.Function1[/* viewSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
}

object IBuffered {
  @scala.inline
  def apply(): IBuffered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuffered]
  }
  @scala.inline
  implicit class IBufferedOps[Self <: IBuffered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBufferedCollection(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBufferedCollection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBufferedCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBufferedCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLeadingBufferZone(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeadingBufferZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLeadingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLeadingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPageFromRecordIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageFromRecordIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPurgePageCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPurgePageCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPurgePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPurgePageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTrailingBufferZone(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrailingBufferZone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTrailingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrailingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withGetViewSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetViewSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetch(value: /* options */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrefetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrefetchPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchPage")(js.undefined)
        ret
    }
    @scala.inline
    def withPurgePageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgePageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurgePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purgePageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBufferedCollection(value: /* bufferedCollection */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBufferedCollection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBufferedCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBufferedCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLeadingBufferZone(value: /* leadingBufferZone */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeadingBufferZone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLeadingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLeadingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPurgePageCount(value: /* purgePageCount */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPurgePageCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPurgePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPurgePageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTrailingBufferZone(value: /* trailingBufferZone */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrailingBufferZone")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTrailingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTrailingBufferZone")(js.undefined)
        ret
    }
    @scala.inline
    def withSetViewSize(value: /* viewSize */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetViewSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingBufferZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingBufferZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingBufferZone")(js.undefined)
        ret
    }
  }
  
}

