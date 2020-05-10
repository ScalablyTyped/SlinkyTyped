package typingsSlinky.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  var parameters: js.UndefOr[js.Any] = js.native
  var `type`: StandardValidatorType | (js.Function3[
    /* cell */ CellComponent, 
    /* value */ js.Any, 
    /* parameters */ js.UndefOr[js.Any], 
    Boolean
  ]) = js.native
}

object Validator {
  @scala.inline
  def apply(
    `type`: StandardValidatorType | (js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* parameters */ js.UndefOr[js.Any], 
      Boolean
    ])
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  @scala.inline
  implicit class ValidatorOps[Self <: Validator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypeFunction3(
      value: (/* cell */ CellComponent, /* value */ js.Any, /* parameters */ js.UndefOr[js.Any]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withType(
      value: StandardValidatorType | (js.Function3[
          /* cell */ CellComponent, 
          /* value */ js.Any, 
          /* parameters */ js.UndefOr[js.Any], 
          Boolean
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

