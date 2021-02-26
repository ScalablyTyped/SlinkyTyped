package typingsSlinky.tsCustomError

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Error
import typingsSlinky.std.ErrorConstructor
import typingsSlinky.std.EvalErrorConstructor
import typingsSlinky.std.RangeErrorConstructor
import typingsSlinky.std.ReferenceErrorConstructor
import typingsSlinky.std.SyntaxErrorConstructor
import typingsSlinky.std.TypeErrorConstructor
import typingsSlinky.std.URIErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customErrorUmdMinMod {
  
  @JSImport("ts-custom-error/dist/custom-error.umd.min", "CustomError")
  @js.native
  class CustomError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("ts-custom-error/dist/custom-error.umd.min", "customErrorFactory")
  @js.native
  def customErrorFactory[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = js.native
  @JSImport("ts-custom-error/dist/custom-error.umd.min", "customErrorFactory")
  @js.native
  def customErrorFactory[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = js.native
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */] extends ErrorConstructor {
    
    def apply(args: js.Any*): js.Error with Properties = js.native
  }
  
  type CustomErrorInterface = js.Error
  
  type CustomErrorProperties = StringDictionary[js.Any]
  
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}
