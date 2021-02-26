package typingsSlinky.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("thrift", "Thrift.MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  
  @js.native
  sealed trait CALL extends MessageType
  /* 1 */ val CALL: typingsSlinky.thrift.mod.Thrift.MessageType.CALL with Double = js.native
  
  @js.native
  sealed trait EXCEPTION extends MessageType
  /* 3 */ val EXCEPTION: typingsSlinky.thrift.mod.Thrift.MessageType.EXCEPTION with Double = js.native
  
  @js.native
  sealed trait ONEWAY extends MessageType
  /* 4 */ val ONEWAY: typingsSlinky.thrift.mod.Thrift.MessageType.ONEWAY with Double = js.native
  
  @js.native
  sealed trait REPLY extends MessageType
  /* 2 */ val REPLY: typingsSlinky.thrift.mod.Thrift.MessageType.REPLY with Double = js.native
}
