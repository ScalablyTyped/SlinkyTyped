package typingsSlinky.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ByteOrderMark extends StObject
@JSGlobal("TypeScript.ByteOrderMark")
@js.native
object ByteOrderMark extends StObject {
  
  @js.native
  sealed trait None extends ByteOrderMark
  
  @js.native
  sealed trait Utf16BigEndian extends ByteOrderMark
  
  @js.native
  sealed trait Utf16LittleEndian extends ByteOrderMark
  
  @js.native
  sealed trait Utf8 extends ByteOrderMark
}
