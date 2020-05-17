package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  type Exports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ExportValue]
  type Imports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ModuleImports]
  type ModuleImports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ImportValue]
  type TableKind = typingsSlinky.std.stdStrings.anyfunc
}
