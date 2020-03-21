package typingsSlinky.winrtUwp.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SmartCards {
  /** Represents a method that handles a smart card personal identification number (PIN) reset. */
  type SmartCardPinResetHandler = js.Function2[
    /* sender */ typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardProvisioning, 
    /* request */ typingsSlinky.winrtUwp.Windows.Devices.SmartCards.SmartCardPinResetRequest, 
    scala.Unit
  ]
}
