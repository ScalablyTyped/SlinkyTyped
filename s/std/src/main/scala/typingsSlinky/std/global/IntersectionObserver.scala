package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.IntersectionObserverCallback
import typingsSlinky.std.IntersectionObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends typingsSlinky.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
}
@JSGlobal("IntersectionObserver")
@js.native
object IntersectionObserver
  extends Instantiable1[
      /* callback */ IntersectionObserverCallback, 
      typingsSlinky.std.IntersectionObserver
    ]
     with Instantiable2[
      /* callback */ IntersectionObserverCallback, 
      /* options */ IntersectionObserverInit, 
      typingsSlinky.std.IntersectionObserver
    ]
