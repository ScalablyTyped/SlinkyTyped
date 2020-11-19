package typingsSlinky.webcl.WEBCL

import typingsSlinky.webcl.webclNumbers.`0x1`
import typingsSlinky.webcl.webclNumbers.`0x2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_command_queue_properties - bitfield */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webcl.webclNumbers.`0x1`
  - typingsSlinky.webcl.webclNumbers.`0x2`
*/
trait CommandQueueProperties extends js.Object
object CommandQueueProperties {
  
  @scala.inline
  def QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  @scala.inline
  def QUEUE_PROFILING_ENABLE: `0x2` = 0x2.asInstanceOf[`0x2`]
}
