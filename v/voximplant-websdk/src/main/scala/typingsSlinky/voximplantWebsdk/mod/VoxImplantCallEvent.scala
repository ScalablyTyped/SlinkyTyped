package typingsSlinky.voximplantWebsdk.mod

import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Connected
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Disconnected
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Failed
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.InfoReceived
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.MessageReceived
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferComplete
import typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferFailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Connected
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Disconnected
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Failed
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.InfoReceived
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.MessageReceived
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferComplete
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferFailed
*/
trait VoxImplantCallEvent extends js.Object

object VoxImplantCallEvent {
  @scala.inline
  implicit def apply(value: Connected): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: Disconnected): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: Failed): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: InfoReceived): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: MessageReceived): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: ProgressToneStart): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: ProgressToneStop): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: TransferComplete): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
  @scala.inline
  implicit def apply(value: TransferFailed): VoxImplantCallEvent = value.asInstanceOf[VoxImplantCallEvent]
}

