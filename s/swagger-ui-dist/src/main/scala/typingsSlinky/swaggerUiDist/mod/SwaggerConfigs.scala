package typingsSlinky.swaggerUiDist.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.swaggerUiDist.swaggerUiDistStrings.full
import typingsSlinky.swaggerUiDist.swaggerUiDistStrings.list
import typingsSlinky.swaggerUiDist.swaggerUiDistStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerConfigs
  extends /* k */ StringDictionary[js.Any] {
  /**
    * URL to fetch external configuration document from.
    */
  var configUrl: js.UndefOr[String] = js.native
  /**
    * If set to true, enables deep linking for tags and operations. See the Deep Linking documentation for more information.
    */
  var deepLinking: js.UndefOr[Boolean] = js.native
  /**
    * Controls the default expansion setting for the operations and tags. It can be 'list' (expands only the tags), 'full' (expands the tags and operations) or 'none' (expands nothing).
    */
  var docExpansion: js.UndefOr[list | full | none] = js.native
  /**
    *  REQUIRED if dom_id is not provided. The HTML DOM element inside which SwaggerUI will put its user interface. Overrides dom_id.
    */
  var domNode: js.UndefOr[String | HTMLElement | Null] = js.native
  /**
    * REQUIRED if domNode is not provided. The ID of a DOM element inside which SwaggerUI will put its user interface.
    */
  var dom_id: js.UndefOr[String | Null] = js.native
  /**
    * The name of a component available via the plugin system to use as the top-level layout for Swagger UI.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * If set, limits the number of tagged operations displayed to at most this many. The default is to show all operations.
    */
  var maxDisplayedTags: js.UndefOr[Double] = js.native
  /**
    * Apply a sort to the operation list of each API.
    * It can be 'alpha' (sort by paths alphanumerically), 'method' (sort by HTTP method) or a function (see Array.prototype.sort() to know how sort function works).
    * Default is the order returned by the server unchanged.
    */
  var operationsSorter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * An array of plugin functions to use in Swagger UI.
    */
  var plugins: js.UndefOr[js.Any] = js.native
  /**
    * An array of presets to use in Swagger UI. Usually, you'll want to include ApisPreset if you use this option.
    */
  var presets: js.UndefOr[js.Array[_]] = js.native
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 requests.
    *  Accepts one argument requestInterceptor(request) and must return the modified request, or a Promise that resolves to the modified request.
    */
  var requestInterceptor: js.UndefOr[js.Function1[/* request */ SwaggerRequest, SwaggerRequest]] = js.native
  /**
    *  Function to intercept remote definition, "Try it out", and OAuth 2.0 responses.
    *  Accepts one argument responseInterceptor(response) and must return the modified response, or a Promise that resolves to the modified response.
    */
  var responseInterceptor: js.UndefOr[js.Function1[/* response */ SwaggerResponse, SwaggerResponse]] = js.native
  /**
    * A JavaScript object describing the OpenAPI definition. When used, the url parameter will not be parsed. This is useful for testing manually-generated definitions without hosting them.
    */
  var spec: js.UndefOr[Spec] = js.native
  /**
    * The URL pointing to API definition (normally swagger.json or swagger.yaml). Will be ignored if urls or spec is used.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * An array of API definition objects ([{url: "<url1>", name: "<name1>"},{url: "<url2>", name: "<name2>"}]) used by Topbar plugin. When used and Topbar plugin is enabled,
    * the url parameter will not be parsed. Names and URLs must be unique among all items in this array,
    * since they're used as identifiers.
    */
  var urls: js.UndefOr[js.Array[Url]] = js.native
}

object SwaggerConfigs {
  @scala.inline
  def apply(): SwaggerConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwaggerConfigs]
  }
  @scala.inline
  implicit class SwaggerConfigsOps[Self <: SwaggerConfigs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepLinking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLinking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLinking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLinking")(js.undefined)
        ret
    }
    @scala.inline
    def withDocExpansion(value: list | full | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withDomNodeHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomNode(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDomNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domNode")(null)
        ret
    }
    @scala.inline
    def withDom_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDom_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom_id")(js.undefined)
        ret
    }
    @scala.inline
    def withDom_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom_id")(null)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDisplayedTags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDisplayedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationsSorter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationsSorter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOperationsSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationsSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPresets(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presets")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestInterceptor(value: /* request */ SwaggerRequest => SwaggerRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestInterceptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptor")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseInterceptor(value: /* response */ SwaggerResponse => SwaggerResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResponseInterceptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpec(value: Spec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spec")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[Url]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

