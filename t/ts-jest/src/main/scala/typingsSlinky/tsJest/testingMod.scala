package typingsSlinky.tsJest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ReturnType
import typingsSlinky.tsJest.tsJestBooleans.`false`
import typingsSlinky.tsJest.tsJestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/utils/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  
  def mocked[T](item: T): MaybeMocked[T] = js.native
  @JSName("mocked")
  def mocked_false[T](item: T, deep: `false`): MaybeMocked[T] = js.native
  @JSName("mocked")
  def mocked_true[T](item: T, deep: `true`): MaybeMockedDeep[T] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<ReturnType<T>, ArgumentsOf<T>> * / any */ @js.native
  trait MockWithArgs[T /* <: MockableFunction */] extends Instantiable1[/* args */ ConstructorArgumentsOf[T], T] {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentsOf<T> is not an array type */ args: ArgumentsOf[T]
    ): ReturnType[T] = js.native
  }
  
  type ArgumentsOf[T] = js.Any
  
  type ConstructorArgumentsOf[T] = js.Any
  
  type MaybeMocked[T] = T | MockedObject[T] | MockedFunction[T]
  
  type MaybeMockedConstructor[T] = T
  
  type MaybeMockedDeep[T] = T | MockedObjectDeep[T] | MockedFunctionDeep[T]
  
  type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends ts-jest.ts-jest/dist/utils/testing.MockableFunction? K : never}[keyof T] */ js.Any
  
  type MockableFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type MockedFunction[T /* <: MockableFunction */] = MockWithArgs[T] with typingsSlinky.tsJest.tsJestStrings.MockedFunction with TopLevel[T]
  
  type MockedFunctionDeep[T /* <: MockableFunction */] = MockWithArgs[T] with MockedObjectDeep[T]
  
  type MockedObject[T] = MaybeMockedConstructor[T] with typingsSlinky.tsJest.tsJestStrings.MockedObject with TopLevel[js.Any] with TopLevel[T]
  
  type MockedObjectDeep[T] = MaybeMockedConstructor[T] with typingsSlinky.tsJest.tsJestStrings.MockedObjectDeep with TopLevel[js.Any] with TopLevel[T]
  
  type PropertyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends ts-jest.ts-jest/dist/utils/testing.MockableFunction? never : K}[keyof T] */ js.Any
}
