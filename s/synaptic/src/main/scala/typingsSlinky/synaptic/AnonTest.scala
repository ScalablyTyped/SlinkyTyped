package typingsSlinky.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTest extends js.Object {
  var test: js.Any = js.native
  var train: js.Any = js.native
}

object AnonTest {
  @scala.inline
  def apply(test: js.Any, train: js.Any): AnonTest = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], train = train.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTest]
  }
  @scala.inline
  implicit class AnonTestOps[Self <: AnonTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTest(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("train")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

