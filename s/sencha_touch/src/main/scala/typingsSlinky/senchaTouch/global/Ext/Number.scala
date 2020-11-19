package typingsSlinky.senchaTouch.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Number")
@js.native
class Number ()
  extends typingsSlinky.senchaTouch.Ext.Number
/* static members */
@JSGlobal("Ext.Number")
@js.native
object Number extends js.Object {
  
  /** [Method] Checks whether or not the passed number is within a desired range
    * @param number Number The number to check
    * @param min Number The minimum number in the range
    * @param max Number The maximum number in the range
    * @returns Number The constrained value if outside the range, otherwise the current value
    */
  def constrain(): Double = js.native
  def constrain(number: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def constrain(number: js.UndefOr[scala.Nothing], min: Double): Double = js.native
  def constrain(number: js.UndefOr[scala.Nothing], min: Double, max: Double): Double = js.native
  def constrain(number: Double): Double = js.native
  def constrain(number: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def constrain(number: Double, min: Double): Double = js.native
  def constrain(number: Double, min: Double, max: Double): Double = js.native
  
  /** [Method] Validate that a value is numeric and convert it to a number if necessary
    * @param value Object
    * @param defaultValue Number The value to return if the original value is non-numeric
    * @returns Number value, if numeric, defaultValue otherwise
    */
  def from(): Double = js.native
  def from(value: js.UndefOr[scala.Nothing], defaultValue: Double): Double = js.native
  def from(value: js.Any): Double = js.native
  def from(value: js.Any, defaultValue: Double): Double = js.native
  
  /** [Method] Snaps the passed number between stopping points based upon a passed increment value
    * @param value Number The unsnapped value.
    * @param increment Number The increment by which the value must move.
    * @param minValue Number The minimum value to which the returned value must be constrained. Overrides the increment..
    * @param maxValue Number The maximum value to which the returned value must be constrained. Overrides the increment..
    * @returns Number The value of the nearest snap target.
    */
  def snap(): Double = js.native
  def snap(
    value: js.UndefOr[scala.Nothing],
    increment: js.UndefOr[scala.Nothing],
    minValue: js.UndefOr[scala.Nothing],
    maxValue: Double
  ): Double = js.native
  def snap(value: js.UndefOr[scala.Nothing], increment: js.UndefOr[scala.Nothing], minValue: Double): Double = js.native
  def snap(
    value: js.UndefOr[scala.Nothing],
    increment: js.UndefOr[scala.Nothing],
    minValue: Double,
    maxValue: Double
  ): Double = js.native
  def snap(value: js.UndefOr[scala.Nothing], increment: Double): Double = js.native
  def snap(
    value: js.UndefOr[scala.Nothing],
    increment: Double,
    minValue: js.UndefOr[scala.Nothing],
    maxValue: Double
  ): Double = js.native
  def snap(value: js.UndefOr[scala.Nothing], increment: Double, minValue: Double): Double = js.native
  def snap(value: js.UndefOr[scala.Nothing], increment: Double, minValue: Double, maxValue: Double): Double = js.native
  def snap(value: Double): Double = js.native
  def snap(
    value: Double,
    increment: js.UndefOr[scala.Nothing],
    minValue: js.UndefOr[scala.Nothing],
    maxValue: Double
  ): Double = js.native
  def snap(value: Double, increment: js.UndefOr[scala.Nothing], minValue: Double): Double = js.native
  def snap(value: Double, increment: js.UndefOr[scala.Nothing], minValue: Double, maxValue: Double): Double = js.native
  def snap(value: Double, increment: Double): Double = js.native
  def snap(value: Double, increment: Double, minValue: js.UndefOr[scala.Nothing], maxValue: Double): Double = js.native
  def snap(value: Double, increment: Double, minValue: Double): Double = js.native
  def snap(value: Double, increment: Double, minValue: Double, maxValue: Double): Double = js.native
  
  /** [Method] Formats a number using fixed point notation
    * @param value Number The number to format
    * @param precision Number The number of digits to show after the decimal point
    */
  def toFixed(): Unit = js.native
  def toFixed(value: js.UndefOr[scala.Nothing], precision: Double): Unit = js.native
  def toFixed(value: Double): Unit = js.native
  def toFixed(value: Double, precision: Double): Unit = js.native
}
