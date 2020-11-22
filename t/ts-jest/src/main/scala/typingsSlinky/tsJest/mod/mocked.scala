package typingsSlinky.tsJest.mod

import typingsSlinky.tsJest.testingMod.MaybeMocked
import typingsSlinky.tsJest.testingMod.MaybeMockedDeep
import typingsSlinky.tsJest.tsJestBooleans.`false`
import typingsSlinky.tsJest.tsJestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest", "mocked")
@js.native
object mocked extends js.Object {
  
  def apply[T](item: T): MaybeMocked[T] = js.native
  def apply[T](item: T, deep: `false`): MaybeMocked[T] = js.native
  def apply[T](item: T, deep: `true`): MaybeMockedDeep[T] = js.native
}
