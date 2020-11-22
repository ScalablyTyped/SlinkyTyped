package typingsSlinky.typeorm

import typingsSlinky.std.MethodDecorator
import typingsSlinky.typeorm.optionsTransactionOptionsMod.TransactionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/transaction/Transaction", JSImport.Namespace)
@js.native
object transactionTransactionMod extends js.Object {
  
  def Transaction(): MethodDecorator = js.native
  def Transaction(connectionName: String): MethodDecorator = js.native
  def Transaction(options: TransactionOptions): MethodDecorator = js.native
}
