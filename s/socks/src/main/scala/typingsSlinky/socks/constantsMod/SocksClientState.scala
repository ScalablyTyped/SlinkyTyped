package typingsSlinky.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocksClientState extends StObject
@JSImport("socks/typings/common/constants", "SocksClientState")
@js.native
object SocksClientState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocksClientState with Double] = js.native
  
  @js.native
  sealed trait BoundWaitingForConnection extends SocksClientState
  /* 9 */ val BoundWaitingForConnection: typingsSlinky.socks.constantsMod.SocksClientState.BoundWaitingForConnection with Double = js.native
  
  @js.native
  sealed trait Connected extends SocksClientState
  /* 2 */ val Connected: typingsSlinky.socks.constantsMod.SocksClientState.Connected with Double = js.native
  
  @js.native
  sealed trait Connecting extends SocksClientState
  /* 1 */ val Connecting: typingsSlinky.socks.constantsMod.SocksClientState.Connecting with Double = js.native
  
  @js.native
  sealed trait Created extends SocksClientState
  /* 0 */ val Created: typingsSlinky.socks.constantsMod.SocksClientState.Created with Double = js.native
  
  @js.native
  sealed trait Disconnected extends SocksClientState
  /* 11 */ val Disconnected: typingsSlinky.socks.constantsMod.SocksClientState.Disconnected with Double = js.native
  
  @js.native
  sealed trait Error extends SocksClientState
  /* 99 */ val Error: typingsSlinky.socks.constantsMod.SocksClientState.Error with Double = js.native
  
  @js.native
  sealed trait Established extends SocksClientState
  /* 10 */ val Established: typingsSlinky.socks.constantsMod.SocksClientState.Established with Double = js.native
  
  @js.native
  sealed trait ReceivedAuthenticationResponse extends SocksClientState
  /* 6 */ val ReceivedAuthenticationResponse: typingsSlinky.socks.constantsMod.SocksClientState.ReceivedAuthenticationResponse with Double = js.native
  
  @js.native
  sealed trait ReceivedFinalResponse extends SocksClientState
  /* 8 */ val ReceivedFinalResponse: typingsSlinky.socks.constantsMod.SocksClientState.ReceivedFinalResponse with Double = js.native
  
  @js.native
  sealed trait ReceivedInitialHandshakeResponse extends SocksClientState
  /* 4 */ val ReceivedInitialHandshakeResponse: typingsSlinky.socks.constantsMod.SocksClientState.ReceivedInitialHandshakeResponse with Double = js.native
  
  @js.native
  sealed trait SentAuthentication extends SocksClientState
  /* 5 */ val SentAuthentication: typingsSlinky.socks.constantsMod.SocksClientState.SentAuthentication with Double = js.native
  
  @js.native
  sealed trait SentFinalHandshake extends SocksClientState
  /* 7 */ val SentFinalHandshake: typingsSlinky.socks.constantsMod.SocksClientState.SentFinalHandshake with Double = js.native
  
  @js.native
  sealed trait SentInitialHandshake extends SocksClientState
  /* 3 */ val SentInitialHandshake: typingsSlinky.socks.constantsMod.SocksClientState.SentInitialHandshake with Double = js.native
}
