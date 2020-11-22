package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.TemplateMiddle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createTemplateMiddle")
@js.native
object createTemplateMiddle extends js.Object {
  
  def apply(text: js.UndefOr[scala.Nothing], rawText: String): TemplateMiddle = js.native
  def apply(
    text: js.UndefOr[scala.Nothing],
    rawText: String,
    templateFlags: typingsSlinky.typescript.mod.TokenFlags
  ): TemplateMiddle = js.native
  /** @deprecated Use `factory.createTemplateMiddle` or the factory supplied by your transformation context instead. */
  def apply(text: String): TemplateMiddle = js.native
  def apply(
    text: String,
    rawText: js.UndefOr[scala.Nothing],
    templateFlags: typingsSlinky.typescript.mod.TokenFlags
  ): TemplateMiddle = js.native
  def apply(text: String, rawText: String): TemplateMiddle = js.native
  def apply(text: String, rawText: String, templateFlags: typingsSlinky.typescript.mod.TokenFlags): TemplateMiddle = js.native
}
