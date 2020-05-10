package typingsSlinky.tabulatorTables.Tabulator

import typingsSlinky.tabulatorTables.tabulatorTablesStrings.form
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.json
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.load
import typingsSlinky.tabulatorTables.tabulatorTablesStrings.scroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsData extends js.Object {
  /** The HTTP request type for Ajax requests or config object for the request	 */
  var ajaxConfig: js.UndefOr[HttpMethod | AjaxConfig] = js.native
  /** When using a request method other than "GET" Tabulator will send any parameters with a content type of form data. You can change the content type with the ajaxContentType option. This will ensure parameters are sent in the format you expect, with the correct headers. * * The ajaxContentType option can take one of two values:
    "form" - send parameters as form data (default option)
    "json" - send parameters as JSON encoded string
    If you want to use a custom content type then you can pass a content type formatter object into the ajaxContentType option. this object must have two properties, the headers property should contain all headers that should be sent with the request and the body property should contain a function that returns the body content of the request
    */
  var ajaxContentType: js.UndefOr[form | json | AjaxContentType] = js.native
  /** The ajaxError callback is triggered there is an error response to an ajax request. */
  var ajaxError: js.UndefOr[
    js.Function3[/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any, Unit]
  ] = js.native
  /** Send filter config to server instead of processing locally	 */
  var ajaxFiltering: js.UndefOr[Boolean] = js.native
  /** Show loader while data is loading, can also take a function that must return a boolean	 */
  var ajaxLoader: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  /** html for the loader element in the event of an error	 */
  var ajaxLoaderError: js.UndefOr[String] = js.native
  /** html for loader element	 */
  var ajaxLoaderLoading: js.UndefOr[String] = js.native
  /** Parameters to be passed to remote Ajax data loading request	 */
  var ajaxParams: js.UndefOr[js.Object] = js.native
  /** If you are loading a lot of data from a remote source into your table in one go, it can sometimes take a long time for the server to return the request, which can slow down the user experience.
    To speed things up in this situation Tabulator has a progressive load mode, this uses the pagination module to make a series of requests for part of the data set, one at a time, appending it to the table as the data arrives. This mode can be enable using the ajaxProgressiveLoad option. No pagination controls will be visible on screen, it just reusues the functionality of the pagination module to sequentially load the data.
    With this mode enabled, all of the settings outlined in the Ajax Documentation are still available
    There are two different progressive loading modes, to give you a choice of how data is loaded into the table.	 */
  var ajaxProgressiveLoad: js.UndefOr[load | scroll] = js.native
  /** By default tabulator will make the requests to fill the table as quickly as possible. On some servers these repeates requests from the same client may trigger rate limiting or security systems. In this case you can use the ajaxProgressiveLoadDelay option to add a delay in milliseconds between each page request. */
  var ajaxProgressiveLoadDelay: js.UndefOr[Double] = js.native
  /** The ajaxProgressiveLoadScrollMargin property determines how close to the bottom of the table in pixels, the scroll bar must be before the next page worth of data is loaded, by default it is set to twice the height of the table. */
  var ajaxProgressiveLoadScrollMargin: js.UndefOr[Double] = js.native
  /** callback function to replace inbuilt ajax request functionality	 */
  var ajaxRequestFunc: js.UndefOr[
    js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, js.Promise[_]]
  ] = js.native
  /** The ajaxRequesting callback is triggered when ever an ajax request is made. */
  var ajaxRequesting: js.UndefOr[js.Function2[/* url */ String, /* params */ js.Any, Boolean]] = js.native
  /** The ajaxResponse callback is triggered when a successful ajax request has been made. This callback can also be used to modify the received data before it is parsed by the table. If you use this callback it must return the data to be parsed by Tabulator, otherwise no data will be rendered */
  var ajaxResponse: js.UndefOr[js.Function3[/* url */ String, /* params */ js.Any, /* response */ js.Any, _]] = js.native
  /** Send sorter config to server instead of processing locally	 */
  var ajaxSorting: js.UndefOr[Boolean] = js.native
  /** If you wish to retrieve your data from a remote source you can set the URL for the request in the ajaxURL option. */
  var ajaxURL: js.UndefOr[String] = js.native
  /** If you need more control over the url of the request that you can get from the ajaxURL and ajaxParams properties, the you can use the ajaxURLGenerator property to pass in a callback that will generate the URL for you.
    The callback should return a string representing the URL to be requested. */
  var ajaxURLGenerator: js.UndefOr[js.Function3[/* url */ String, /* config */ js.Any, /* params */ js.Any, String]] = js.native
  /** Array to hold data that should be loaded on table creation	 */
  var data: js.UndefOr[js.Array[_]] = js.native
  /** A unique index value should be present for each row of data if you want to be able to programatically alter that data at a later point, this should be either numeric or a string. By default Tabulator will look for this value in the id field for the data. If you wish to use a different field as the index, set this using the index option parameter. */
  var index: js.UndefOr[Double | String] = js.native
}

object OptionsData {
  @scala.inline
  def apply(): OptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsData]
  }
  @scala.inline
  implicit class OptionsDataOps[Self <: OptionsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxConfig(value: HttpMethod | AjaxConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxContentType(value: form | json | AjaxContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxError(value: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAjaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxLoaderFunction0(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAjaxLoader(value: Boolean | js.Function0[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoader")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxLoaderError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoaderError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxLoaderError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoaderError")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxLoaderLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoaderLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxLoaderLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxLoaderLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxProgressiveLoad(value: load | scroll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxProgressiveLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxProgressiveLoadDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoadDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxProgressiveLoadDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoadDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxProgressiveLoadScrollMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoadScrollMargin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxProgressiveLoadScrollMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxProgressiveLoadScrollMargin")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxRequestFunc(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestFunc")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAjaxRequestFunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequestFunc")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxRequesting(value: (/* url */ String, /* params */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequesting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAjaxRequesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxRequesting")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxResponse(value: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxResponse")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAjaxResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxURL")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxURLGenerator(value: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxURLGenerator")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAjaxURLGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxURLGenerator")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

