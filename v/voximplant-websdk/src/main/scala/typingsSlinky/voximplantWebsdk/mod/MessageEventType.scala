package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageEventType extends StObject
@JSImport("voximplant-websdk", "MessageEventType")
@js.native
object MessageEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageEventType with Double] = js.native
  
  /**
    *    Cancels the 'Composing' event
    */
  @js.native
  sealed trait Cancel extends MessageEventType
  /* 0 */ val Cancel: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Cancel with Double = js.native
  
  /**
    *    Indicates that a reply is being composed
    */
  @js.native
  sealed trait Composing extends MessageEventType
  /* 1 */ val Composing: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Composing with Double = js.native
  
  /**
    *    Indicates that the message has been delivered to the recipient
    */
  @js.native
  sealed trait Delivered extends MessageEventType
  /* 2 */ val Delivered: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Delivered with Double = js.native
  
  /**
    *    Indicates that the message has been displayed
    */
  @js.native
  sealed trait Displayed extends MessageEventType
  /* 3 */ val Displayed: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Displayed with Double = js.native
  
  /**
    *    Invalid type
    */
  @js.native
  sealed trait Invalid extends MessageEventType
  /* 4 */ val Invalid: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Invalid with Double = js.native
  
  /**
    *    Indicates that the message has been stored offline by the intended recipient's server
    */
  @js.native
  sealed trait Offline extends MessageEventType
  /* 5 */ val Offline: typingsSlinky.voximplantWebsdk.mod.MessageEventType.Offline with Double = js.native
}
