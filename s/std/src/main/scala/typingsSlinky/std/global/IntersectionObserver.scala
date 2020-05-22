package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.IntersectionObserverCallback
import typingsSlinky.std.IntersectionObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("IntersectionObserver")
@js.native
class IntersectionObserver protected ()
  extends typingsSlinky.std.IntersectionObserver {
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  /* CompleteClass */
  override val root: org.scalajs.dom.raw.Element | Null = js.native
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  /* CompleteClass */
  override def observe(target: org.scalajs.dom.raw.Element): Unit = js.native
  /* CompleteClass */
  override def takeRecords(): js.Array[typingsSlinky.std.IntersectionObserverEntry] = js.native
  /* CompleteClass */
  override def unobserve(target: org.scalajs.dom.raw.Element): Unit = js.native
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

