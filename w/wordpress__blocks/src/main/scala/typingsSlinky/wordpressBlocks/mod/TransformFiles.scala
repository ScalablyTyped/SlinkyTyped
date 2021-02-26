package typingsSlinky.wordpressBlocks.mod

import org.scalajs.dom.raw.FileList
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformFiles[T /* <: Record[String, _] */] extends Transform[T] {
  
  var isMatch: js.UndefOr[js.Function1[/* files */ FileList, Boolean]] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  def transform(files: FileList): BlockInstance[Partial[T]] = js.native
  def transform(files: FileList, onChange: js.Function2[/* id */ String, /* attrs */ T, Unit]): BlockInstance[Partial[T]] = js.native
  
  var `type`: files = js.native
}
