package typingsSlinky.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the DateFormattingInfo.calendar field
  */
@js.native
trait Calendar extends js.Object {
  var AlgorithmType: Double = js.native
  var CalendarType: Double = js.native
  var Eras: js.Array[Double] = js.native
  var IsReadOnly: Boolean = js.native
  var MaxSupportedDateTime: js.Date = js.native
  var MinSupportedDateTime: js.Date = js.native
  var TwoDigitYearMax: Double = js.native
}

object Calendar {
  @scala.inline
  def apply(
    AlgorithmType: Double,
    CalendarType: Double,
    Eras: js.Array[Double],
    IsReadOnly: Boolean,
    MaxSupportedDateTime: js.Date,
    MinSupportedDateTime: js.Date,
    TwoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(AlgorithmType = AlgorithmType.asInstanceOf[js.Any], CalendarType = CalendarType.asInstanceOf[js.Any], Eras = Eras.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxSupportedDateTime = MaxSupportedDateTime.asInstanceOf[js.Any], MinSupportedDateTime = MinSupportedDateTime.asInstanceOf[js.Any], TwoDigitYearMax = TwoDigitYearMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  @scala.inline
  implicit class CalendarOps[Self <: Calendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEras(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Eras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSupportedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSupportedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSupportedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSupportedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoDigitYearMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoDigitYearMax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

