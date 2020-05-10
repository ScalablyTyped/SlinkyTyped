package typingsSlinky.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Publisher extends js.Object {
  /**
    * Name of the publishing service.
    */
  var name: String = js.native
  /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
  var serviceOwnerId: String = js.native
}

object Publisher {
  @scala.inline
  def apply(name: String, serviceOwnerId: String): Publisher = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], serviceOwnerId = serviceOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publisher]
  }
  @scala.inline
  implicit class PublisherOps[Self <: Publisher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

