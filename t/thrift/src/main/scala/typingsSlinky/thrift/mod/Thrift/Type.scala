package typingsSlinky.thrift.mod.Thrift

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSImport("thrift", "Thrift.Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait BOOL extends Type
  /* 2 */ val BOOL: typingsSlinky.thrift.mod.Thrift.Type.BOOL with Double = js.native
  
  @js.native
  sealed trait BYTE extends Type
  /* 3 */ val BYTE: typingsSlinky.thrift.mod.Thrift.Type.BYTE with Double = js.native
  
  @js.native
  sealed trait DOUBLE extends Type
  /* 4 */ val DOUBLE: typingsSlinky.thrift.mod.Thrift.Type.DOUBLE with Double = js.native
  
  @js.native
  sealed trait I08 extends Type
  /* 3 */ val I08: typingsSlinky.thrift.mod.Thrift.Type.I08 with Double = js.native
  
  @js.native
  sealed trait I16 extends Type
  /* 6 */ val I16: typingsSlinky.thrift.mod.Thrift.Type.I16 with Double = js.native
  
  @js.native
  sealed trait I32 extends Type
  /* 8 */ val I32: typingsSlinky.thrift.mod.Thrift.Type.I32 with Double = js.native
  
  @js.native
  sealed trait I64 extends Type
  /* 10 */ val I64: typingsSlinky.thrift.mod.Thrift.Type.I64 with Double = js.native
  
  @js.native
  sealed trait LIST extends Type
  /* 15 */ val LIST: typingsSlinky.thrift.mod.Thrift.Type.LIST with Double = js.native
  
  @js.native
  sealed trait MAP extends Type
  /* 13 */ val MAP: typingsSlinky.thrift.mod.Thrift.Type.MAP with Double = js.native
  
  @js.native
  sealed trait SET extends Type
  /* 14 */ val SET: typingsSlinky.thrift.mod.Thrift.Type.SET with Double = js.native
  
  @js.native
  sealed trait STOP extends Type
  /* 0 */ val STOP: typingsSlinky.thrift.mod.Thrift.Type.STOP with Double = js.native
  
  @js.native
  sealed trait STRING extends Type
  /* 11 */ val STRING: typingsSlinky.thrift.mod.Thrift.Type.STRING with Double = js.native
  
  @js.native
  sealed trait STRUCT extends Type
  /* 12 */ val STRUCT: typingsSlinky.thrift.mod.Thrift.Type.STRUCT with Double = js.native
  
  @js.native
  sealed trait UTF16 extends Type
  /* 17 */ val UTF16: typingsSlinky.thrift.mod.Thrift.Type.UTF16 with Double = js.native
  
  @js.native
  sealed trait UTF7 extends Type
  /* 11 */ val UTF7: typingsSlinky.thrift.mod.Thrift.Type.UTF7 with Double = js.native
  
  @js.native
  sealed trait UTF8 extends Type
  /* 16 */ val UTF8: typingsSlinky.thrift.mod.Thrift.Type.UTF8 with Double = js.native
  
  @js.native
  sealed trait VOID extends Type
  /* 1 */ val VOID: typingsSlinky.thrift.mod.Thrift.Type.VOID with Double = js.native
}
