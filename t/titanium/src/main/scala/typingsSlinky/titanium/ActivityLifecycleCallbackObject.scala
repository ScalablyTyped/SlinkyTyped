package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Android.Activity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the <Titanium.Android.Activity> callbacks for
  * onCreate, onDestroy, onPause, onResume, onStart, onStop, onRestart.
  * Additional properties may be set on the Object.
  */
@js.native
trait ActivityLifecycleCallbackObject extends js.Object {
  /**
  	 * The Activity firing the callback.
  	 */
  var source: js.UndefOr[Activity] = js.native
}

object ActivityLifecycleCallbackObject {
  @scala.inline
  def apply(): ActivityLifecycleCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityLifecycleCallbackObject]
  }
  @scala.inline
  implicit class ActivityLifecycleCallbackObjectOps[Self <: ActivityLifecycleCallbackObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: Activity): Self = {
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
  }
  
}

