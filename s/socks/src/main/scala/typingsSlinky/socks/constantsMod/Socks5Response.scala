package typingsSlinky.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Socks5Response extends StObject
@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Response with Double] = js.native
  
  @js.native
  sealed trait AddressNotSupported extends Socks5Response
  /* 8 */ val AddressNotSupported: typingsSlinky.socks.constantsMod.Socks5Response.AddressNotSupported with Double = js.native
  
  @js.native
  sealed trait CommandNotSupported extends Socks5Response
  /* 7 */ val CommandNotSupported: typingsSlinky.socks.constantsMod.Socks5Response.CommandNotSupported with Double = js.native
  
  @js.native
  sealed trait ConnectionRefused extends Socks5Response
  /* 5 */ val ConnectionRefused: typingsSlinky.socks.constantsMod.Socks5Response.ConnectionRefused with Double = js.native
  
  @js.native
  sealed trait Failure extends Socks5Response
  /* 1 */ val Failure: typingsSlinky.socks.constantsMod.Socks5Response.Failure with Double = js.native
  
  @js.native
  sealed trait Granted extends Socks5Response
  /* 0 */ val Granted: typingsSlinky.socks.constantsMod.Socks5Response.Granted with Double = js.native
  
  @js.native
  sealed trait HostUnreachable extends Socks5Response
  /* 4 */ val HostUnreachable: typingsSlinky.socks.constantsMod.Socks5Response.HostUnreachable with Double = js.native
  
  @js.native
  sealed trait NetworkUnreachable extends Socks5Response
  /* 3 */ val NetworkUnreachable: typingsSlinky.socks.constantsMod.Socks5Response.NetworkUnreachable with Double = js.native
  
  @js.native
  sealed trait NotAllowed extends Socks5Response
  /* 2 */ val NotAllowed: typingsSlinky.socks.constantsMod.Socks5Response.NotAllowed with Double = js.native
  
  @js.native
  sealed trait TTLExpired extends Socks5Response
  /* 6 */ val TTLExpired: typingsSlinky.socks.constantsMod.Socks5Response.TTLExpired with Double = js.native
}
