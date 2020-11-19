package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.BlobPropertyBag
import typingsSlinky.std.BlobPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Blob")
@js.native
class Blob ()
  extends typingsSlinky.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.UndefOr[scala.Nothing], options: BlobPropertyBag) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
}
@JSGlobal("Blob")
@js.native
object Blob
  extends Instantiable0[org.scalajs.dom.raw.Blob]
     with Instantiable1[/* blobParts */ js.Array[BlobPart], org.scalajs.dom.raw.Blob]
     with Instantiable2[
      js.UndefOr[/* blobParts */ js.Array[BlobPart]], 
      /* options */ BlobPropertyBag, 
      org.scalajs.dom.raw.Blob
    ]
