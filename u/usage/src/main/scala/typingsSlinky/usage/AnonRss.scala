package typingsSlinky.usage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRss extends js.Object {
  var rss: Double = js.native
  var vsize: Double = js.native
}

object AnonRss {
  @scala.inline
  def apply(rss: Double, vsize: Double): AnonRss = {
    val __obj = js.Dynamic.literal(rss = rss.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRss]
  }
  @scala.inline
  implicit class AnonRssOps[Self <: AnonRss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRss(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vsize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

