package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typingsSlinky.tslint.walkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
