package typingsSlinky.tabulator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*~ Write your module's methods and properties in this class */
@js.native
trait Tabulator extends js.Object {
  // myMethod(opts: Tabulator.chartType): number;
  var defaultShowAttribute: String = js.native
  def toHtmlTable(matrix: js.Object): js.Any = js.native
  def toMatrix(datum: js.Object): js.Object = js.native
}

object Tabulator {
  @scala.inline
  def apply(defaultShowAttribute: String, toHtmlTable: js.Object => js.Any, toMatrix: js.Object => js.Object): Tabulator = {
    val __obj = js.Dynamic.literal(defaultShowAttribute = defaultShowAttribute.asInstanceOf[js.Any], toHtmlTable = js.Any.fromFunction1(toHtmlTable), toMatrix = js.Any.fromFunction1(toMatrix))
    __obj.asInstanceOf[Tabulator]
  }
  @scala.inline
  implicit class TabulatorOps[Self <: Tabulator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultShowAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultShowAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToHtmlTable(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toHtmlTable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToMatrix(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMatrix")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

