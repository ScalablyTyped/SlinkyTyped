package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPublisherCreated extends js.Object {
  var none: Double = js.native
  var publisherCreated: Double = js.native
  var userEditable: Double = js.native
}

object AnonPublisherCreated {
  @scala.inline
  def apply(none: Double, publisherCreated: Double, userEditable: Double): AnonPublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPublisherCreated]
  }
  @scala.inline
  implicit class AnonPublisherCreatedOps[Self <: AnonPublisherCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserEditable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEditable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

