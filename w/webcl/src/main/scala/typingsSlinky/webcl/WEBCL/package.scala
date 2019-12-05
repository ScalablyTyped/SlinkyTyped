package typingsSlinky.webcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WEBCL {
  import typingsSlinky.webcl.webclNumbers.`0x1081`
  import typingsSlinky.webcl.webclNumbers.`0x1`

  /* cl_context_info  */
  type ContextInfo = `0x1081`
  /* cl_device_exec_capabilities - bitfield */
  type DeviceExecCapabilitiesBits = `0x1`
  //2.5
  type WebCLCallback = js.Function1[/* event */ typingsSlinky.webcl.WEBCL.WebCLEvent, Unit]
}
