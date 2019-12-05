package typingsSlinky.soap.soapMod

import typingsSlinky.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap", "Client")
@js.native
class Client protected ()
  extends typingsSlinky.soap.libClientMod.Client {
  def this(wsdl: typingsSlinky.soap.libWsdlMod.WSDL) = this()
  def this(wsdl: typingsSlinky.soap.libWsdlMod.WSDL, endpoint: String) = this()
  def this(wsdl: typingsSlinky.soap.libWsdlMod.WSDL, endpoint: String, options: IOptions) = this()
}

