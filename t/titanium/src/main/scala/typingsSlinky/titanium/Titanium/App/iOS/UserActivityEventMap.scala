package typingsSlinky.titanium.Titanium.App.iOS

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserActivityEventMap extends ProxyEventMap {
  var useractivitydeleted: UserActivityUseractivitydeletedEvent = js.native
  var useractivitywascontinued: UserActivityUseractivitywascontinuedEvent = js.native
  var useractivitywillsave: UserActivityUseractivitywillsaveEvent = js.native
}

object UserActivityEventMap {
  @scala.inline
  def apply(
    useractivitydeleted: UserActivityUseractivitydeletedEvent,
    useractivitywascontinued: UserActivityUseractivitywascontinuedEvent,
    useractivitywillsave: UserActivityUseractivitywillsaveEvent
  ): UserActivityEventMap = {
    val __obj = js.Dynamic.literal(useractivitydeleted = useractivitydeleted.asInstanceOf[js.Any], useractivitywascontinued = useractivitywascontinued.asInstanceOf[js.Any], useractivitywillsave = useractivitywillsave.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserActivityEventMap]
  }
  @scala.inline
  implicit class UserActivityEventMapOps[Self <: UserActivityEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseractivitydeleted(value: UserActivityUseractivitydeletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useractivitydeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseractivitywascontinued(value: UserActivityUseractivitywascontinuedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useractivitywascontinued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseractivitywillsave(value: UserActivityUseractivitywillsaveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useractivitywillsave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

