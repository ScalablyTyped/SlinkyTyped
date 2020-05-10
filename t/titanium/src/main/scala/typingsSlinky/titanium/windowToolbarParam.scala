package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.setToolbar> method.
  */
@js.native
trait windowToolbarParam extends js.Object {
  /**
  	 * Defines if the toolbar appearance is animated.
  	 */
  var animated: js.UndefOr[Boolean] = js.native
  /**
  	 * Background color for the toolbar, as a color name or hex triplet.
  	 */
  var barColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * The tintColor to apply to the tool bar.
  	 */
  var tintColor: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Defines if the toolbar is translucent.
  	 */
  var translucent: js.UndefOr[Boolean] = js.native
}

object windowToolbarParam {
  @scala.inline
  def apply(): windowToolbarParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[windowToolbarParam]
  }
  @scala.inline
  implicit class windowToolbarParamOps[Self <: windowToolbarParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animated")(js.undefined)
        ret
    }
    @scala.inline
    def withBarColor(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslucent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslucent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translucent")(js.undefined)
        ret
    }
  }
  
}

