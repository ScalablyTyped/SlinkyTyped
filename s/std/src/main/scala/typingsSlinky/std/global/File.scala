package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.std.BlobPart
import typingsSlinky.std.FilePropertyBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("File")
@js.native
class File protected ()
  extends typingsSlinky.std.File {
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String) = this()
  def this(fileBits: js.Array[BlobPart], fileName: java.lang.String, options: FilePropertyBag) = this()
}

@JSGlobal("File")
@js.native
object File
  extends Instantiable2[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      org.scalajs.dom.raw.File
    ]
     with Instantiable3[
      /* fileBits */ js.Array[BlobPart], 
      /* fileName */ java.lang.String, 
      /* options */ FilePropertyBag, 
      org.scalajs.dom.raw.File
    ]

