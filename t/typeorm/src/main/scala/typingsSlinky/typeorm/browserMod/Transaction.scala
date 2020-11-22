package typingsSlinky.typeorm.browserMod

import typingsSlinky.std.MethodDecorator
import typingsSlinky.typeorm.transactionOptionsMod.TransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Transaction")
@js.native
object Transaction extends js.Object {
  
  def apply(): MethodDecorator = js.native
  def apply(connectionName: String): MethodDecorator = js.native
  def apply(options: TransactionOptions): MethodDecorator = js.native
}
