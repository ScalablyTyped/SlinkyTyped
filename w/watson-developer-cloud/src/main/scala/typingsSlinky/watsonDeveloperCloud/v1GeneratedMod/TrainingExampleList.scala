package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExampleList. */
@js.native
trait TrainingExampleList extends js.Object {
  /** Array of training examples. */
  var examples: js.UndefOr[js.Array[TrainingExample]] = js.native
}

object TrainingExampleList {
  @scala.inline
  def apply(): TrainingExampleList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExampleList]
  }
  @scala.inline
  implicit class TrainingExampleListOps[Self <: TrainingExampleList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExamples(value: js.Array[TrainingExample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examples")(js.undefined)
        ret
    }
  }
  
}

