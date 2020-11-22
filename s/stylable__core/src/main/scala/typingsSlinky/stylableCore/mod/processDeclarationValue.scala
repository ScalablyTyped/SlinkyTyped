package typingsSlinky.stylableCore.mod

import typingsSlinky.postcss.mod.Node
import typingsSlinky.std.Record
import typingsSlinky.stylableCore.anon.OutputValue
import typingsSlinky.stylableCore.stylableTransformerMod.replaceValueHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "processDeclarationValue")
@js.native
object processDeclarationValue extends js.Object {
  
  def apply(
    resolver: typingsSlinky.stylableCore.stylableResolverMod.StylableResolver,
    value: String,
    meta: typingsSlinky.stylableCore.stylableProcessorMod.StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[typingsSlinky.stylableCore.diagnosticsMod.Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): OutputValue = js.native
}
