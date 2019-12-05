package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DateRangeType extends js.Object

@JSGlobal("tableau.DateRangeType")
@js.native
object DateRangeType extends js.Object {
   /** Refers to the current day, week, month, etc. of the date period. */ @js.native
  sealed trait CURRENT extends DateRangeType
  
   /** Refers to the last day, week, month, etc. of the date period. */ @js.native
  sealed trait LAST extends DateRangeType
  
   /** Refers to the last N days, weeks, months, etc. of the date period. */ @js.native
  sealed trait LASTN extends DateRangeType
  
   /** Refers to the next day, week, month, etc. of the date period. */ @js.native
  sealed trait NEXT extends DateRangeType
  
   /** Refers to the next N days, weeks, months, etc. of the date period. */ @js.native
  sealed trait NEXTN extends DateRangeType
  
   /** Refers to everything up to and including the current day, week, month, etc. of the date period. */ @js.native
  sealed trait TODATE extends DateRangeType
  
  /* "current" */ val CURRENT: typingsSlinky.tableau.tableau.DateRangeType.CURRENT with String = js.native
  /* "last" */ val LAST: typingsSlinky.tableau.tableau.DateRangeType.LAST with String = js.native
  /* "lastn" */ val LASTN: typingsSlinky.tableau.tableau.DateRangeType.LASTN with String = js.native
  /* "next" */ val NEXT: typingsSlinky.tableau.tableau.DateRangeType.NEXT with String = js.native
  /* "nextn" */ val NEXTN: typingsSlinky.tableau.tableau.DateRangeType.NEXTN with String = js.native
  /* "todate" */ val TODATE: typingsSlinky.tableau.tableau.DateRangeType.TODATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DateRangeType with String] = js.native
}

