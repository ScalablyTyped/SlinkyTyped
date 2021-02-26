package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolFormatFlags extends StObject
@JSImport("typescript", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFormatFlags with Double] = js.native
  
  @js.native
  sealed trait AllowAnyNodeKind extends SymbolFormatFlags
  /* 4 */ val AllowAnyNodeKind: typingsSlinky.typescript.mod.SymbolFormatFlags.AllowAnyNodeKind with Double = js.native
  
  @js.native
  sealed trait None extends SymbolFormatFlags
  /* 0 */ val None: typingsSlinky.typescript.mod.SymbolFormatFlags.None with Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends SymbolFormatFlags
  /* 8 */ val UseAliasDefinedOutsideCurrentScope: typingsSlinky.typescript.mod.SymbolFormatFlags.UseAliasDefinedOutsideCurrentScope with Double = js.native
  
  @js.native
  sealed trait UseOnlyExternalAliasing extends SymbolFormatFlags
  /* 2 */ val UseOnlyExternalAliasing: typingsSlinky.typescript.mod.SymbolFormatFlags.UseOnlyExternalAliasing with Double = js.native
  
  @js.native
  sealed trait WriteTypeParametersOrArguments extends SymbolFormatFlags
  /* 1 */ val WriteTypeParametersOrArguments: typingsSlinky.typescript.mod.SymbolFormatFlags.WriteTypeParametersOrArguments with Double = js.native
}
