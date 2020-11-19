package typingsSlinky.timezonecomplete.mod

import typingsSlinky.timezonecomplete.periodMod.PeriodJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timezonecomplete", "Period")
@js.native
class Period protected ()
  extends typingsSlinky.timezonecomplete.periodMod.Period {
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param json period represented as JSON object
    * @throws timezonecomplete.Argument.Json for invalid JSON (missing reference, unparseable reference or interval)
    * @throws timezonecomplete.Argument.Interval if amount not positive integer
    * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
    */
  def this(json: PeriodJson) = this()
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param reference The reference date of the period. If the period is in Months or Years, and
    *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
    * @param interval The interval of the period
    * @param dst Specifies how to handle Daylight Saving Time. Not relevant
    *            if the time zone of the reference datetime does not have DST.
    *            Defaults to RegularLocalTime.
    * @throws timezonecomplete.Argument.Dst for invalid dst value
    * @throws timezonecomplete.Argument.Interval if amount not positive integer
    * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
    */
  def this(
    reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    interval: typingsSlinky.timezonecomplete.durationMod.Duration
  ) = this()
  /**
    * Constructor
    * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
    * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
    * This is due to the enormous processing power required by these cases. They are not
    * implemented and you will get an assert.
    *
    * @param reference The reference of the period. If the period is in Months or Years, and
    *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
    * @param amount The amount of units.
    * @param unit The unit.
    * @param dst Specifies how to handle Daylight Saving Time. Not relevant
    *              if the time zone of the reference datetime does not have DST.
    *              Defaults to RegularLocalTime.
    * @throws timezonecomplete.Argument.Amount for invalid amount
    * @throws timezonecomplete.Argument.Unit for invalid time unit
    * @throws timezonecomplete.Argument.Interval if amount not positive integer
    * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
    * @throws timezonecomplete.Argument.Dst for invalid dst value
    */
  def this(
    reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    amount: Double,
    unit: typingsSlinky.timezonecomplete.basicsMod.TimeUnit
  ) = this()
  def this(
    reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    interval: typingsSlinky.timezonecomplete.durationMod.Duration,
    dst: typingsSlinky.timezonecomplete.periodMod.PeriodDst
  ) = this()
  def this(
    reference: typingsSlinky.timezonecomplete.datetimeMod.DateTime,
    amount: Double,
    unit: typingsSlinky.timezonecomplete.basicsMod.TimeUnit,
    dst: typingsSlinky.timezonecomplete.periodMod.PeriodDst
  ) = this()
}
