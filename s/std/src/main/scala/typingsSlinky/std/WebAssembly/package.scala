package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebAssembly {
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typingsSlinky.std.WebAssembly.Global
    - typingsSlinky.std.WebAssembly.Memory
    - typingsSlinky.std.WebAssembly.Table
  */
  type ExportValue = typingsSlinky.std.WebAssembly._ExportValue | js.Function
  type Exports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ExportValue]
  type ImportValue = typingsSlinky.std.WebAssembly.ExportValue | scala.Double
  type Imports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ModuleImports]
  type ModuleImports = typingsSlinky.std.Record[java.lang.String, typingsSlinky.std.WebAssembly.ImportValue]
  type TableKind = typingsSlinky.std.stdStrings.anyfunc
}
