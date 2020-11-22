package typingsSlinky.vueCompilerDom.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.vueCompilerCore.mod.CompilerError
import typingsSlinky.vueCompilerCore.mod.CoreCompilerError
import typingsSlinky.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createCompilerError")
@js.native
object createCompilerError extends js.Object {
  
  def apply[T /* <: Double */](code: T): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: js.UndefOr[scala.Nothing],
    additionalMessage: String
  ): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](code: T, loc: js.UndefOr[scala.Nothing], messages: NumberDictionary[String]): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](
    code: T,
    loc: js.UndefOr[scala.Nothing],
    messages: NumberDictionary[String],
    additionalMessage: String
  ): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](code: T, loc: SourceLocation): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](code: T, loc: SourceLocation, messages: js.UndefOr[scala.Nothing], additionalMessage: String): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String]): CompilerError | CoreCompilerError = js.native
  def apply[T /* <: Double */](code: T, loc: SourceLocation, messages: NumberDictionary[String], additionalMessage: String): CompilerError | CoreCompilerError = js.native
}
