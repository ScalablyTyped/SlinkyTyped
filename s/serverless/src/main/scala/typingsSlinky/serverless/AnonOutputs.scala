package typingsSlinky.serverless

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutputs extends js.Object {
  var Outputs: js.UndefOr[StringDictionary[js.Any]] = js.native
  var Resources: StringDictionary[js.Any] = js.native
}

object AnonOutputs {
  @scala.inline
  def apply(Resources: StringDictionary[js.Any]): AnonOutputs = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutputs]
  }
  @scala.inline
  implicit class AnonOutputsOps[Self <: AnonOutputs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResources(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outputs")(js.undefined)
        ret
    }
  }
  
}

