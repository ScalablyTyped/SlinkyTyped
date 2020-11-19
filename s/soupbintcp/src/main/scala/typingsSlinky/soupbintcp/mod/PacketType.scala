package typingsSlinky.soupbintcp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PacketType extends js.Object
@JSImport("soupbintcp", "PacketType")
@js.native
object PacketType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PacketType with Double] = js.native
  
   // R
  @js.native
  sealed trait CLIENT_HEARTBEAT extends PacketType
  /* 0x52 */ @js.native
  object CLIENT_HEARTBEAT extends TopLevel[CLIENT_HEARTBEAT with Double]
  
   // +
  @js.native
  sealed trait DEBUG extends PacketType
  /* 0x2b */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
   // Z
  @js.native
  sealed trait END_OF_SESSION extends PacketType
  /* 0x5a */ @js.native
  object END_OF_SESSION extends TopLevel[END_OF_SESSION with Double]
  
   // A
  @js.native
  sealed trait LOGIN_ACCEPTED extends PacketType
  /* 0x41 */ @js.native
  object LOGIN_ACCEPTED extends TopLevel[LOGIN_ACCEPTED with Double]
  
   // J
  @js.native
  sealed trait LOGIN_REJECTED extends PacketType
  /* 0x4a */ @js.native
  object LOGIN_REJECTED extends TopLevel[LOGIN_REJECTED with Double]
  
   // L
  @js.native
  sealed trait LOGIN_REQUEST extends PacketType
  /* 0x4c */ @js.native
  object LOGIN_REQUEST extends TopLevel[LOGIN_REQUEST with Double]
  
  @js.native
  sealed trait LOGOUT_REQUEST extends PacketType
  /* 0x4f */ @js.native
  object LOGOUT_REQUEST extends TopLevel[LOGOUT_REQUEST with Double]
  
   // S
  @js.native
  sealed trait SEQUENCED_DATA extends PacketType
  /* 0x53 */ @js.native
  object SEQUENCED_DATA extends TopLevel[SEQUENCED_DATA with Double]
  
   // H
  @js.native
  sealed trait SERVER_HEARTBEAT extends PacketType
  /* 0x48 */ @js.native
  object SERVER_HEARTBEAT extends TopLevel[SERVER_HEARTBEAT with Double]
  
   // U
  @js.native
  sealed trait UNSEQUENCED_DATA extends PacketType
  /* 0x55 */ @js.native
  object UNSEQUENCED_DATA extends TopLevel[UNSEQUENCED_DATA with Double]
}
