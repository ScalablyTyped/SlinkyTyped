package typingsSlinky.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Parameter Classes
@JSGlobal("tableau.Parameter")
@js.native
class Parameter ()
  extends typingsSlinky.tableau.tableau.Parameter {
  /**
    * If the parameter is restricted to a list of allowable values, this property contains the array of those values.
    * Note that this is not a standard collection, but a JavaScript array.
    */
  /* CompleteClass */
  override def getAllowableValues(): js.Array[typingsSlinky.tableau.tableau.DataValue] = js.native
  /** The type of allowable values that the parameter can accept. It can be one of the following enumeration items: ALL, LIST, RANGE. */
  /* CompleteClass */
  override def getAllowableValuesType(): typingsSlinky.tableau.tableau.ParameterAllowableValuesType = js.native
  /** The current value of the parameter. */
  /* CompleteClass */
  override def getCurrentValue(): typingsSlinky.tableau.tableau.DataValue = js.native
  /** The data type of the parameter can be one of the following: FLOAT, INTEGER, STRING, BOOLEAN, DATE, DATETIME. */
  /* CompleteClass */
  override def getDataType(): typingsSlinky.tableau.tableau.ParameterDataType = js.native
  /**
    * If getAllowableValuesType is RANGE and getDataType is DATE or DATETIME,
    * this defines the step date period used in the Parameter UI control slider.
    * Otherwise it’s undefined/null.
    */
  /* CompleteClass */
  override def getDateStepPeriod(): typingsSlinky.tableau.tableau.PeriodType = js.native
  /** If getAllowableValuesType is RANGE, this defines the maximum allowable value, inclusive. Otherwise it’s undefined/null. */
  /* CompleteClass */
  override def getMaxValue(): typingsSlinky.tableau.tableau.DataValue = js.native
  /** If getAllowableValuesType is RANGE, this defines the minimum allowable value, inclusive. Otherwise it’s undefined/null. */
  /* CompleteClass */
  override def getMinValue(): typingsSlinky.tableau.tableau.DataValue = js.native
  /** A unique identifier for the parameter, as specified by the user. */
  /* CompleteClass */
  override def getName(): String = js.native
  /** If getAllowableValuesType is RANGE, this defines the step size used in the parameter UI control slider. Otherwise it’s undefined/null. */
  /* CompleteClass */
  override def getStepSize(): Double = js.native
}

