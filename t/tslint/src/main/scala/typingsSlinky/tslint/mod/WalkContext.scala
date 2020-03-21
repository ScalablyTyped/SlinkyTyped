package typingsSlinky.tslint.mod

import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends typingsSlinky.tslint.walkerMod.WalkContext[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}

