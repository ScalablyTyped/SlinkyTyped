package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.AnonDecimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeReal extends DataTypeAbstractNumber[DataTypeReal] {
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeReal = js.native
  def apply(length: Double): DataTypeReal = js.native
  def apply(length: Double, decimals: Double): DataTypeReal = js.native
  def apply(options: AnonDecimals): DataTypeReal = js.native
}

