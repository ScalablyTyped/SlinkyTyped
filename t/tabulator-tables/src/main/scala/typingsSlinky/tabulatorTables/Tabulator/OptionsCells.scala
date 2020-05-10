package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsCells extends CellCallbacks {
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.native
}

object OptionsCells {
  @scala.inline
  def apply(): OptionsCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCells]
  }
  @scala.inline
  implicit class OptionsCellsOps[Self <: OptionsCells] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationFailed(
      value: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFailed")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutValidationFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFailed")(js.undefined)
        ret
    }
  }
  
}

