package typingsSlinky.typedoc

import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsMod.ReferenceReflection
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod {
  
  @JSImport("typedoc/dist/lib/converter/factories/reference", "createReferenceReflection")
  @js.native
  def createReferenceReflection(context: Context, source: Symbol, target: Symbol): js.UndefOr[ReferenceReflection] = js.native
  
  @JSImport("typedoc/dist/lib/converter/factories/reference", "createReferenceType")
  @js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories/reference", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories/reference", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  @JSImport("typedoc/dist/lib/converter/factories/reference", "createReferenceType")
  @js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
}
