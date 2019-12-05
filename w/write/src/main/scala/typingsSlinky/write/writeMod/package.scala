package typingsSlinky.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object writeMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.fsMod.MakeDirectoryOptions
  import typingsSlinky.node.fsMod.WriteFileOptions
  import typingsSlinky.std.Extract
  import typingsSlinky.std.Omit
  import typingsSlinky.std.Record
  import typingsSlinky.write.writeStrings.encoding
  import typingsSlinky.write.writeStrings.recursive

  type Callback[T /* <: Data */] = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Result[T]], js.Any]
  type CreateWriteStreamOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.Fn_Options>[1] */ js.Any, 
    Record[String, js.Any]
  ]
  type Data = String | Buffer | scala.scalajs.js.typedarray.Uint8Array
  type Options = (Omit[WriteFileOptions, encoding]) with (Omit[MakeDirectoryOptions, recursive]) with CommonOptions
  type StreamOptions = (Omit[CreateWriteStreamOptions, encoding]) with (Omit[MakeDirectoryOptions, recursive]) with CommonOptions
}
