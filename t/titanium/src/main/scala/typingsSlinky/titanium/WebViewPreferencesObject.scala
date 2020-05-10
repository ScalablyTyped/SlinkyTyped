package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter passed to the <Titanium.UI.iOS.WebViewConfiguration.preferences> method.
  */
@js.native
trait WebViewPreferencesObject extends js.Object {
  /**
  	 * A Boolean value indicating whether JavaScript can open windows without user interaction.
  	 */
  var javaScriptCanOpenWindowsAutomatically: js.UndefOr[Boolean] = js.native
  /**
  	 * A Boolean value indicating whether JavaScript is enabled.
  	 */
  var javaScriptEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * The minimum font size in points.
  	 */
  var minimumFontSize: js.UndefOr[Double] = js.native
}

object WebViewPreferencesObject {
  @scala.inline
  def apply(): WebViewPreferencesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebViewPreferencesObject]
  }
  @scala.inline
  implicit class WebViewPreferencesObjectOps[Self <: WebViewPreferencesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJavaScriptCanOpenWindowsAutomatically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaScriptCanOpenWindowsAutomatically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaScriptCanOpenWindowsAutomatically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaScriptCanOpenWindowsAutomatically")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaScriptEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaScriptEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaScriptEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaScriptEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFontSize")(js.undefined)
        ret
    }
  }
  
}

