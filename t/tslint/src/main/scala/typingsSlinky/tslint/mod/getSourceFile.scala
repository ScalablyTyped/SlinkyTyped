package typingsSlinky.tslint.mod

import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "getSourceFile")
@js.native
object getSourceFile extends js.Object {
  def apply(fileName: String, source: String): SourceFile = js.native
}

