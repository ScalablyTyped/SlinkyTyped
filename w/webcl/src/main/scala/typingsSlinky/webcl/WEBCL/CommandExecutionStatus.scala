package typingsSlinky.webcl.WEBCL

import typingsSlinky.webcl.webclNumbers.`0x0`
import typingsSlinky.webcl.webclNumbers.`0x1`
import typingsSlinky.webcl.webclNumbers.`0x2`
import typingsSlinky.webcl.webclNumbers.`0x3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* command execution status */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webcl.webclNumbers.`0x0`
  - typingsSlinky.webcl.webclNumbers.`0x1`
  - typingsSlinky.webcl.webclNumbers.`0x2`
  - typingsSlinky.webcl.webclNumbers.`0x3`
*/
trait CommandExecutionStatus extends js.Object
object CommandExecutionStatus {
  
  @scala.inline
  def COMPLETE: `0x0` = 0x0.asInstanceOf[`0x0`]
  
  @scala.inline
  def QUEUED: `0x3` = 0x3.asInstanceOf[`0x3`]
  
  @scala.inline
  def RUNNING: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  @scala.inline
  def SUBMITTED: `0x2` = 0x2.asInstanceOf[`0x2`]
}
