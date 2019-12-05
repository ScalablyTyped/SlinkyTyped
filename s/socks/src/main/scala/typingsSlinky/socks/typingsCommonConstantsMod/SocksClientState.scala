package typingsSlinky.socks.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocksClientState extends js.Object

@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends js.Object {
  @js.native
  sealed trait BoundWaitingForConnection extends SocksClientState
  
  @js.native
  sealed trait Connected extends SocksClientState
  
  @js.native
  sealed trait Connecting extends SocksClientState
  
  @js.native
  sealed trait Created extends SocksClientState
  
  @js.native
  sealed trait Disconnected extends SocksClientState
  
  @js.native
  sealed trait Error extends SocksClientState
  
  @js.native
  sealed trait Established extends SocksClientState
  
  @js.native
  sealed trait ReceivedAuthenticationResponse extends SocksClientState
  
  @js.native
  sealed trait ReceivedFinalResponse extends SocksClientState
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse extends SocksClientState
  
  @js.native
  sealed trait SentAuthentication extends SocksClientState
  
  @js.native
  sealed trait SentFinalHandshake extends SocksClientState
  
  @js.native
  sealed trait SentInitialHandshake extends SocksClientState
  
  /* 9 */ val BoundWaitingForConnection: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.BoundWaitingForConnection with Double = js.native
  /* 2 */ val Connected: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Connected with Double = js.native
  /* 1 */ val Connecting: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Connecting with Double = js.native
  /* 0 */ val Created: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Created with Double = js.native
  /* 11 */ val Disconnected: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Disconnected with Double = js.native
  /* 99 */ val Error: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Error with Double = js.native
  /* 10 */ val Established: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.Established with Double = js.native
  /* 6 */ val ReceivedAuthenticationResponse: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.ReceivedAuthenticationResponse with Double = js.native
  /* 8 */ val ReceivedFinalResponse: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.ReceivedFinalResponse with Double = js.native
  /* 4 */ val ReceivedInitialHandshakeResponse: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.ReceivedInitialHandshakeResponse with Double = js.native
  /* 5 */ val SentAuthentication: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.SentAuthentication with Double = js.native
  /* 7 */ val SentFinalHandshake: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.SentFinalHandshake with Double = js.native
  /* 3 */ val SentInitialHandshake: typingsSlinky.socks.typingsCommonConstantsMod.SocksClientState.SentInitialHandshake with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksClientState with Double] = js.native
}

