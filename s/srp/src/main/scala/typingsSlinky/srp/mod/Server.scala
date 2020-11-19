package typingsSlinky.srp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("srp", "Server")
@js.native
class Server protected () extends js.Object {
  def this(params: Params_, verifier: Buffer, secret2: Buffer) = this()
  
  def checkM1(M1: Buffer): Buffer = js.native
  
  def computeB(): Buffer = js.native
  
  def computeK(): Buffer = js.native
  
  def setA(A: Buffer): Unit = js.native
}
