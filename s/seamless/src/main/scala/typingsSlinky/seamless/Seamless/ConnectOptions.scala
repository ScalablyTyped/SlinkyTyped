package typingsSlinky.seamless.Seamless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOptions extends js.Object {
  /**
    * Allow appended styles to be injected.
    * @default false
    */
  var allowAppendedStyleInjection: js.UndefOr[Boolean] = js.native
  /**
    *  If this page should allow injected styles.
    *  @default false
    */
  var allowStyleInjection: js.UndefOr[Boolean] = js.native
  /**
    * The container for the main content on the page which determines the height of the page.
    * @default 'body'
    */
  var container: js.UndefOr[String] = js.native
  /**
    * The text to place after the link when the cookie test fails.
    * @default ' to open in a separate window.'
    */
  var cookieFallbackAfterMsg: js.UndefOr[String] = js.native
  /**
    * The text to place inside the link to have them open a new window if the cookie test fails.
    * @default 'Click Here'
    */
  var cookieFallbackLinkMsg: js.UndefOr[String] = js.native
  /**
    * The message to show if the cookie test fails.
    * @default 'Your browser requires this page to be opened in a separate window.'
    */
  var cookieFallbackMsg: js.UndefOr[String] = js.native
  /**
    *  Called when the parent connects to this iframe.
    *  @default null
    */
  var onConnect: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    *  Callback that is called when an update is triggered to the parent.
    *  @default null
    */
  var onUpdate: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  /**
    * If the child page requires cookies (See Child iFrame Cookie Problem section)
    * @default false
    */
  var requireCookies: js.UndefOr[Boolean] = js.native
  /**
    * The milliseconds that an update is created from the child to the parent.
    * @default 200
    */
  var update: js.UndefOr[Double] = js.native
  /**
    * The url of the parent page to connect to.
    * @default ''
    */
  var url: js.UndefOr[String] = js.native
}

object ConnectOptions {
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAppendedStyleInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAppendedStyleInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAppendedStyleInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAppendedStyleInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowStyleInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowStyleInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowStyleInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowStyleInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieFallbackAfterMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackAfterMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieFallbackAfterMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackAfterMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieFallbackLinkMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackLinkMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieFallbackLinkMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackLinkMsg")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieFallbackMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieFallbackMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieFallbackMsg")(js.undefined)
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
    def withOnUpdate(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireCookies(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCookies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireCookies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireCookies")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
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
  }
  
}

