package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.Decimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeFloat extends DataTypeAbstractNumber[DataTypeFloat] {
  
  /**
    * Length of the number field and decimals of the float
    */
  def apply(): DataTypeFloat = js.native
  def apply(length: Double): DataTypeFloat = js.native
  def apply(length: Double, decimals: Double): DataTypeFloat = js.native
  def apply(options: Decimals): DataTypeFloat = js.native
}
