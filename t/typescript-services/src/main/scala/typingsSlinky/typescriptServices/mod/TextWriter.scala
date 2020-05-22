package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextWriter")
@js.native
class TextWriter protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TextWriter {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    outputFileType: typingsSlinky.typescriptServices.TypeScript.OutputFileType
  ) = this()
  /* CompleteClass */
  override var contents: js.Any = js.native
  /* CompleteClass */
  override var name: js.Any = js.native
  /* CompleteClass */
  override var onNewLine: Boolean = js.native
  /* CompleteClass */
  override var outputFileType: js.Any = js.native
  /* CompleteClass */
  override var writeByteOrderMark: js.Any = js.native
  /* CompleteClass */
  override def Close(): Unit = js.native
  /* CompleteClass */
  override def Write(s: String): Unit = js.native
  /* CompleteClass */
  override def WriteLine(s: String): Unit = js.native
  /* CompleteClass */
  override def getOutputFile(): typingsSlinky.typescriptServices.TypeScript.OutputFile = js.native
}

