package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides response data for a paged request to retrieve details about products that can be purchased from within the current app. */
@js.native
trait StoreProductPagedQueryResult extends js.Object {
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  /** Gets a value that indicates whether there are additional pages of results. To get the next page of results, use the GetNextAsync method. */
  var hasMoreResults: Boolean = js.native
  /** Gets the collection of products returned by the request. */
  var products: IMapView[String, StoreProduct] = js.native
  /**
    * Returns the next page of results. To determine if there are more pages of results, use the HasMoreResults property.
    * @return An asynchronous operation that, on successful completion, returns a StoreProductPagedQueryResult object that provides the next page of results.
    */
  def getNextAsync(): IPromiseWithIAsyncOperation[StoreProductPagedQueryResult] = js.native
}

object StoreProductPagedQueryResult {
  @scala.inline
  def apply(
    extendedError: WinRTError,
    getNextAsync: () => IPromiseWithIAsyncOperation[StoreProductPagedQueryResult],
    hasMoreResults: Boolean,
    products: IMapView[String, StoreProduct]
  ): StoreProductPagedQueryResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], getNextAsync = js.Any.fromFunction0(getNextAsync), hasMoreResults = hasMoreResults.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProductPagedQueryResult]
  }
  @scala.inline
  implicit class StoreProductPagedQueryResultOps[Self <: StoreProductPagedQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedError(value: WinRTError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNextAsync(value: () => IPromiseWithIAsyncOperation[StoreProductPagedQueryResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProducts(value: IMapView[String, StoreProduct]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("products")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

