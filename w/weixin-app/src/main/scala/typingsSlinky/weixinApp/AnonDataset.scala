package typingsSlinky.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataset extends js.Object {
  var dataset: String = js.native
}

object AnonDataset {
  @scala.inline
  def apply(dataset: String): AnonDataset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataset]
  }
  @scala.inline
  implicit class AnonDatasetOps[Self <: AnonDataset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

