package typingsSlinky.std.global.WebAssembly

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.std.BufferSource
import typingsSlinky.std.WebAssembly.ModuleExportDescriptor
import typingsSlinky.std.WebAssembly.ModuleImportDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.Module")
@js.native
object Module
  extends Instantiable1[/* bytes */ BufferSource, typingsSlinky.std.WebAssembly.Module] {
  def customSections(moduleObject: typingsSlinky.std.WebAssembly.Module, sectionName: String): js.Array[js.typedarray.ArrayBuffer] = js.native
  def exports(moduleObject: typingsSlinky.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = js.native
  def imports(moduleObject: typingsSlinky.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = js.native
}

