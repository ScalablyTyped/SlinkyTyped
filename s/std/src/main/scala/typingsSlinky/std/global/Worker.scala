package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Worker")
@js.native
class Worker protected ()
  extends typingsSlinky.std.Worker {
  def this(stringUrl: java.lang.String) = this()
  def this(stringUrl: org.scalajs.dom.experimental.URL) = this()
  def this(stringUrl: java.lang.String, options: WorkerOptions) = this()
  def this(stringUrl: org.scalajs.dom.experimental.URL, options: WorkerOptions) = this()
}

@JSGlobal("Worker")
@js.native
object Worker
  extends Instantiable1[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ org.scalajs.dom.experimental.URL), 
      org.scalajs.dom.raw.Worker
    ]
     with Instantiable2[
      (/* stringUrl */ java.lang.String) | (/* stringUrl */ org.scalajs.dom.experimental.URL), 
      /* options */ WorkerOptions, 
      org.scalajs.dom.raw.Worker
    ]

