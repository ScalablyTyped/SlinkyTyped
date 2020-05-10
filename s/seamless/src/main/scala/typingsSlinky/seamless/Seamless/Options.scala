package typingsSlinky.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If the fallback functionality is enabled.
    * @default false
    */
  var fallback: js.UndefOr[Boolean] = js.native
  /**
    * Text to add after the fallbackLinkText link.
    * @default 'to open in a separate window.'
    */
  var fallbackLinkAfter: js.UndefOr[String] = js.native
  /**
    * An array of string styles to add to the fallback link on hover.
    * @default [ 'background-color:#ebebeb', 'border-color:#adadad' ]
    */
  var fallbackLinkHoverStyles: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of string styles to add to the fallback link.
    * @default [ 'display: inline-block', 'color: #333', 'border: 1px solid #ccc', 'background-color: #fff', 'padding: 5px 10px', 'text-decoration: none', 'font-size: 12px', 'line-height: 1.5', 'border-radius: 6px', 'font-weight: 400', 'cursor: pointer', '-webkit-user-select: none', '-moz-user-select: none', '-ms-user-select: none', 'user-select: none' ]
    */
  var fallbackLinkStyles: js.UndefOr[js.Array[String]] = js.native
  /**
    * The string to show within the 'Click here' link to open the fallback window.
    * @default 'Click Here'
    */
  var fallbackLinkText: js.UndefOr[String] = js.native
  /**
    * Additional query params to attach to the fallback window when it is opened.
    * @default ''
    */
  var fallbackParams: js.UndefOr[String] = js.native
  /**
    * An array of string styles to add to the fallback text when something bad happens.
    * @default [ 'padding: 15px', 'border: 1px solid transparent', 'border-radius: 4px', 'color: #3a87ad', 'background-color: #d9edf7', 'border-color: #bce8f1' ]
    */
  var fallbackStyles: js.UndefOr[js.Array[String]] = js.native
  /**
    * A message to show below the child iframe to offer assistance if they are having problems.
    * @default ''
    */
  var fallbackText: js.UndefOr[String] = js.native
  /**
    * The height of the window that is opened up for the fallback.
    * @default 800
    */
  var fallbackWindowHeight: js.UndefOr[Double] = js.native
  /**
    * The width of the window that is opened up for the fallback.
    * @default 960
    */
  var fallbackWindowWidth: js.UndefOr[Double] = js.native
  /**
    * The text to show when the child page is loading.
    * @default 'Loading ...'
    */
  var loading: js.UndefOr[String] = js.native
  /**
    * Called when a child iframe has finished connecting.
    * @default null
    */
  var onConnect: js.UndefOr[(js.Function1[/* data */ js.Any, Unit]) | Null] = js.native
  /**
    * Show or not the loading indicator.
    * @default true
    */
  var showLoadingIndicator: js.UndefOr[Boolean] = js.native
  /**
    * The url of the spinner GIF that is shown when the child page is loading.
    * @default 'http://www.travistidwell.com/seamless.js/src/loader.gif'
    */
  var spinner: js.UndefOr[String] = js.native
  /**
    * The styles to inject into the child page.
    * @default []
    */
  var styles: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLinkAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLinkAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLinkHoverStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkHoverStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLinkHoverStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkHoverStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLinkStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLinkStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLinkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLinkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLinkText")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackParams(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackText")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackWindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackWindowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackWindowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackWindowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackWindowWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnect(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnConnectNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(null)
        ret
    }
    @scala.inline
    def withShowLoadingIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoadingIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoadingIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

