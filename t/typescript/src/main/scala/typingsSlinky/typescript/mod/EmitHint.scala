package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmitHint extends StObject
@JSImport("typescript", "EmitHint")
@js.native
object EmitHint extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitHint with Double] = js.native
  
  @js.native
  sealed trait EmbeddedStatement extends EmitHint
  /* 5 */ val EmbeddedStatement: typingsSlinky.typescript.mod.EmitHint.EmbeddedStatement with Double = js.native
  
  @js.native
  sealed trait Expression extends EmitHint
  /* 1 */ val Expression: typingsSlinky.typescript.mod.EmitHint.Expression with Double = js.native
  
  @js.native
  sealed trait IdentifierName extends EmitHint
  /* 2 */ val IdentifierName: typingsSlinky.typescript.mod.EmitHint.IdentifierName with Double = js.native
  
  @js.native
  sealed trait JsxAttributeValue extends EmitHint
  /* 6 */ val JsxAttributeValue: typingsSlinky.typescript.mod.EmitHint.JsxAttributeValue with Double = js.native
  
  @js.native
  sealed trait MappedTypeParameter extends EmitHint
  /* 3 */ val MappedTypeParameter: typingsSlinky.typescript.mod.EmitHint.MappedTypeParameter with Double = js.native
  
  @js.native
  sealed trait SourceFile extends EmitHint
  /* 0 */ val SourceFile: typingsSlinky.typescript.mod.EmitHint.SourceFile with Double = js.native
  
  @js.native
  sealed trait Unspecified extends EmitHint
  /* 4 */ val Unspecified: typingsSlinky.typescript.mod.EmitHint.Unspecified with Double = js.native
}
