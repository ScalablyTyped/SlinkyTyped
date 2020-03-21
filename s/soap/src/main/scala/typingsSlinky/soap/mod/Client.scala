package typingsSlinky.soap.mod

import typingsSlinky.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends typingsSlinky.soap.clientMod.Client {
  def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL) = this()
  def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL, endpoint: String) = this()
  def this(wsdl: typingsSlinky.soap.wsdlMod.WSDL, endpoint: String, options: IOptions) = this()
}

