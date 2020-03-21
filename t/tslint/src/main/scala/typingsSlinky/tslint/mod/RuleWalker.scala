package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typingsSlinky.tslint.walkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

