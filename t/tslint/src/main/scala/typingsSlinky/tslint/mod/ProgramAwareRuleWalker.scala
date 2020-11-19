package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.typescript.mod.Program
import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "ProgramAwareRuleWalker")
@js.native
class ProgramAwareRuleWalker protected ()
  extends typingsSlinky.tslint.walkerMod.ProgramAwareRuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
}
