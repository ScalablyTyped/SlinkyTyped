package typingsSlinky.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait I2cBusSpeed extends js.Object
/** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
@JSGlobal("Windows.Devices.I2c.I2cBusSpeed")
@js.native
object I2cBusSpeed extends js.Object {
  
  /** A fast speed of 400 kHz. */
  @js.native
  sealed trait fastMode extends I2cBusSpeed
  
  /** The standard speed of 100 kilohertz (kHz). This speed is the default. */
  @js.native
  sealed trait standardMode extends I2cBusSpeed
}
