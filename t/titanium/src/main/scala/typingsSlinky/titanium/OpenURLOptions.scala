package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The optional options to pass to the URL handling (iOS 10+). Pass a
  * dictionary with one or more of the following string-keys:
  *     * `UIApplicationOpenURLOptionsSourceApplicationKey` (String value)
  *     * `UIApplicationOpenURLOptionsAnnotationKey` (Array value)
  *     * `UIApplicationOpenURLOptionsOpenInPlaceKey` (Boolean value)
  *     * `UIApplicationOpenURLOptionUniversalLinksOnly` (Boolean value)
  * Read more about the available keys in the [Apple documentation](https://developer.apple.com/documentation/uikit/uiapplicationopenurloptionskey?language=objc).
  */
@js.native
trait OpenURLOptions extends js.Object {
  /**
  	 * When you include this key in the options dictionary, the method opens the URL only if the URL is a valid universal link and there is an installed app capable of opening that URL.
  	 */
  var UIApplicationOpenURLOptionUniversalLinksOnly: js.UndefOr[Boolean] = js.native
  /**
  	 * contains the information passed to a document interaction controller object's annotation property.
  	 */
  var UIApplicationOpenURLOptionsAnnotationKey: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * When the value of this property is `false`, you must copy the document to maintain access to it. If the flag is not set, you also must copy the document before you can use it.
  	 */
  var UIApplicationOpenURLOptionsOpenInPlaceKey: js.UndefOr[Boolean] = js.native
  /**
  	 * The value of this key is an String containing the bundle ID of the app that made the request. If the request originated from another app belonging to your team, UIKit sets the value of this key to the ID of that app. If the team identifier of the originating app is different than the team identifier of the current app, the value of the key is nil.
  	 */
  var UIApplicationOpenURLOptionsSourceApplicationKey: js.UndefOr[java.lang.String] = js.native
}

object OpenURLOptions {
  @scala.inline
  def apply(): OpenURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenURLOptions]
  }
  @scala.inline
  implicit class OpenURLOptionsOps[Self <: OpenURLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUIApplicationOpenURLOptionUniversalLinksOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionUniversalLinksOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUIApplicationOpenURLOptionUniversalLinksOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionUniversalLinksOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUIApplicationOpenURLOptionsAnnotationKey(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsAnnotationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUIApplicationOpenURLOptionsAnnotationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsAnnotationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUIApplicationOpenURLOptionsOpenInPlaceKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsOpenInPlaceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUIApplicationOpenURLOptionsOpenInPlaceKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsOpenInPlaceKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUIApplicationOpenURLOptionsSourceApplicationKey(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsSourceApplicationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUIApplicationOpenURLOptionsSourceApplicationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UIApplicationOpenURLOptionsSourceApplicationKey")(js.undefined)
        ret
    }
  }
  
}

