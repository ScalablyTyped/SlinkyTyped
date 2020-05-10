package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the arguments passed to the application on startup.
  * Use the [getArguments](Titanium.App.getArguments) method to retrieve the launch options.
  */
@js.native
trait launchOptions extends js.Object {
  /**
  	 * If set to `true`, this key indicates that the application was launched in response to an
  	 * incoming location event.
  	 */
  var launchOptionsLocationKey: js.UndefOr[Boolean] = js.native
  /**
  	 * This key indicates that the application was launched by another
  	 * application with the specified bundle ID.
  	 */
  var source: js.UndefOr[java.lang.String] = js.native
  /**
  	 * This key indicates that the application was launched in order to open
  	 * the specified URL.
  	 */
  var url: js.UndefOr[java.lang.String] = js.native
}

object launchOptions {
  @scala.inline
  def apply(): launchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[launchOptions]
  }
  @scala.inline
  implicit class launchOptionsOps[Self <: launchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchOptionsLocationKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptionsLocationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchOptionsLocationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOptionsLocationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
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

