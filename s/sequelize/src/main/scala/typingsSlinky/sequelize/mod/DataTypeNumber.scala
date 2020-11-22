package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeNumber extends DataTypeAbstractNumber[DataTypeNumber]
object DataTypeNumber {
  
  @scala.inline
  def apply(UNSIGNED: DataTypeNumber, ZEROFILL: DataTypeNumber, dialectTypes: String): DataTypeNumber = {
    val __obj = js.Dynamic.literal(UNSIGNED = UNSIGNED.asInstanceOf[js.Any], ZEROFILL = ZEROFILL.asInstanceOf[js.Any], dialectTypes = dialectTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeNumber]
  }
}
