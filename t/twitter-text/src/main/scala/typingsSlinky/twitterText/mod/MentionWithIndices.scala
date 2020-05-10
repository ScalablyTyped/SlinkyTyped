package typingsSlinky.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MentionWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[Double, Double] = js.native
  var screenName: String = js.native
}

object MentionWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], screenName: String): MentionWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionWithIndices]
  }
  @scala.inline
  implicit class MentionWithIndicesOps[Self <: MentionWithIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndices(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

