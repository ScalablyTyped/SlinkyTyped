package typingsSlinky.zeroclipboard.ZC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardConfig extends js.Object {
  /**
    * The class used to indicate that a clipped element is active (is being clicked).
    * @type {string}
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * Setting this to `false` would allow users to handle calling `ZeroClipboard.focus(...);`
    * themselves instead of relying on our per-element `mouseover` handler.
    * @type {boolean}
    */
  var autoActivate: js.UndefOr[Boolean] = js.native
  /**
    * Bubble synthetic events in JavaScript after they are received by the Flash object.
    * @type {boolean}
    */
  var bubbleEvents: js.UndefOr[Boolean] = js.native
  /**
    * Include a "noCache" query parameter on requests for the SWF.
    * @type {boolean}
    */
  var cacheBust: js.UndefOr[Boolean] = js.native
  /**
    * Sets the class of the `div` encapsulating the Flash object.
    * @type {string}
    */
  var containerClass: js.UndefOr[String] = js.native
  /**
    * Sets the ID of the `div` encapsulating the Flash object.
    * Value is validated against the [HTML4 spec for `ID` tokens][valid_ids].
    * @type {string}
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Ensure OS-compliant line endings, i.e. "\r\n" on Windows, "\n" elsewhere
    * @type {boolean}
    */
  var fixLineEndings: js.UndefOr[Boolean] = js.native
  /**
    * How many milliseconds to wait for the Flash SWF to load and respond before assuming that
    * Flash is deactivated (e.g. click-to-play) in the user's browser. If you don't care about
    * how long it takes to load the SWF, you can set this to `null`.
    * @type {number}
    */
  var flashLoadTimeout: js.UndefOr[Double] = js.native
  /**
    * Enable use of the fancy "Desktop" clipboard, even on Linux where it is known to suck.
    * @type {boolean}
    */
  var forceEnhancedClipboard: js.UndefOr[Boolean] = js.native
  /**
    * Forcibly set the hand cursor ("pointer") for all clipped elements.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {boolean}
    */
  var forceHandCursor: js.UndefOr[Boolean] = js.native
  /**
    * The class used to indicate that a clipped element is being hovered over.
    * @type {string}
    */
  var hoverClass: js.UndefOr[String] = js.native
  /**
    * Sets the ID and name of the Flash `object` element.
    * Value is validated against the [HTML4 spec for `ID` and `Name` tokens][valid_ids].
    * @type {string}
    */
  var swfObjectId: js.UndefOr[String] = js.native
  /**
    * SWF URL, relative to the page. Default value will be "ZeroClipboard.swf" under the same path as the ZeroClipboard JS file.
    * @type {string}
    */
  var swfPath: js.UndefOr[String] = js.native
  /**
    * Sets the title of the `div` encapsulating the Flash object.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {string}
    */
  var title: js.UndefOr[String] = js.native
  /**
    * SWF inbound scripting policy: page domains that the SWF should trust. (single string, or array of strings)
    * @type {SingleOrList<string>}
    */
  var trustedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The z-index used by the Flash object.
    * Max value (32-bit): 2147483647.
    * IMPORTANT: This configuration value CAN be modified while a SWF is actively embedded.
    * @type {number}
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object ZeroClipboardConfig {
  @scala.inline
  def apply(): ZeroClipboardConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeroClipboardConfig]
  }
  @scala.inline
  implicit class ZeroClipboardConfigOps[Self <: ZeroClipboardConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoActivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheBust(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBust")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheBust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheBust")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withFixLineEndings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixLineEndings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixLineEndings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixLineEndings")(js.undefined)
        ret
    }
    @scala.inline
    def withFlashLoadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashLoadTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlashLoadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashLoadTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withForceEnhancedClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnhancedClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceEnhancedClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEnhancedClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHandCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHandCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHandCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHandCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSwfObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwfObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSwfPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwfPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTrustedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrustedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trustedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

