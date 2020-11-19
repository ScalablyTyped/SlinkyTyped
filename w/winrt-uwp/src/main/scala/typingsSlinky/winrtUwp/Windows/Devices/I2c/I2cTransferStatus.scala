package typingsSlinky.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait I2cTransferStatus extends js.Object
/** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
@JSGlobal("Windows.Devices.I2c.I2cTransferStatus")
@js.native
object I2cTransferStatus extends js.Object {
  
  /** The data was entirely transferred. For WriteReadPartial , the data for both the write and the read operations was entirely transferred. */
  @js.native
  sealed trait fullTransfer extends I2cTransferStatus
  
  /** The I²C device negatively acknowledged the data transfer before all of the data was transferred. */
  @js.native
  sealed trait partialTransfer extends I2cTransferStatus
  
  /** The bus address was not acknowledged. */
  @js.native
  sealed trait slaveAddressNotAcknowledged extends I2cTransferStatus
}
