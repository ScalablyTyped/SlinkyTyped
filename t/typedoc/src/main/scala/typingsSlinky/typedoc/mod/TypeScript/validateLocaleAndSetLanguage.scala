package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.anon.FileExists
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.validateLocaleAndSetLanguage")
@js.native
object validateLocaleAndSetLanguage extends js.Object {
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def apply(locale: String, sys: FileExists): Unit = js.native
  def apply(locale: String, sys: FileExists, errors: Push[Diagnostic]): Unit = js.native
}

