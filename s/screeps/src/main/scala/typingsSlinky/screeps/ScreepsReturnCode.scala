package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Return Codes
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.OK
  - typingsSlinky.screeps.ERR_NOT_OWNER
  - typingsSlinky.screeps.ERR_NO_PATH
  - typingsSlinky.screeps.ERR_BUSY
  - typingsSlinky.screeps.ERR_NAME_EXISTS
  - typingsSlinky.screeps.ERR_NOT_FOUND
  - typingsSlinky.screeps.ERR_NOT_ENOUGH_RESOURCES
  - typingsSlinky.screeps.ERR_NOT_ENOUGH_ENERGY
  - typingsSlinky.screeps.ERR_INVALID_TARGET
  - typingsSlinky.screeps.ERR_FULL
  - typingsSlinky.screeps.ERR_NOT_IN_RANGE
  - typingsSlinky.screeps.ERR_INVALID_ARGS
  - typingsSlinky.screeps.ERR_TIRED
  - typingsSlinky.screeps.ERR_NO_BODYPART
  - typingsSlinky.screeps.ERR_NOT_ENOUGH_EXTENSIONS
  - typingsSlinky.screeps.ERR_RCL_NOT_ENOUGH
  - typingsSlinky.screeps.ERR_GCL_NOT_ENOUGH
*/
trait ScreepsReturnCode extends js.Object

object ScreepsReturnCode {
  @scala.inline
  implicit def apply(value: ERR_NOT_ENOUGH_ENERGY | ERR_NOT_ENOUGH_EXTENSIONS | ERR_NOT_ENOUGH_RESOURCES): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_BUSY): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_FULL): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_GCL_NOT_ENOUGH): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_INVALID_ARGS): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_INVALID_TARGET): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NAME_EXISTS): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_FOUND): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_IN_RANGE): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_OWNER): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NO_BODYPART): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NO_PATH): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_RCL_NOT_ENOUGH): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: ERR_TIRED): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
  @scala.inline
  implicit def apply(value: OK): ScreepsReturnCode = value.asInstanceOf[ScreepsReturnCode]
}

