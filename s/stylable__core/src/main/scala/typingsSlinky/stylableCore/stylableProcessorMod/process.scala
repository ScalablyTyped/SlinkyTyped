package typingsSlinky.stylableCore.stylableProcessorMod

import typingsSlinky.postcss.mod.Root_
import typingsSlinky.stylableCore.diagnosticsMod.Diagnostics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-processor", "process")
@js.native
object process extends js.Object {
  
  def apply(root: Root_): typingsSlinky.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(
    root: Root_,
    diagnostics: js.UndefOr[scala.Nothing],
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typingsSlinky.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(root: Root_, diagnostics: Diagnostics): typingsSlinky.stylableCore.stylableMetaMod.StylableMeta = js.native
  def apply(
    root: Root_,
    diagnostics: Diagnostics,
    resolveNamespace: js.Function2[/* namespace */ String, /* source */ String, String]
  ): typingsSlinky.stylableCore.stylableMetaMod.StylableMeta = js.native
}
