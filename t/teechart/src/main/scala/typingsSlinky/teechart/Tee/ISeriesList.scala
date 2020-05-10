package typingsSlinky.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISeriesList extends js.Object {
  var chart: IChart = js.native
  var items: js.Array[ISeries] = js.native
  def anyUsesAxes(): Boolean = js.native
  def clicked(position: IPoint): Boolean = js.native
  //each(f: function): void;
  def firstVisible(): ISeries = js.native
}

object ISeriesList {
  @scala.inline
  def apply(
    anyUsesAxes: () => Boolean,
    chart: IChart,
    clicked: IPoint => Boolean,
    firstVisible: () => ISeries,
    items: js.Array[ISeries]
  ): ISeriesList = {
    val __obj = js.Dynamic.literal(anyUsesAxes = js.Any.fromFunction0(anyUsesAxes), chart = chart.asInstanceOf[js.Any], clicked = js.Any.fromFunction1(clicked), firstVisible = js.Any.fromFunction0(firstVisible), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeriesList]
  }
  @scala.inline
  implicit class ISeriesListOps[Self <: ISeriesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyUsesAxes(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyUsesAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChart(value: IChart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClicked(value: IPoint => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirstVisible(value: () => ISeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[ISeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

