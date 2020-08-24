package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.BuildOptions
import typingsSlinky.typescript.mod.BuilderProgram
import typingsSlinky.typescript.mod.SolutionBuilder
import typingsSlinky.typescript.mod.SolutionBuilderWithWatchHost
import typingsSlinky.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSolutionBuilderWithWatch")
@js.native
object createSolutionBuilderWithWatch extends js.Object {
  def apply[T /* <: BuilderProgram */](host: SolutionBuilderWithWatchHost[T], rootNames: js.Array[String], defaultOptions: BuildOptions): SolutionBuilder[T] = js.native
  def apply[T /* <: BuilderProgram */](
    host: SolutionBuilderWithWatchHost[T],
    rootNames: js.Array[String],
    defaultOptions: BuildOptions,
    baseWatchOptions: WatchOptions
  ): SolutionBuilder[T] = js.native
}

