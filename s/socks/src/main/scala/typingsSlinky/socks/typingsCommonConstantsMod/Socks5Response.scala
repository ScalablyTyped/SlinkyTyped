package typingsSlinky.socks.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Socks5Response extends js.Object

@JSImport("socks/typings/common/constants", "Socks5Response")
@js.native
object Socks5Response extends js.Object {
  @js.native
  sealed trait AddressNotSupported extends Socks5Response
  
  @js.native
  sealed trait CommandNotSupported extends Socks5Response
  
  @js.native
  sealed trait ConnectionRefused extends Socks5Response
  
  @js.native
  sealed trait Failure extends Socks5Response
  
  @js.native
  sealed trait Granted extends Socks5Response
  
  @js.native
  sealed trait HostUnreachable extends Socks5Response
  
  @js.native
  sealed trait NetworkUnreachable extends Socks5Response
  
  @js.native
  sealed trait NotAllowed extends Socks5Response
  
  @js.native
  sealed trait TTLExpired extends Socks5Response
  
  /* 8 */ val AddressNotSupported: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.AddressNotSupported with Double = js.native
  /* 7 */ val CommandNotSupported: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.CommandNotSupported with Double = js.native
  /* 5 */ val ConnectionRefused: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.ConnectionRefused with Double = js.native
  /* 1 */ val Failure: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.Failure with Double = js.native
  /* 0 */ val Granted: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.Granted with Double = js.native
  /* 4 */ val HostUnreachable: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.HostUnreachable with Double = js.native
  /* 3 */ val NetworkUnreachable: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.NetworkUnreachable with Double = js.native
  /* 2 */ val NotAllowed: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.NotAllowed with Double = js.native
  /* 6 */ val TTLExpired: typingsSlinky.socks.typingsCommonConstantsMod.Socks5Response.TTLExpired with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Socks5Response with Double] = js.native
}

