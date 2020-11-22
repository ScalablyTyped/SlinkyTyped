package typingsSlinky.vueDocgenApi

import typingsSlinky.vueDocgenApi.documentationMod.default
import typingsSlinky.vueDocgenApi.parseMod.ParseOptions
import typingsSlinky.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import typingsSlinky.vueDocgenApi.vueDocgenApiStrings.`extends`
import typingsSlinky.vueDocgenApi.vueDocgenApiStrings.mixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/utils/documentRequiredComponents", JSImport.Namespace)
@js.native
object documentRequiredComponentsMod extends js.Object {
  
  def default(
    documentation: js.UndefOr[scala.Nothing],
    varToFilePath: ImportedVariableSet,
    originObject: js.UndefOr[scala.Nothing],
    opt: ParseOptions
  ): js.Promise[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]] = js.native
  def default(
    documentation: typingsSlinky.vueDocgenApi.documentationMod.default,
    varToFilePath: ImportedVariableSet,
    originObject: js.UndefOr[scala.Nothing],
    opt: ParseOptions
  ): js.Promise[js.Array[typingsSlinky.vueDocgenApi.documentationMod.default]] = js.native
  @JSName("default")
  def default_extends(
    documentation: js.UndefOr[scala.Nothing],
    varToFilePath: ImportedVariableSet,
    originObject: `extends`,
    opt: ParseOptions
  ): js.Promise[js.Array[default]] = js.native
  @JSName("default")
  def default_extends(
    documentation: default,
    varToFilePath: ImportedVariableSet,
    originObject: `extends`,
    opt: ParseOptions
  ): js.Promise[js.Array[default]] = js.native
  @JSName("default")
  def default_mixin(
    documentation: js.UndefOr[scala.Nothing],
    varToFilePath: ImportedVariableSet,
    originObject: mixin,
    opt: ParseOptions
  ): js.Promise[js.Array[default]] = js.native
  @JSName("default")
  def default_mixin(documentation: default, varToFilePath: ImportedVariableSet, originObject: mixin, opt: ParseOptions): js.Promise[js.Array[default]] = js.native
}
