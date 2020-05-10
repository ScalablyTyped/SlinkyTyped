package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISplashScreen extends js.Object {
  var imageLocation: Rect = js.native
  var ondismissed: js.Any = js.native
}

object ISplashScreen {
  @scala.inline
  def apply(imageLocation: Rect, ondismissed: js.Any): ISplashScreen = {
    val __obj = js.Dynamic.literal(imageLocation = imageLocation.asInstanceOf[js.Any], ondismissed = ondismissed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplashScreen]
  }
  @scala.inline
  implicit class ISplashScreenOps[Self <: ISplashScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageLocation(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOndismissed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondismissed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

