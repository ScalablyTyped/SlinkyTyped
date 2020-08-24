package typingsSlinky.streamsaver.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.QueuingStrategy
import typingsSlinky.std.UnderlyingSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("streamsaver", "WritableStream")
@js.native
class WritableStream[W] ()
  extends typingsSlinky.std.WritableStream[W] {
  def this(underlyingSink: UnderlyingSink[W]) = this()
  def this(underlyingSink: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[W]) = this()
  def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
}

@JSImport("streamsaver", "WritableStream")
@js.native
object WritableStream
  extends Instantiable0[typingsSlinky.std.WritableStream[js.Object]]
     with Instantiable1[
      /* underlyingSink */ UnderlyingSink[js.Object], 
      typingsSlinky.std.WritableStream[js.Object]
    ]
     with Instantiable2[
      js.UndefOr[/* underlyingSink */ UnderlyingSink[js.Object]], 
      /* strategy */ QueuingStrategy[js.Object], 
      typingsSlinky.std.WritableStream[js.Object]
    ]

