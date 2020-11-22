package typingsSlinky.sequelize.mod

import typingsSlinky.sequelize.anon.Decimals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeReal extends DataTypeAbstractNumber[DataTypeReal] {
  
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeReal = js.native
  def apply(length: Double): DataTypeReal = js.native
  def apply(length: Double, decimals: Double): DataTypeReal = js.native
  def apply(options: Decimals): DataTypeReal = js.native
}
