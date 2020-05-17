package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherCreated extends js.Object {
  var none: scala.Double = js.native
  var publisherCreated: scala.Double = js.native
  var userEditable: scala.Double = js.native
}

object PublisherCreated {
  @scala.inline
  def apply(none: scala.Double, publisherCreated: scala.Double, userEditable: scala.Double): PublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherCreated]
  }
  @scala.inline
  implicit class PublisherCreatedOps[Self <: PublisherCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherCreated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserEditable(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userEditable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

