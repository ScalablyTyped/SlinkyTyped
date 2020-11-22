package typingsSlinky.typeorm

import typingsSlinky.std.MethodDecorator
import typingsSlinky.typeorm.transactionOptionsMod.TransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/transaction/Transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  
  def Transaction(): MethodDecorator = js.native
  def Transaction(connectionName: String): MethodDecorator = js.native
  def Transaction(options: TransactionOptions): MethodDecorator = js.native
}
