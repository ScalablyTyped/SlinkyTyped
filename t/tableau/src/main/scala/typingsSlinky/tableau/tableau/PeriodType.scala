package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeriodType extends js.Object

@JSGlobal("tableau.PeriodType")
@js.native
object PeriodType extends js.Object {
  @js.native
  sealed trait DAYS extends PeriodType
  
  @js.native
  sealed trait HOURS extends PeriodType
  
  @js.native
  sealed trait MINUTES extends PeriodType
  
  @js.native
  sealed trait MONTHS extends PeriodType
  
  @js.native
  sealed trait QUARTERS extends PeriodType
  
  @js.native
  sealed trait SECONDS extends PeriodType
  
  @js.native
  sealed trait WEEKS extends PeriodType
  
  @js.native
  sealed trait YEARS extends PeriodType
  
  /* "days" */ val DAYS: typingsSlinky.tableau.tableau.PeriodType.DAYS with String = js.native
  /* "hours" */ val HOURS: typingsSlinky.tableau.tableau.PeriodType.HOURS with String = js.native
  /* "minutes" */ val MINUTES: typingsSlinky.tableau.tableau.PeriodType.MINUTES with String = js.native
  /* "months" */ val MONTHS: typingsSlinky.tableau.tableau.PeriodType.MONTHS with String = js.native
  /* "quarters" */ val QUARTERS: typingsSlinky.tableau.tableau.PeriodType.QUARTERS with String = js.native
  /* "seconds" */ val SECONDS: typingsSlinky.tableau.tableau.PeriodType.SECONDS with String = js.native
  /* "weeks" */ val WEEKS: typingsSlinky.tableau.tableau.PeriodType.WEEKS with String = js.native
  /* "years" */ val YEARS: typingsSlinky.tableau.tableau.PeriodType.YEARS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeriodType with String] = js.native
}

