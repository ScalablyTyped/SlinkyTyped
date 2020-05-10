package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Android.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the
  * [startActivityForResult](Titanium.Android.Activity.startActivityForResult) callback.
  */
@js.native
trait ActivityResult extends js.Object {
  /**
  	 * Intent that can contain data returned to the caller. Data can be attached to
  	 * the intent as "extras").
  	 */
  var intent: js.UndefOr[Intent] = js.native
  /**
  	 * Unique, automatically generated integer request code.
  	 */
  var requestCode: js.UndefOr[Double] = js.native
  /**
  	 * Integer result code that the started activity passed to
  	 * [setResult](Titanium.Android.Activity.setResult).
  	 */
  var resultCode: js.UndefOr[Double] = js.native
}

object ActivityResult {
  @scala.inline
  def apply(): ActivityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityResult]
  }
  @scala.inline
  implicit class ActivityResultOps[Self <: ActivityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCode")(js.undefined)
        ret
    }
  }
  
}

