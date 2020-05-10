package typingsSlinky.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictorySingleLabableProps extends VictoryLabableProps {
  /**
    * The label prop defines the label that will appear at the edge of the area.
    * This prop should be given a string or as a function of data. If individual
    * labels are required for each data point, they should be created by composing
    * VictoryArea with VictoryScatter
    * @example: "Series 1", (data) => `${data.length} points`
    */
  var label: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.native
}

object VictorySingleLabableProps {
  @scala.inline
  def apply(): VictorySingleLabableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictorySingleLabableProps]
  }
  @scala.inline
  implicit class VictorySingleLabablePropsOps[Self <: VictorySingleLabableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFunction1(value: /* data */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabel(value: String | (js.Function1[/* data */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

