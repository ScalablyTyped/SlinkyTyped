package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BuildOptions
import typingsSlinky.typescript.mod.BuilderProgram
import typingsSlinky.typescript.mod.SolutionBuilder
import typingsSlinky.typescript.mod.SolutionBuilderHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createSolutionBuilder")
@js.native
object createSolutionBuilder extends js.Object {
  
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
}
