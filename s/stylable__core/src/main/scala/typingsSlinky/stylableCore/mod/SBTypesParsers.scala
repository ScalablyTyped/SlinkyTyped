package typingsSlinky.stylableCore.mod

import typingsSlinky.postcss.mod.Declaration
import typingsSlinky.stylableCore.anon.Ast
import typingsSlinky.stylableCore.anon.KeyframesMap
import typingsSlinky.stylableCore.stylableCoreStrings.args
import typingsSlinky.stylableCore.stylableCoreStrings.named
import typingsSlinky.stylableCore.stylableValueParsersMod.MappedStates
import typingsSlinky.stylableCore.stylableValueParsersMod.MixinValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "SBTypesParsers")
@js.native
object SBTypesParsers extends js.Object {
  
  def `-st-extends`(value: String): Ast = js.native
  
  def `-st-global`(decl: Declaration, _diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics): js.Any = js.native
  
  def `-st-mixin`(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
  def `-st-mixin`(
    mixinNode: Declaration,
    strategy: js.Function1[/* type */ String, named | args],
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): js.Array[MixinValue] = js.native
  
  def `-st-named`(
    value: String,
    node: Declaration,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): KeyframesMap = js.native
  
  def `-st-partial-mixin`(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
  def `-st-partial-mixin`(
    mixinNode: Declaration,
    strategy: js.Function1[/* type */ String, named | args],
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): js.Array[MixinValue] = js.native
  
  def `-st-root`(value: String): Boolean = js.native
  
  def `-st-states`(
    value: String,
    decl: Declaration,
    diagnostics: typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
  ): MappedStates = js.native
}
