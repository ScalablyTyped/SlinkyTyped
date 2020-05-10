package typingsSlinky.titanium.Titanium.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityEventMap extends ProxyEventMap {
  var newintent: ActivityNewintentEvent = js.native
  var onIntent: ActivityOnIntentEvent = js.native
  var userinteraction: ActivityUserinteractionEvent = js.native
  var userleavehint: ActivityUserleavehintEvent = js.native
}

object ActivityEventMap {
  @scala.inline
  def apply(
    newintent: ActivityNewintentEvent,
    onIntent: ActivityOnIntentEvent,
    userinteraction: ActivityUserinteractionEvent,
    userleavehint: ActivityUserleavehintEvent
  ): ActivityEventMap = {
    val __obj = js.Dynamic.literal(newintent = newintent.asInstanceOf[js.Any], onIntent = onIntent.asInstanceOf[js.Any], userinteraction = userinteraction.asInstanceOf[js.Any], userleavehint = userleavehint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityEventMap]
  }
  @scala.inline
  implicit class ActivityEventMapOps[Self <: ActivityEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewintent(value: ActivityNewintentEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newintent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnIntent(value: ActivityOnIntentEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserinteraction(value: ActivityUserinteractionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userinteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserleavehint(value: ActivityUserleavehintEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userleavehint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

