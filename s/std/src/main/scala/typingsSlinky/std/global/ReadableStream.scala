package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.QueuingStrategy
import typingsSlinky.std.UnderlyingByteSource
import typingsSlinky.std.UnderlyingSource
import typingsSlinky.std.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReadableStream")
@js.native
class ReadableStream[R] ()
  extends typingsSlinky.std.ReadableStream[R] {
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
}

@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends Instantiable0[org.scalajs.dom.experimental.ReadableStream[js.Object]]
     with Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      org.scalajs.dom.experimental.ReadableStream[js.Object | js.typedarray.Uint8Array]
    ]
     with Instantiable2[
      js.UndefOr[
        (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object])
      ], 
      (/* strategy */ QueuingStrategy[js.Object]) | (/* strategy */ Size), 
      org.scalajs.dom.experimental.ReadableStream[js.Object | js.typedarray.Uint8Array]
    ]

