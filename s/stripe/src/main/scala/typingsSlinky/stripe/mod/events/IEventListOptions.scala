package typingsSlinky.stripe.mod.events

import typingsSlinky.stripe.mod.IListOptionsCreated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventListOptions extends IListOptionsCreated {
  /**
    * A string containing a specific event name, or group of events using * as a
    * wildcard. The list will be filtered to include only events with a matching
    * event property
    */
  var `type`: String = js.native
}

object IEventListOptions {
  @scala.inline
  def apply(`type`: String): IEventListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventListOptions]
  }
  @scala.inline
  implicit class IEventListOptionsOps[Self <: IEventListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

