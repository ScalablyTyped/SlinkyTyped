package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "OutputFile")
@js.native
class OutputFile protected ()
  extends typingsSlinky.typescriptServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsSlinky.typescriptServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsSlinky.typescriptServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typingsSlinky.typescriptServices.TypeScript.SourceMapEntry]
  ) = this()
}

