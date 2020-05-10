package typingsSlinky.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOptions extends js.Object {
  /** frame comparison end point: [visual]=visually complete | all=last change | doc=document complete | full=fully loaded */
  var comparisonEndPoint: js.UndefOr[String] = js.native
}

object VideoOptions {
  @scala.inline
  def apply(): VideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOptions]
  }
  @scala.inline
  implicit class VideoOptionsOps[Self <: VideoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparisonEndPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonEndPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonEndPoint")(js.undefined)
        ret
    }
  }
  
}

