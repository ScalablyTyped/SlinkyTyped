package typingsSlinky.winrtUwp.Windows.Globalization.NumberFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Rounds numbers to a specified increment. */
@js.native
trait IncrementNumberRounder extends js.Object {
  /** Gets or sets the increment this IncrementNumberRounder object uses for rounding. */
  var increment: Double = js.native
  /** Gets or sets the rounding strategy value for this IncrementNumberRounder object. */
  var roundingAlgorithm: RoundingAlgorithm = js.native
  /**
    * Rounds a Double number to the specified increment.
    * @param value The Double value to be rounded.
    * @return The rounded number. This result is a double precision floating point number, which is not necessarily an integer.
    */
  def roundDouble(value: Double): Double = js.native
  /**
    * Rounds an Int32 number to the specified increment.
    * @param value The Int32 value to be rounded.
    * @return The rounded 32 bit integer.
    */
  def roundInt32(value: Double): Double = js.native
  /**
    * Rounds an Int64 number to the specified increment.
    * @param value The Int64 value to be rounded.
    * @return The rounded 64 bit integer.
    */
  def roundInt64(value: Double): Double = js.native
  /**
    * Rounds a Single number to the specified increment.
    * @param value The Single value to be rounded.
    * @return The rounded number. This result is a single precision floating point number, which is not necessarily an integer.
    */
  def roundSingle(value: Double): Double = js.native
  /**
    * Rounds a UInt32 number to the specified increment.
    * @param value The UInt32 value to be rounded.
    * @return The rounded unsigned 32 bit integer.
    */
  def roundUInt32(value: Double): Double = js.native
  /**
    * Rounds a UInt64 number to the specified increment.
    * @param value The UInt64 value to be rounded.
    * @return The rounded unsigned 64 bit integer.
    */
  def roundUInt64(value: Double): Double = js.native
}

object IncrementNumberRounder {
  @scala.inline
  def apply(
    increment: Double,
    roundDouble: Double => Double,
    roundInt32: Double => Double,
    roundInt64: Double => Double,
    roundSingle: Double => Double,
    roundUInt32: Double => Double,
    roundUInt64: Double => Double,
    roundingAlgorithm: RoundingAlgorithm
  ): IncrementNumberRounder = {
    val __obj = js.Dynamic.literal(increment = increment.asInstanceOf[js.Any], roundDouble = js.Any.fromFunction1(roundDouble), roundInt32 = js.Any.fromFunction1(roundInt32), roundInt64 = js.Any.fromFunction1(roundInt64), roundSingle = js.Any.fromFunction1(roundSingle), roundUInt32 = js.Any.fromFunction1(roundUInt32), roundUInt64 = js.Any.fromFunction1(roundUInt64), roundingAlgorithm = roundingAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementNumberRounder]
  }
  @scala.inline
  implicit class IncrementNumberRounderOps[Self <: IncrementNumberRounder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundDouble(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundDouble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundInt32(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundInt32")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundInt64(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundInt64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundSingle(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundSingle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundUInt32(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundUInt32")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundUInt64(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundUInt64")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoundingAlgorithm(value: RoundingAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

