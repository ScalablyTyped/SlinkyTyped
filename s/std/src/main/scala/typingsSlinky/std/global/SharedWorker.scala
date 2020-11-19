package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.WorkerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SharedWorker")
@js.native
class SharedWorker protected ()
  extends typingsSlinky.std.SharedWorker {
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: java.lang.String) = this()
  def this(scriptURL: java.lang.String, options: WorkerOptions) = this()
}
@JSGlobal("SharedWorker")
@js.native
object SharedWorker
  extends Instantiable1[/* scriptURL */ java.lang.String, typingsSlinky.std.SharedWorker]
     with Instantiable2[
      /* scriptURL */ java.lang.String, 
      (/* options */ java.lang.String) | (/* options */ WorkerOptions), 
      typingsSlinky.std.SharedWorker
    ]
