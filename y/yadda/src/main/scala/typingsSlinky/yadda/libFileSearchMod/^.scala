package typingsSlinky.yadda.libFileSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/FileSearch", JSImport.Namespace)
@js.native
class ^ protected () extends FileSearch {
  def this(directories: String) = this()
  def this(directories: String, patterns: js.RegExp) = this()
  /* CompleteClass */
  override def each(fn: js.Function1[/* file */ String, Unit]): Unit = js.native
  /* CompleteClass */
  override def list(): js.Array[String] = js.native
}

