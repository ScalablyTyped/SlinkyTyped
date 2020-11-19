package typingsSlinky.strongLogTransformer.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.strongLogTransformer.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrongLogTransformer extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(options: PartialOptions): ReadWriteStream = js.native
  
  var DEFAULTS: Options = js.native
  
  def cli(args: js.Array[String]): Unit = js.native
}
