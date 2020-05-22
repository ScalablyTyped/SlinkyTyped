package typingsSlinky.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T /* <: typingsSlinky.write.mod.Data */] = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ js.UndefOr[typingsSlinky.write.mod.Result[T]], 
    js.Any
  ]
  type CreateWriteStreamOptions = typingsSlinky.std.Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.anon.FnCall>[1] */ js.Any, 
    typingsSlinky.std.Record[java.lang.String, js.Any]
  ]
  type Data = java.lang.String | typingsSlinky.node.Buffer | js.typedarray.Uint8Array
  type Options = (typingsSlinky.std.Omit[
    typingsSlinky.node.fsMod.WriteFileOptions, 
    typingsSlinky.write.writeStrings.encoding
  ]) with typingsSlinky.write.anon.OmitMakeDirectoryOptionsr with typingsSlinky.write.mod.CommonOptions
  type StreamOptions = (typingsSlinky.std.Omit[
    typingsSlinky.write.mod.CreateWriteStreamOptions, 
    typingsSlinky.write.writeStrings.encoding
  ]) with typingsSlinky.write.anon.OmitMakeDirectoryOptionsr with typingsSlinky.write.mod.CommonOptions
}
