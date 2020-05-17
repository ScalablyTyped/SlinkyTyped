package typingsSlinky.segmentAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictintegration
  extends /* integration */ StringDictionary[js.UndefOr[Boolean]] {
  var All: js.UndefOr[Boolean] = js.native
}

object Dictintegration {
  @scala.inline
  def apply(): Dictintegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictintegration]
  }
  @scala.inline
  implicit class DictintegrationOps[Self <: Dictintegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("All")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("All")(js.undefined)
        ret
    }
  }
  
}

