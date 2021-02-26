package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectFlags extends StObject
@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags with Double] = js.native
  
  @js.native
  sealed trait Anonymous extends ObjectFlags
  /* 16 */ val Anonymous: typingsSlinky.typescript.mod.ObjectFlags.Anonymous with Double = js.native
  
  @js.native
  sealed trait ArrayLiteral extends ObjectFlags
  /* 65536 */ val ArrayLiteral: typingsSlinky.typescript.mod.ObjectFlags.ArrayLiteral with Double = js.native
  
  @js.native
  sealed trait Class extends ObjectFlags
  /* 1 */ val Class: typingsSlinky.typescript.mod.ObjectFlags.Class with Double = js.native
  
  @js.native
  sealed trait ClassOrInterface extends ObjectFlags
  /* 3 */ val ClassOrInterface: typingsSlinky.typescript.mod.ObjectFlags.ClassOrInterface with Double = js.native
  
  @js.native
  sealed trait ContainsSpread extends ObjectFlags
  /* 1024 */ val ContainsSpread: typingsSlinky.typescript.mod.ObjectFlags.ContainsSpread with Double = js.native
  
  @js.native
  sealed trait EvolvingArray extends ObjectFlags
  /* 256 */ val EvolvingArray: typingsSlinky.typescript.mod.ObjectFlags.EvolvingArray with Double = js.native
  
  @js.native
  sealed trait FreshLiteral extends ObjectFlags
  /* 32768 */ val FreshLiteral: typingsSlinky.typescript.mod.ObjectFlags.FreshLiteral with Double = js.native
  
  @js.native
  sealed trait Instantiated extends ObjectFlags
  /* 64 */ val Instantiated: typingsSlinky.typescript.mod.ObjectFlags.Instantiated with Double = js.native
  
  @js.native
  sealed trait Interface extends ObjectFlags
  /* 2 */ val Interface: typingsSlinky.typescript.mod.ObjectFlags.Interface with Double = js.native
  
  @js.native
  sealed trait JSLiteral extends ObjectFlags
  /* 16384 */ val JSLiteral: typingsSlinky.typescript.mod.ObjectFlags.JSLiteral with Double = js.native
  
  @js.native
  sealed trait JsxAttributes extends ObjectFlags
  /* 4096 */ val JsxAttributes: typingsSlinky.typescript.mod.ObjectFlags.JsxAttributes with Double = js.native
  
  @js.native
  sealed trait Mapped extends ObjectFlags
  /* 32 */ val Mapped: typingsSlinky.typescript.mod.ObjectFlags.Mapped with Double = js.native
  
  @js.native
  sealed trait MarkerType extends ObjectFlags
  /* 8192 */ val MarkerType: typingsSlinky.typescript.mod.ObjectFlags.MarkerType with Double = js.native
  
  @js.native
  sealed trait ObjectLiteral extends ObjectFlags
  /* 128 */ val ObjectLiteral: typingsSlinky.typescript.mod.ObjectFlags.ObjectLiteral with Double = js.native
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties extends ObjectFlags
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: typingsSlinky.typescript.mod.ObjectFlags.ObjectLiteralPatternWithComputedProperties with Double = js.native
  
  @js.native
  sealed trait ObjectRestType extends ObjectFlags
  /* 131072 */ val ObjectRestType: typingsSlinky.typescript.mod.ObjectFlags.ObjectRestType with Double = js.native
  
  @js.native
  sealed trait Reference extends ObjectFlags
  /* 4 */ val Reference: typingsSlinky.typescript.mod.ObjectFlags.Reference with Double = js.native
  
  @js.native
  sealed trait ReverseMapped extends ObjectFlags
  /* 2048 */ val ReverseMapped: typingsSlinky.typescript.mod.ObjectFlags.ReverseMapped with Double = js.native
  
  @js.native
  sealed trait Tuple extends ObjectFlags
  /* 8 */ val Tuple: typingsSlinky.typescript.mod.ObjectFlags.Tuple with Double = js.native
}
