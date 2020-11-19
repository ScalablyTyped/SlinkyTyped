package typingsSlinky.socks

import typingsSlinky.socks.constantsMod.SocksCommandOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socksStrings {
  
  @scala.inline
  def associate: associate = "associate".asInstanceOf[associate]
  
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  
  @scala.inline
  def bound: bound = "bound".asInstanceOf[bound]
  
  @scala.inline
  def connect: connect = "connect".asInstanceOf[connect]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def established: established = "established".asInstanceOf[established]
  
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @scala.inline
  def ipaddress: ipaddress = "ipaddress".asInstanceOf[ipaddress]
  
  @js.native
  sealed trait associate extends SocksCommandOption
  
  @js.native
  sealed trait bind extends SocksCommandOption
  
  @js.native
  sealed trait bound extends js.Object
  
  @js.native
  sealed trait connect extends SocksCommandOption
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait established extends js.Object
  
  @js.native
  sealed trait host extends js.Object
  
  @js.native
  sealed trait ipaddress extends js.Object
}
